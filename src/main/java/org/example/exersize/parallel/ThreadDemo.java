package org.example.exersize.parallel;

public class ThreadDemo implements Runnable {
    String nameThread;

    Thread thread;

    public ThreadDemo(String nameThread) {
        thread = new Thread(this, nameThread);

        this.nameThread = nameThread;
        System.out.println("new thread" + thread);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " thread name " + thread.getName());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        ThreadDemo threadDemo = new ThreadDemo("one");
        ThreadDemo threadDemo2 = new ThreadDemo("two");
        threadDemo.thread.setPriority(9);
        threadDemo2.thread.setPriority(1);

        threadDemo.thread.getPriority();
        threadDemo2.thread.getPriority();

        threadDemo.thread.start();
        threadDemo2.thread.start();
        System.out.println("main thread end");
    }
}