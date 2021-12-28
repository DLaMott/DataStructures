package com.dataStructures.Arrays;

public class OrderedArray {
    private long[] a;
    private int numberOfElements;

    public OrderedArray(int max) {
        a = new long[max];
        numberOfElements = 0;
    }

    public int size() {
        return numberOfElements;
    }

    // Binary search method to find a value
    public int find(long searchKey) {
        int lowerBound = 0; // First element in the array
        int upperBound = numberOfElements - 1; // Last element of the array
        int currentIndex;

        while (true) {
            currentIndex = (lowerBound + upperBound) / 2; // Set to the midway of the array
            if (a[currentIndex] == searchKey)
                return currentIndex;              // found it
            else if (lowerBound > upperBound)
                return numberOfElements;             // can't find it
            else                          // divide range
            {
                if (a[currentIndex] < searchKey)
                    lowerBound = currentIndex + 1; // it's in upper half
                else
                    upperBound = currentIndex - 1; // it's in the lower half
            }
        }
    }


    public void insert(long value) {
        int j;
        for (j = 0; j < numberOfElements; j++)        // find where it goes
            if (a[j] > value)            // (linear search)
                break;
        for (int k = numberOfElements; k > j; k--)    // move bigger ones up
            a[k] = a[k - 1];
        a[j] = value;                  // insert it
        numberOfElements++;

    }

    public boolean delete(long value) {
        int j = find(value);
        if (j == numberOfElements) {                  // can't find it
            return false;
        } else {                           // found it
            for (int k = j; k < numberOfElements; k++) // move bigger ones down
                a[k] = a[k + 1];
            numberOfElements--;                   // decrement size
            return true;
        }
    }  // end delete()

    public void display() {
        for (int j = 0; j < numberOfElements; j++) {
            System.out.println(a[j]);
        }
    }
}
