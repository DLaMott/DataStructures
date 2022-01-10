package com.DataStructuresAndAlgorithimsBook.Chapter03Stacks.ReversalExample;

public class Reverser {
    private String input;
    private String output;

    public Reverser(String in){
        input = in;
    }

    public String doReversal(){
        int stackSize = input.length();
        Stack stack = new Stack(stackSize);

        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            stack.push(c);
        }
        output ="";
        while (!stack.isEmpty()){
            char ch = stack.pop();
            output = output + ch;
        }
        return output;
    }
}
