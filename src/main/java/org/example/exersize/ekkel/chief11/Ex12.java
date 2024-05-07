package org.example.exersize.ekkel.chief11;

import java.util.*;

public class Ex12 {
    List<String> list = Arrays.asList("A", "B", "C", "D", "E");

    ListIterator<String> listIterator = list.listIterator();
    ListIterator<String>reverse=list.listIterator(5);
void foo() {
    while (listIterator.hasNext()) {
        String element = listIterator.next();
        listIterator.set(element);
    }

    while (reverse.hasPrevious()) {
        System.out.println(list);
        String element = listIterator.previous();

        System.out.println(element);
        System.out.println(list);
        }
    }


    public static void main(String[] args) {
        Ex12 ex12 = new Ex12();
        ex12.foo();
    }


}
