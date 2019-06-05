package com.lsy.algorithm.sort;

public class HeapSort {
    private int[] arr;
    private int length;

    public void adjustHeap(int i,int[] arr,int length){
        for(int k = 2*i+1;k < length;k = 2*k+1){
            if(k+1<length && arr[k]<arr[k+1]){
                k++;
            }
            if(arr[i]<arr[k]){
                swap(arr,i,k);
                i=k;
            }else {
                break;
            }
        }
    }

    public void heapSort(){
        //建立建堆
        for(int i = length/2-1; i>=0; i--){
            adjustHeap(i,arr,length);
        }
        //通过多次交换arr中0和j位置的值进行排序
        for(int j = length-1; j>=1 ;j--){
            swap(arr,0,j);
            adjustHeap(0,arr,j);
        }
    }

    private void swap(int arr[],int a,int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public HeapSort(int[] arr, int length){
        this.arr=arr;
        this.length=length;
        length = this.length;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}

class Test{
    public static void main(String[] args) {
        int[] arr = new int[]{9,32,4,1,6,7,9,1,1,100,-1};
        HeapSort sort = new HeapSort(arr,arr.length);
        sort.heapSort();
        for (int a : arr){
            System.out.print(" "+a);
        }

    }
}

