package org.example.aston;

public class ThredOneTwo extends Thread {
    public static void main(String[] args) {
        ThredOneTwo thredOneTwo = new ThredOneTwo();
        thredOneTwo.start();
        System.out.println("one ");
        thredOneTwo.start();
        System.out.println("two ");
    }

    public void run() {
        System.out.println("thread");
    }
}
