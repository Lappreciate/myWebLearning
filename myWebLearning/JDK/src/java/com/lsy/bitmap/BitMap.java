package com.lsy.bitmap;


import java.util.BitSet;

public class BitMap {

    public static void main(String[] args) {

        BitSet set = new BitSet(64);
        set.set(3,true);
        set.get(69);


//        for(int i=0;i<100;i++){
//            System.out.println(set.get(i));
//        }

        System.out.print(1L << 64);
    }
}
