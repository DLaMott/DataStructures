package com.DataStructuresAndAlgorithimsBook.Chapter05LinkedList.DoubleLinkedList;

public class DoubleLinkApplication {



    public static void main(String[] args) {
        DoubleLinkedList theDoubleList = new DoubleLinkedList();

        // Insert first
        theDoubleList.insertFirst(10);
        theDoubleList.insertFirst(12);
        theDoubleList.insertFirst(15);

        // Insert last
        theDoubleList.insertLast(40);
        theDoubleList.insertLast(50);
        theDoubleList.insertLast(60);

        // Display
        theDoubleList.displayForward();
        theDoubleList.displayBackward();

        theDoubleList.insertAfter(10,13);
        theDoubleList.insertAfter(16,15);

        theDoubleList.displayBackward();
    }
}
