package com.DataStructuresAndAlgorithimsBook.Chapter06Recursion.Triangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle {
    static int theNumber;

    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number: ");
        theNumber = getInt();
        int theAnswer = triangle(theNumber);
        System.out.println("Triangle = " + theAnswer);
    }

    public static int triangle(int n){
        //Base case where n == 1 ending recursion
        if(n==1){
            return 1;
        }else{
            // Recursion begins
            return (n + triangle(n-1));
        }
    }

    public static int getInt() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        int number = Integer.parseInt(s);
        return number;
    }


}
