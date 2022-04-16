package com.DataStructuresAndAlgorithimsBook.Chapter07AdvancedSorting;

//QuickSort is a Divide and Conquer algorithm. It picks an element as pivot and partitions the given array around the
//        picked pivot. There are many different versions of quickSort that pick pivot in different ways.
//
//        Always pick first element as pivot.
//        Always pick last element as pivot (implemented below)
//        Pick a random element as pivot.
//        Pick median as pivot.
//        The key process in quickSort is partition(). Target of partitions is, given an array and an element x of array
//        as pivot, put x at its correct position in sorted array and put all smaller elements (smaller than x) before x,
//        and put all greater elements (greater than x) after x. All this should be done in linear time.

import java.util.Arrays;

public class quickSort {

    public int[] sort(int[] array) {
        return Arrays.stream(sort(Arrays.stream(array).boxed().toArray(Integer[]::new)))
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public long[] sort(long[] array) {
        return Arrays.stream(sort(Arrays.stream(array).boxed().toArray(Long[]::new)))
                .mapToLong(Long::longValue)
                .toArray();
    }

    public double[] sort(double[] array) {
        return Arrays.stream(sort(Arrays.stream(array).boxed().toArray(Double[]::new)))
                .mapToDouble(Double::doubleValue)
                .toArray();
    }

    public <T extends Comparable<T>> T[] sort(T[] array) {
        doSort(array, 0, array.length - 1);
        return array;
    }

    private <T extends Comparable<T>> void doSort(T[] array, int left, int right) {
        if (left < right) {
            int pivot = partition(array, left, right);
            doSort(array, left, pivot - 1);
            doSort(array, pivot, right);
        }
    }

    private <T extends Comparable<T>> int partition(T[] array, int left, int right) {
        int mid = (left + right) / 2;
        T pivot = array[mid];
        while (right >= left) {
            while (array[left].compareTo(pivot) < 0) {
                left++;
            }
            while (pivot.compareTo(array[right]) < 0) {
                right--;
            }
            if (right >= left) {
                T swap = array[left];
                array[left] = array[right];
                array[right] = swap;
                ++left;
                --right;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        quickSort quickSort = new quickSort();

        int[] array = {231, 54, 12, 1, 54, -65, 86, -1};
        System.out.println("Old First: " + Arrays.toString(array));
        System.out.println("New First: " + Arrays.toString(quickSort.sort(array)));

        String[] stringArray = {"f", "c", "a", "d", "b", "e", "g"};

        System.out.println("Old Second: " + Arrays.toString(stringArray));
        System.out.println("New Second: " + Arrays.toString(quickSort.sort(stringArray)));
    }
}
