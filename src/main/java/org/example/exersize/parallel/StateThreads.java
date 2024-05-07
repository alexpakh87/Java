package org.example.exersize.parallel;

public class StateThreads {
    public static void showThreadState(Thread thread) {
        System.out.println(thread.getName() + " " + thread.getState());
    }

    public static void main(String[] args) throws InterruptedException {
        Thread mainThread = Thread.currentThread();
        Thread thread = new Thread(() -> {
            try {
                mainThread.join(1000);
                showThreadState(Thread.currentThread());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });


        showThreadState(thread);
        thread.start();
        showThreadState(thread);

        showThreadState(thread);
        showThreadState(mainThread);
    }
}
