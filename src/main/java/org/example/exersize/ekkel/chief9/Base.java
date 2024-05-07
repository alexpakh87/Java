package org.example.exersize.ekkel.chief9;

abstract class Base {
    abstract void print();

    public Base() {
        print();
    }

    public static void main(String[] args) {
        SubBase subBase = new SubBase();
        subBase.print();
    }
}

class SubBase extends Base {
    @Override
    void print() {
        int i = 1;
        System.out.println(i);
    }
}

class SubBase2 extends Base {
    @Override
    void print() {
        int i = 2;
        System.out.println(i);
    }
}
