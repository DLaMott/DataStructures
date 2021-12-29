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

    private void swap(int one, int two){
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    public void bubbleSort(){
        for(int out = numberOfElement-1; out > 1; out--){
            for(int in = 0; in < out; in++){
                if(a[in] > a[in+1]){
                    swap(in, in +1);
                }
            }
        }
    }

}
