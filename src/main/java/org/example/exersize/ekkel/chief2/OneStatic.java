package org.example.exersize.ekkel.chief2;

public class OneStatic {

    static int x = 2;

    static void view() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        OneStatic one = new OneStatic();
        OneStatic two = new OneStatic();
        System.out.println(one.x);
        System.out.println(two.x = 3);
        OneStatic.view();

    }
}
