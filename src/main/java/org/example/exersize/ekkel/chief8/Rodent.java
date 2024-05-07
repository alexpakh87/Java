package org.example.exersize.ekkel.chief8;


class Hamster extends Rodent {
    void say() {
        System.out.println("pi hamster");
    }

    void eat() {
        System.out.println(" hamster eat apple ");
    }
}

class Mouse extends Rodent {
    void say() {
        System.out.println("pi mouse");
    }

    void eat() {
        System.out.println(" mouse eat mushrooms ");
    }
}

class Gopher extends Rodent {
    void say() {
        System.out.println("pi gopher ");
    }

    void eat() {
        System.out.println(" Gopher eat grass");
    }
}

abstract public class  Rodent {

   // abstract void test();
    void say() {
        System.out.println("pi");
    }

    void eat() {
        System.out.println(" rodent eat all");
    }

    public static void main(String[] args) {
        Rodent[] rodents = {new Gopher(), new Hamster(), new Mouse()};
        for (Rodent show:rodents) {
            show.say();
            show.eat();
        }

    }
}
