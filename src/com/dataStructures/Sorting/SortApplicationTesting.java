package com.dataStructures.Sorting;

public class SortApplicationTesting {

    public static void main(String[] args){
        sortArray array = new sortArray(10);

        array.insert(12);
        array.insert(0);
        array.insert(23);
        array.insert(2);
        array.insert(30);
        array.insert(9);
        array.insert(33);
        array.insert(25);
        array.insert(59);
        array.insert(38);

        array.display();
        System.out.println("___________________");
        System.out.println("Calling bubble sort");
        //array.bubbleSort();
        array.selectionSort();
        array.display();

    }
}
