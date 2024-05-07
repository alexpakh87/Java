package org.example.exersize.ekkel.chief10;


//: innerclasses/Sequence.java
// Holds a sequence of Objects.

interface Selector {
    boolean end();

    Object current();

    void next();
}

public class Sequence {
    private Object[] items;
    private Object[] items2;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
        items2 = new StringTo[size];
    }

    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    public void add2(Object x) {
        items2[0] = x;

    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == items.length;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i < items.length) i++;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    class StringTo {
        String str = "String";

        @Override
        public String toString() {
            return str;
        }
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }

        Sequence sequence1 = new Sequence(3);
        //sequence1.add2(String str);

    }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~
