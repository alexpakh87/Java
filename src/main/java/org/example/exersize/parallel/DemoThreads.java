/**
 * Create threads different ways
 *
 * @Author alexpakh87
 * @version 1
 */


package org.example.exersize.parallel;

import static java.util.stream.IntStream.range;

public class DemoThreads extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " simple");
    }

    //factory method  create threads
    public static void startThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.start();
    }


    public static void main(String[] args) {


        System.out.println(Thread.currentThread().getName());


        //create thread by class Thread
        Thread t = new DemoThreads();
        t.start();
        //create thread by class Thread this lambda expression(anonymous class)
        Thread thread = new Thread(() -> System.out.println(Thread.currentThread().getName()));
        thread.start();
        thread.run();//invoke method run  in thread main without create new thread


        Runnable run = () -> System.out.println(currentThread().getName() + " runnable");
        Thread runnable = new Thread(run);
        runnable.start();

        Runnable runWithMethod = () -> {

            range(0,10)
                    .forEach(i->{
                        startThread(t);
                        System.out.print(" foreach range ");
                    });
        };
        startThread(t);
        startThread(t);
        //startThread(runWithMethod);


    }


}
