package org.example.exersize.ekkel.class7;

public class ThirdClass extends FirstClass {
    ThirdClass() {
        super(1);
        System.out.println("third class constructor");
    }
    SecondClass secondClass = new SecondClass(2);

    public static void main(String[] args) {
       // FirstClass firstClass = new FirstClass();
        ThirdClass firdClass = new ThirdClass();
    }

}
