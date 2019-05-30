package com.lsy.algorithm.sort;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr = new int[]{1,8,5,9,3,0,100,2,-1,7};

        Qsort(arr,0,arr.length-1);
        for(int a :arr){
            System.out.print(a+" ");
        }

    }

    public static void Qsort(int[] arr,int start,int end){

        if(start>=end){
            return;
        }
        int low = start;
        int high = end;
        int key = arr[low];

        while(low<high){
            while(low<high&&key<arr[high]){
                high--;
            }
            arr[low] = arr[high];

            while(low<high&&key>arr[low]){
                low++;
            }
            arr[high]=arr[low];
        }
        arr[low]= key;
        Qsort(arr,start,low-1);
        Qsort(arr,low+1,end);
    }

}
