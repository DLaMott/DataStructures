package com.dataStructures.Stack;

/***
 * A Stack is a data structure allowing access only to one data item( the last item inserted).
 *  Storage is considered Last-In-First-Out.
 *  Pushing is the process of adding an item to the stack.
 *  Popping is removing an item from the stack.
 *  Peek looks at the top item in the stack without removal.
 */
public class StackIntro {
    private int maxize;
    private long[] stackArray;
    private int top;

    public StackIntro(int size){
        maxize = size;
        stackArray = new long[maxize];
        top = -1;
    }

    public void push(long j){
        stackArray[++top] = j;
    }

    public long pop(){
        return stackArray[top--];
    }

    public long peek(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return top == maxize -1;
    }

}
