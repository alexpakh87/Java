package org.example.exersize.ekkel.string13;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class StringMethods {


    public static void main(String[] args) {
        
        String testMethods = "Test methods string";
        String testMethods2 = "Test methods string";
        String testMethods3 = "Test methods string false";
        String chars = "hello string";
        String ch = "s";
        System.out.println(testMethods.length());
        System.out.println(testMethods.equals(testMethods2));
        System.out.println(testMethods.equals(testMethods3));
        System.out.println(testMethods.charAt(2));
        System.out.println(testMethods.getBytes(StandardCharsets.UTF_8));
        System.out.println(testMethods.compareTo(testMethods3));
        System.out.println(testMethods.toLowerCase(Locale.ROOT));
        System.out.println("toUpperCase: "+testMethods.toUpperCase()+" -toUpperCase");
        System.out.println(testMethods.codePointAt(0));
        System.out.println(testMethods.contains(ch)+" -contains");

    }
}
