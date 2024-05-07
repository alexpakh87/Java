package org.example.exersize.parallel.producerconsumer;

public class StartBroker {
    public static void main(String[] args) {
        BrokerMessage brokerMessage = new BrokerMessage();
        Producer producer = new Producer(brokerMessage);
        Consumer consumer = new Consumer(brokerMessage);
        Thread tp = new Thread(producer);
        Thread tc = new Thread(consumer);

        tp.start();
        tc.start();
//        Producer p = new Producer();
//        Consumer c = new Consumer();
//
//        Thread tp = new Thread(p);
//        Thread tc = new Thread(c);
//
//        tp.start();
//        tc.start();
    }
}
