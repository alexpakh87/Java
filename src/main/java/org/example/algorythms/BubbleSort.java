package org.example.algorythms;

public class BubbleSort {


    private static int[] array = new int[]{
            23, 2344, 33, 12, 0, -33, -124, 55, 14, 17, 435, 77, 56, -145, 99
    };

    public static void showNoSortedArray() {
        System.out.println("no sorted array:");
        for (Integer noSorted : array)
            System.out.print(noSorted + "   ");
        System.out.println("\n");
    }

    public static void bubbleSort() {
        int out;
        int index;
        for (out = array.length - 1; out > 1; out--) {

            for (index = 0; index < out; index++) {
                if (array[index] > array[index + 1]) {
                    /* swap elements*/
                    int swap = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = swap;
                }
            }

        }

    }

    public static void displaySortedArray() {

        System.out.println("sorted array:");
        for (Integer sortArray : array) {
            System.out.print(sortArray + "   ");

        }
    }


    public static void main(String[] args) {
        showNoSortedArray();
        BubbleSort.bubbleSort();
        displaySortedArray();

    }
}
