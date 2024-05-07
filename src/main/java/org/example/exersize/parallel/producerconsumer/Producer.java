package org.example.exersize.parallel.producerconsumer;

public class Producer implements Runnable {
    BrokerMessage broker ;

    public Producer() {
    }

    //Thread tp;

    Producer(BrokerMessage broker) {
        this.broker = broker;
        //tp = new Thread(this, "producer");
    }

    @Override
    public void run() {
        while (true) {
            broker.addMessage();
        }
    }
}
