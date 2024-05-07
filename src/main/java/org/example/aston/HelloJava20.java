package org.example.aston;

import static java.lang.Thread.sleep;

public class HelloJava20 implements Runnable {
    String x, y;

    public void run() {
        for (int i = 0; i < 10; i++) synchronized (this){
            x = "Hello ";
            y = "Java ";
            try {
                sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(x + " " + y + " ");

        }

    }

    public static void main(String[] args) throws InterruptedException {
        HelloJava20 run = new HelloJava20();
        Thread obj1 = new Thread(run);
        Thread obj2 = new Thread(run);
        obj1.start();
        obj2.start();

    }

}
