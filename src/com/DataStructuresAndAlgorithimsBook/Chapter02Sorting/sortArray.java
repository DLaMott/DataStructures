package com.DataStructuresAndAlgorithimsBook.Chapter02Sorting;

public class sortArray {

    private long[] a;
    private int numberOfElement;

    public sortArray(int max){
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
    // Swap elements in arrays by index
    private void swap(int one, int two){
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
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

    /***
     * The selection sort by comparision is faster than the bubble sort. Selection sorting
     * still holds O(N2) speed. For sorting a min counter is implementing. This minimum
     * value is changed as a smaller element is found. The new smaller element is then pushed
     * to the start of the array.
     */
    public void selectionSort(){

        int min;
        for(int outer = 0; outer < numberOfElement-1; outer++){
            min = outer;
            for(int inner = outer+1; inner < numberOfElement; inner++){
                if(a[inner] < a[min]){
                    min = inner;
                }
                //swap(outer, min);
                long temp = a[outer];
                a[outer] = a[min];
                a[min] = temp;
            }
        }
    }

    /***
     * Insertion sort partially sorts an array up to a marked point. After the marked point
     * is created the array will be compared to elements to the right of the marked point.
     * Element will be inserted into the sorted portion of the array.
     */
    public void insertionSort(){
        for(int out = 1; out < numberOfElement; out++){ //out is dividing line
            long temp = a[out]; //remove marked item
            int inner = out; //start shift at out

            while (inner>0 && a[inner-1] >= temp){ //until one element is smaller
                a[inner] = a[inner-1]; //shift item to the right
                --inner; // go left one position
            }
            a[inner] = temp; //insert marked item

        }
    }

}
