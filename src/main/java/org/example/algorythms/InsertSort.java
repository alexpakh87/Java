package org.example.algorythms;

public class InsertSort {


    private static int[] array = new int[]{
            23, 2344, 33, 12, 0, -33, -124, 55, 14, 17, 435, 77, 56, -145, 99
    };

    public static void showNoSortedArray() {
        System.out.println("no sorted array:");
        for (Integer noSorted : array)
            System.out.print(noSorted + "   ");
        System.out.println("\n");
    }

    public static void insertionSort() {


        int in;
        int out;

        for (out = 1; out < array.length; out++) // out - разделительный маркер
        {
            int temp = array[out]; // Скопировать помеченный элемент
            in = out; // Начать перемещения с out

            while (in > 0 && array[in - 1] >= temp) // Пока не найден меньший элемент
            {
                array[in] = array[in - 1]; // Сдвинуть элемент вправо
                --in; // Перейти на одну позицию влево
            }
            array[in] = temp; // Вставить помеченный элемент
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
        insertionSort();
        displaySortedArray();

    }
}




