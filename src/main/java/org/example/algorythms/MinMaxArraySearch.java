package org.example.algorythms;

public class MinMaxArraySearch {

    int[] array = new int[]{33, 22, 234, 345, 22, 0, -4, -45, 11,2,5};

    int min;
    int max;

    public void searchMin() {
        min = array[0];
        for (int i = 0; i < array.length - 1; i++) {

            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("\n");
        System.out.println("min= " + min + " ");
    }

    public void searchMax() {
        max = array[0];
        for (int i = 0; i < array.length - 1; i++) {

            if (max < array[i]) {
               max = array[i];
            }
        }
        System.out.println("\n");
        System.out.println("max= " + max + " ");
    }

    public void display() {

        System.out.print("\n");
        for (Integer arr : array) {

            System.out.print(arr + "  ");
        }
    }

    public static void main(String[] args) {

        MinMaxArraySearch search = new MinMaxArraySearch();

        search.display();
        search.searchMin();
        search.searchMax();

    }
}
