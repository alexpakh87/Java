package org.example.exersize.ekkel.chief5;

import org.example.exersize.ekkel.incapsulation6.ProtectedMethods;

public class CallMethod {
    static String strin;

    public void first() {
        System.out.println("первый метод вызывет");
        second();
        System.out.println("первый метод вызывет");
        this.second();
    }


    public void second() {
        System.out.println("второй метод");
    }

    public static void main(String[] args) {
        ProtectedMethods p = new ProtectedMethods();
        //p.fProtected()нельзя вызвать в другом пакете protected
        p.fPublic();

        new CallMethod().first();
        System.out.println(strin);
    }
}
