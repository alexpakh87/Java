package org.example.exersize.ekkel.chief15;

import java.util.Date;

public class TwoTuple<A, B> {
    private A a;
    private B b;

    public TwoTuple() {
    }

    public TwoTuple(A a, B b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "TwoTuple{" +
                " a = " + a + " , " + b + " " +
                '}';
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> string = new TwoTuple<>("test", 33);
        TwoTuple<Date, Double> two = new TwoTuple<>(new Date(), 0.333);
        System.out.println(string);
        System.out.println(two);
    }
}
