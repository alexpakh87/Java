package org.example.exersize.parallel;

import static java.lang.System.out;
import static java.lang.Thread.currentThread;
import static java.util.stream.IntStream.range;
/**
 *
 */
public class SynchronizedDemo {

    static final String MESSAGE_FIRST_THREAD = "message first thread name %s state %s \n";
    static final String MESSAGE_SECOND_THREAD = "message second thread name %s state %s \n";

    private static int counter;

    /**
     * @param args array strings
     */
    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {

            range(0, 500)
                    .forEach(i -> counter());
            out.printf(MESSAGE_FIRST_THREAD, currentThread().getName(), currentThread().getState());
        });
        Thread thread2 = new Thread(() -> {
            range(0, 400)
                    .forEach(i -> counter());
            out.printf(MESSAGE_SECOND_THREAD, currentThread().getName(), currentThread().getState());
        });

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
        out.println(counter);

    }
    /**
     * Функция  счетчика
     */
    public static synchronized void counter() {

        counter++;
    }

}
