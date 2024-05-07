package org.example.exersize.ekkel.class7;

public class Amphibian {
    void someFoo() {

    }

    void swim() {
        System.out.println("плавает");
    }

    void breathes() {
        System.out.println("дышит под водой");
    }

    static void transformation(Amphibian amphibian) {
        amphibian.swim();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();

        Amphibian.transformation(frog);
        frog.breathes();
        frog.swim();

    }
}
