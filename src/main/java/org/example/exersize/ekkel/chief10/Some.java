package org.example.exersize.ekkel.chief10;

interface Anonym {

    void f();

    // void f2(String s);

    Anonym anonym = () -> System.out.println("вложенный анонимный класс в интерфейсе замененный лямбда выражением");
//    Anonym anonym2 = new Anonym() {
//
//        public void f() {
//            System.out.println("anonym class");
//        }
//
//    };

}

public class Some {

    void foo() {
        Anonym anonym1 = () -> System.out.println("ano");
        anonym1.f();
    }

    private int x = 1;// в статических вложенных классах недоступен

    void f1() {
        System.out.println("some class");

    }


    static class InnerStatic {
        Some some = new Some();
        static int i = 2;
        static int a = InnerStatic2.y;


        static void f() {
            System.out.println("все поля и методы должны быть статичными" + a);
        }
    }

    static class InnerStatic2 {
        static int y = 3;
    }

    class SimpleInner {
        void f() {
            System.out.println(x);
            System.out.println(InnerStatic.i = 3);
        }
    }

    private class InnerPrivate {

    }


    public static void main(String[] args) {
        //   InnerStatic.f();
        //Anonym.anonym.f();
        Some some = new Some();
        //some.f();
        some.foo();
//        Anonym anonym = () -> System.out.println("анонимный класс" );
//        Anonym anonym1 = () -> System.out.println("ano");
//        anonym.f();
//        anonym1.f();
    }

}
