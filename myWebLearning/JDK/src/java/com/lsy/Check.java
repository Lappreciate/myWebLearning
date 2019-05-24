package com.lsy;


import java.util.*;

public class Check{

    private final static double REPEAT_RATE = 0.6f;
    // you can add your data-structure here
    //private static List<Map<Character, Integer>> standardDocFeatureList = null;
    // you must rewrite this function
    private static List<BitSet> standardDocFeatureList = null;




    public void init(Vector<String> docList){
        standardDocFeatureList = new LinkedList<>();
        int docListSize = docList.size();
        for(int i = 0; i < docListSize ; i++){
            String doc = docList.get(i);
            if(doc != null && doc.length() > 0){
                BitSet set = null;
                set = getDocFeature(doc);
                standardDocFeatureList.add(set);
            }
        }
    }
    //my function
    private BitSet getDocFeature(String doc){
        BitSet bitSet = new BitSet();
        int docSize = doc.length();
        for(int i = 0 ; i < docSize ; i++){
            System.out.print(" "+(int)doc.charAt(i));
            bitSet.set((int)doc.charAt(i),true);
        }
        return bitSet;
    }

    // you must rewrite this function
    // checking
    // IN tiezi : doc string
    // OUT : 1=>hit doc
    //       0=>miss doc
    public int check(char [] info , int  infoLen){
        Set<Character> tmpDocFeatureSet = new HashSet<>();
        for(int i = 0 ; i  < infoLen ; i ++ ){
            tmpDocFeatureSet.add(info[i]);
        }
        int standardDocListSize = standardDocFeatureList.size();

        for(int i = 0 ; i < standardDocListSize ; i++){
            double repeatCount = 0;
            BitSet standardBitSet = standardDocFeatureList.get(i);
            double standardDocFeatureMapSize = (double)standardBitSet.cardinality();
            for(Character c : tmpDocFeatureSet){
                if(standardBitSet.get((int)c)){
                    repeatCount++;
                    if(repeatCount/standardDocFeatureMapSize>=REPEAT_RATE) return 1;
                }
            }
        }
        return 0;
    }

//    public static void main(String[] args) {
//        BitSet bitSet = new BitSet();
//        bitSet.set(1,true);
//        bitSet.set(2,true);
//        bitSet.set(3,true);
//        for(int i=0;i<4;i++){
//            System.out.println(bitSet.get(i));
//        }
//        System.out.print(bitSet.cardinality());
//    }
}


