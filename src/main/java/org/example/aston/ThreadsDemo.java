package org.example.aston;

public class ThreadsDemo implements Runnable {
    private int x = 0;
    private int y = 0;

    public static void main(String[] args) {
        ThreadsDemo ob = new ThreadsDemo();
        (new Thread(ob)).start();
        (new Thread(ob)).start();
    }

    public synchronized void run() {
        for (int i = 0; i < 10; i++) {
            x++;
            y++;
        }
        System.out.println("x= " + x + " y= " + y);
    }
}
