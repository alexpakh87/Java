package org.example.exersize.ekkel.chief5;

public class Arrays {
    public Arrays() {
    }

    Arrays(String st) {
        System.out.println(st);
        Arrays[] arrays = new Arrays[]{new Arrays(), new Arrays(), new Arrays()};
        System.out.println(java.util.Arrays.toString(arrays));
    }

    public static void main(String[] args) {
        String[] str = new String[]{"one", "two", "three", "four", "five"};

        for (String s : str) {
            System.out.println(s);
        }
            Arrays arrays = new Arrays("test");
    }
}
