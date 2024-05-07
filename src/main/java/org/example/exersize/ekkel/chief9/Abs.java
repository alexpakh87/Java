package org.example.exersize.ekkel.chief9;

public abstract class Abs {
    static  void f2(Abs abs) {

    }
}

class SubAbs extends Abs {
    void f1() {

    }


    public static void main(String[] args) {
        SubAbs subAbs = new SubAbs();
        SubAbs.f2(subAbs);
        subAbs.f1();

    }
}
