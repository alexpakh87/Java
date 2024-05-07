package org.example.exersize.ekkel.loop4;

import java.util.Random;

public class Loop {
    public static void main(String[] args) {
        Random random = new Random();
        int i = 1;
        while (i < 1000) {
            System.out.println(i);

            if (i==99) break;
            i++;

        }


        for (int j = 1; j <= 25; j++) {
            int a = random.nextInt(100);
            int b = random.nextInt(100);

            if (a > b) {
                System.out.println(a + " (a больше b) " + b);
            } else if (a < b) {
                System.out.println(a + " (a меньше b) " + b);
            } else if (a == b) {
                System.out.println(a + "(a равно b)" + b);
            }

        }

    }

}





