package com.DataStructuresAndAlgorithimsBook.Chapter05LinkedList.DoubleLinkedList;

public class DoubleLink {

    public long dData;
    public DoubleLink next;
    public DoubleLink previous;

    public DoubleLink(long d){
        dData = d;
    }

    public void displayLink(){
        System.out.print(dData + " ");
    }
}
