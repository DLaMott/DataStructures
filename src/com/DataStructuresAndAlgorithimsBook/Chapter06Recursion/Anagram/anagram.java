package com.DataStructuresAndAlgorithimsBook.Chapter06Recursion.Anagram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/***
 * Using recursion we can easily calculate the possible anagrams for a word.
 */
public class anagram {

    static int size;
    static int count;
    static char[] arrChar = new char[100];

    public static void main(String[] args) throws IOException {

        System.out.print("Enter a word: ");
        String input = getString();
        size = input.length();
        count = 0;
        for(int j = 0; j < size; j++){
            arrChar[j] = input.charAt(j);
        }
        doAnagram(size);
    }

    /***
     * Performs recursion on the char array
     * @param newSize The size of the array
     */
    public static void doAnagram(int newSize){
        if(newSize == 1){
            return;
        }
        for(int j = 0; j < newSize; j++){
            // recursive call
            doAnagram(newSize-1);
            if(newSize == 2){
                displayWord();
            }
            rotate(newSize);
        }
    }

    /***
     * Rotates the chars within the array one position to the left
     * @param newSize The size of the array
     */
    public static void rotate(int newSize){
        int j;
        int position = size - newSize;
        char temp = arrChar[position];

        for(j = position+1; j <size; j++){
            arrChar[j-1] = arrChar[j];
        }
        arrChar[j-1] = temp;
    }

    public static void displayWord(){
        if(count < 99){
            System.out.print(" ");
        }
        if(count < 9){
            System.out.print(" ");
        }
        System.out.print(++count + " ");

        for (int j = 0; j < size; j++){
            System.out.print(arrChar[j]);
        }
        System.out.print("   ");
        System.out.flush();

        if(count%6 == 0){
            System.out.println("");
        }
    }

    /***
     *
     * @return s The string undergoing anagramming
     * @throws IOException on invalid andor null entry
     */
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }


}
