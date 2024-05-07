package org.example.algorythms;

public class SelectSort {


    private static int[] array = new int[]{
            23, 2344, 33, 12, 0, -33, -124, 55, 14, 17, 435, 77, 56, -145, 99
    };

    public static void showNoSortedArray() {
        System.out.println("no sorted array:");
        for (Integer noSorted : array)
            System.out.print(noSorted + "   ");
        System.out.println("\n");
    }

    public static void selectSort() {
        int out;
        int index;
        int min;// будет храниться индекс внешнего массива с минимальным значением элемента при проходе внутреннего цикла
        for (out = 0; out < array.length - 1; out++) {

            for (index = out + 1; index < array.length; index++) {
                min = out;
                if (array[index] < array[min]) {

                    /* swap elements минимальный элемент перемещается в начало сортированного массива*/
                    int swap = array[min];
                    array[min] = array[index];
                    array[index] = swap;
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

        selectSort();

        displaySortedArray();

    }
}


