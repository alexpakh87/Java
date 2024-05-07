package org.example.exersize.ekkel.chief8;

//: polymorphism/music3/Music3.java
// An extensible program.


import java.util.Random;

class Instrument {
    void play(Note n) {
        System.out.println("Instrument.play() " + n);
    }

    String what() {
        return "Instrument";
    }

    void adjust() {
        System.out.println("Adjusting Instrument");
    }

    @Override
    public String toString() {
        return what();
        //return super.toString();
    }
}

class Wind extends Instrument {
    void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    String what() {
        return "Wind";
    }

    void adjust() {
        System.out.println("Adjusting Wind");
    }
}

class Percussion extends Instrument {
    void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    String what() {
        return "Percussion";
    }

    void adjust() {
        System.out.println("Adjusting Percussion");
    }
}

class Stringed extends Instrument {
    void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    String what() {
        return "Stringed";
    }

    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}

class KeyBoard extends Instrument {
    void play(Note n) {
        System.out.println("KeyBoard.play() " + n);
    }

    void adjust() {
        System.out.println("Adjusting KeyBoard");
    }

    String what() {
        return "Keyboard";
    }

}

class Brass extends Wind {
    void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

    void adjust() {
        System.out.println("Adjusting Brass");
    }
}

class Woodwind extends Wind {
    void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    String what() {
        return "Woodwind";
    }
}

public class Music3 {
    // Doesn't care about type, so new types
    // added to the system still work right:
    public static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e)
            tune(i);
    }

    Random random = new Random();
   // int r = random.nextInt(6);

    Instrument orchestra2() {

        switch (random.nextInt(7)) {
            default:
            case 1:
                return new KeyBoard();
            case 2:
                return new Brass();
            case 3:
                return new Wind();
            case 4:
                return new Stringed();
            case 5:
                return new Percussion();
            case 6:
                return new Woodwind();
        }

    }




    public static void main(String[] args) {

        Music3 music3 = new Music3();
        // Upcasting during addition to the array:
        Instrument[] orchestra2 = new Instrument[9];
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind(),
                new KeyBoard()
        };
        tuneAll(orchestra);
        for (Instrument info : orchestra) {
            System.out.println(info);
        }
        for (int i = 0; i < orchestra2.length; i++) {
            orchestra2[i] = music3.orchestra2();
            System.out.println(orchestra2[i]);
        }
    }
} /* Output:
Wind.play() MIDDLE_C
Percussion.play() MIDDLE_C
Stringed.play() MIDDLE_C
Brass.play() MIDDLE_C
Woodwind.play() MIDDLE_C
*///:~
