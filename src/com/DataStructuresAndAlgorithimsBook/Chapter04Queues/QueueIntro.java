package com.DataStructuresAndAlgorithimsBook.Chapter04Queues;

/***
 * Queues are a data structure offering First in First out data retrieval.
 *
 * This class serves to create a basic queue and provides methods for searching and viewing
 * data within a queue.
 */
public class QueueIntro {

    private int maxSize;
    private long[] queueArray;
    private int front;
    private int rear;
    private int numberOfItems;

    public QueueIntro(int size){
        maxSize = size;
        queueArray = new long[maxSize];
        front = 0;
        rear = -1;
        numberOfItems = 0;
    }

    public void insert(long l){
        if(rear == maxSize - 1) {
            rear = -1;
        }
            queueArray[++rear] = l;
            numberOfItems++;

    }
    public long remove(){
        long temp = queueArray[front++];
        if(front == maxSize){
            front = 0;
        }
        numberOfItems--;
        return temp;
    }
    public long peekFront(){
        return queueArray[front];
    }
    public boolean isEmpty(){
        return (numberOfItems==0);
    }
    public boolean isFull(){
        return (numberOfItems == maxSize);
    }
    public int size(){
        return numberOfItems;
    }


}
