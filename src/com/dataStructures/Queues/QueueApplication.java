package com.dataStructures.Queues;

public class QueueApplication {

    public static void main(String[] args){
        QueueIntro queue = new QueueIntro(5);
        // Insert items into the queue if it is not full
        for(int i = 0; i < 5; i ++){
            if(!queue.isFull()){
                queue.insert(i);
            }
        }
        // Remove items from the queue in a FIFO manner then print to the console
        while (!queue.isEmpty()){
            long n = queue.remove();
            System.out.println(n);
        }
    }
}
