package org.example.exersize.ekkel.chief5;

public class NonInitialString {
    public static String str;
    public static  String strInit = "string initial";
    public String constr;

    NonInitialString() {

    }

    NonInitialString(String constr) {
        this.constr = constr;

    }

    public static void main(String[] args) {
        NonInitialString non = new NonInitialString("init constructor");
        System.out.println(str);
        System.out.println(strInit);
        System.out.println(non);
    }
}
