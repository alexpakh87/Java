package org.example.exersize.parallel.producerconsumer;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class BrokerMessage {
    boolean flag = false;
    public static Queue<String> message = new ConcurrentLinkedDeque<>();

    public synchronized void addMessage() {

        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("message sent? " + message.add(" sent ") + message.size());
        flag = true;
        notify();
    }


    public synchronized void writeAndDeleteMessage() {

        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(message.poll() + " write and delete " + message.size());
        flag = (false);
        notify();
    }
}
