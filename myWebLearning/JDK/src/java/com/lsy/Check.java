package com.lsy;


import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class Check{

    private final static double REPEAT_RATE = 0.6f;
    // you can add your data-structure here
    private static List<Map<Character, Integer>> standardDocFeatureList = null;
    // you must rewrite this function
    public void init(Vector<String> docList){
        standardDocFeatureList = new LinkedList<>();
        int docListSize = docList.size();
        for(int i = 0; i < docListSize ; i++){
            String doc = docList.get(i);
            if(doc != null && doc.length() > 0){
                Map docFeatureMap = null;
                docFeatureMap = getDocFeature(doc);
                standardDocFeatureList.add(docFeatureMap);
            }
        }
    }
    //my function
    private Map<Character,Integer> getDocFeature(String doc){
        Map docFeatureMap = new HashMap<Character,Integer>();
        int docSize = doc.length();
        for(int i = 0 ; i < docSize ; i++){
            Character key = doc.charAt(i);
            docFeatureMap.put(key,0);
        }
        return docFeatureMap;
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
            Map standardDocFeatureMap = standardDocFeatureList.get(i);
            double standardDocFeatureMapSize = (double)standardDocFeatureMap.size();
            for(Character c : tmpDocFeatureSet){
                if(standardDocFeatureMap.containsKey(c)){
                    repeatCount++;
                    if(repeatCount/standardDocFeatureMapSize>=REPEAT_RATE) return 1;
                }
            }
        }
        return 0;
    }
}


