package org.example.exersize.ekkel.chief11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reflection {
    void test() {

    }

    ;
}

class A extends Reflection {

    @Override
    public void test() {
        System.out.println("A");
    }
}

class B extends Reflection {

    @Override
    public void test() {
        System.out.println("B");
    }
}

class C extends Reflection {

    @Override
    public void test() {
        System.out.println("C");
    }
}

class Reflec {

    static void foo(Reflection reflection) {
        reflection.test();
    }

    public static void main(String[] args) {
        List<Reflection> ref = new ArrayList<>();
        List<Reflection> ref1 = Arrays.asList(new A(), new B(), new C());
        Reflection[] ref2 = {new A(), new B(), new C()};

        ref.add(new A());
        ref.add(new B());
        ref.add(new C());

        for (int i = 0; i < ref.size(); i++) {

            ref.get(i).test();

            ref1.get(i).test();
            ref2[i].test();
            Reflec.foo(ref.get(i));
        }
        Reflection a = new A();
        Reflec.foo(a);
        //refA.test();
    }

}



