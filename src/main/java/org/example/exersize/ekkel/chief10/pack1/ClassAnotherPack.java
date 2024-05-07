package org.example.exersize.ekkel.chief10.pack1;

import org.example.exersize.ekkel.chief10.Inter;

public class ClassAnotherPack {
    private int i = 1;

    void t() {

    }

    private int f(int n) {
        return n;
    }

    void getObjIC() {
        InterClass interClass = new InterClass();
        interClass.change();
    }

    void g() {

    }

    private class InterClass implements Inter {
        int pub = 9;
        private int test = 8;

        void change() {
            System.out.println(i);
            //System.out.println(n);
            i = 2;
            int n1 = f(9);
            System.out.println(i);
            System.out.println(n1);
        }

    }

    public static void main(String[] args) {
        ClassAnotherPack cl = new ClassAnotherPack();
        cl.getObjIC();
    }
}
