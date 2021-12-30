package com.dataStructures.Sorting;

public class BubbleSortArray {

    private long[] a;
    private int numberOfElement;

    public BubbleSortArray(int max){
        a = new long[max];
        numberOfElement = 0;
    }

    public void insert(long value){
        a[numberOfElement] = value;
        numberOfElement++;
    }

    public void display(){
        for(int i = 0; i < numberOfElement; i++){
            System.out.println(a[i] + " ");
        }
    }

    /***
     * Bubble sort is implemented by starting a sort where the smallest element is placed at the
     * start of an array and the largest is placed at the end a.length-1;. The outer loop starts
     * at the end of an array if items are greater than OUT will be sorted. The inner loop starts
     * at the beginning of an array exiting when out is reached. in and in+1 are compared and
     * swapped if "in" is greater than "in+1". Bubble swap is slow and inefficient for large
     * arrays. O(n2) speed.
     */
    public void bubbleSort(){

        for(int out = numberOfElement-1; out > 1; out--){
            for(int in = 0; in < out; in++){
                if(a[in] > a[in+1]){
                    long temp = a[in];
                    a[in] = a[in+1];
                    a[in+1] = temp;
                }
            }
        }
    }

}
