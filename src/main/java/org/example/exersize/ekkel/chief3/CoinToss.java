package org.example.exersize.ekkel.chief3;

import java.util.Random;

public class CoinToss {
    static boolean toss(int a) {
        if (a == 0) {
            System.out.println("решка");
            return false;
        } else {
            System.out.println("орел");
            return true;
        }
    }


    public static void main(String[] args) {
        Random rand = new Random();
        int r = rand.nextInt(2);
        CoinToss.toss(r);
        System.out.println();
    }
}
