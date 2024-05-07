package org.example.exersize.parallel;

// Корректная реализация производителя и потребителя .
public class Q {
    int n = 1;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet)
            try {
                wait();
            } catch (InterruptedException е) {
                System.out.println("Пepexвaчeнo исключение InterruptedException");
            }
        System.out.println(" lПoлyчeнo : " + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (valueSet)
            try {
                wait();
            } catch (InterruptedException е) {
                System.out.println("Перехвачено исключение InterruptedException");
            }
        this.n = n;
        valueSet = true;
        System.out.println("Oтnpaвлeнo : " + n);
        notify();
    }
}

class Producer implements Runnable {
    Q q;
    Thread t;

    Producer(Q q) {
        this.q = q;
        t = new Thread(this, "Производитель ");
    }

    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}

class Consumer implements Runnable {
    Q q;
    Thread t;

    public Consumer(Q q) {
        this.q = q;
        t = new Thread(this, "Потребитель");
    }

    @Override
    public void run() {
        while (true) {
            q.get();
        }
    }
}

class PCFixed {
    public static void main(String[] args) {
        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);
        p.t.start();
        c.t.start();
    }
}













