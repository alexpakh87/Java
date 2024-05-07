package org.example.exersize.parallel.producerconsumer;

public class Consumer implements Runnable {
    BrokerMessage broker;

    public Consumer() {
    }

   // Thread tc;

    Consumer(BrokerMessage broker) {
        this.broker = broker;
      //  tc = new Thread(this, "consumer");
    }

    @Override
    public void run() {
        while (true) {
            broker.writeAndDeleteMessage();
        }
    }
}
