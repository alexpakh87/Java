package org.example.aston;

public class HelloJava extends Thread {


    static String change(String msg) {
        msg = "hello";
        return "java";
    }


    public static void main(String[] args) {

        String msg = "hello";
        change(msg);
        System.out.println(msg);
        msg=change(msg);
        System.out.println(msg);

    }

}
