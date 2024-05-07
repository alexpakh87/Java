package org.example.exersize.ekkel.loop4;

public class Fibonacci {
    public static void fibonacciNumber(int sizeArray) {
        int array[] = new int[sizeArray];
        array[0] = 1;
        array[1] = 1;

        for (int i = 2; i < array.length - 1; i++) {
            array[i] = array[(i - 1)] + array[(i - 2)];
            System.out.println(array[i]);

        }
    }

    public static void main(String[] args) {
        Fibonacci.fibonacciNumber(47);
    }
}
