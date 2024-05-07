package org.example.exersize.ekkel.chief5;
//import org.example.exersize.chief3.Dog;

import org.example.exersize.ekkel.chief3.Dog;

public class VarMethodLength {
org.example.exersize.ekkel.chief5.Dog dog = new org.example.exersize.ekkel.chief5.Dog();
Dog dog2 = new Dog("dsf","av");
    public void varLength(String[]... arg) {
        System.out.println(arg);
    }

    public static void main(String[] args) {
        VarMethodLength varMethodLength = new VarMethodLength();
        String[] s = new String[2];
        String[] s1 = new String[2];
        String s2 = "dd";
        String s3 = "dd";

        varMethodLength.varLength(s, s1);
    }
}
