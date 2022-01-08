package com.dataStructures.Stack;

/***
 * Method utilizes the {@link StackIntro} method to showcase the basic uses of a stack.
 */
public class StackApplication {
    public static void main(String[] args){

        // create a new stack
        StackIntro stack = new StackIntro(10);

        // Push items into the stack
        for(int i = 0; i < 10; i++){
            stack.push(i);
        }
        // While the stack is not empty print the values inside
        while (!stack.isEmpty()){
            long value = stack.pop();
            System.out.println(value);

        }


    }
}
