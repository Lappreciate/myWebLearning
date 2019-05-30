package com.lsy.algorithm.sort;


/**
 * 二分查找
 */
public class PartFind {

    public static void main(String[] args) {
        int[] arr = new int[]{1,3,13,34,456,899,10000};
        System.out.println(partitionFind(arr,34));

    }

    public static int partitionFind(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int mid = (end+start)/2;
        while(start<=end){
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
            mid =(end+start)/2;
        }
        return -1;
    }
}

