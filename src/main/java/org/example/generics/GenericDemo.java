package org.example.generics;

import java.util.logging.Logger;

public class GenericDemo<T> {


    public <S extends Number, X extends Number> boolean gener(S s, X x) {
        boolean eq = s == x;
        System.out.println(eq);
        return eq;
    }

    public void demoGeneric(GenericDemo<?> gen) {

        System.out.println(gen.getClass().getName());

    }

    public static void main(String[] args) {

        GenericDemo g = new GenericDemo();
        GenericDemo<Integer> genericDemoInteger = new GenericDemo<>();
        GenericDemo<String> genericDemoString = new GenericDemo<>();
        genericDemoInteger.demoGeneric(genericDemoInteger);
        genericDemoInteger.demoGeneric(genericDemoString);
        genericDemoString.demoGeneric(genericDemoString);

        genericDemoString.gener(2, 3);
        genericDemoInteger.gener(2, 2);


    }
}
