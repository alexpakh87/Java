package org.example.exersize.ekkel.chief3;

public class OperationBit {


    public static void main(String[] args) {
        char cha = 's';
        int i = 0x25f;
        i = i << 1;
        System.out.println(Integer.toBinaryString(i));
        for (int in = 1; in < 10; in++) {
            i = i >>> 1;
            System.out.println(Integer.toBinaryString(i));
        }
        char ch = 'c';
        System.out.println(String.format("\\u%04x", (int) ch));
        System.out.println(Integer.toBinaryString(ch));
        System.out.println(String.format("\\u%04x", (int) cha));
        System.out.println(Integer.toBinaryString(cha));

    }
}
