package org.example.exersize.ekkel.chief3;

public class Incriment {
    int i3 = 10;
    int i5 = 15;


    public static void main(String[] args) {
        int i = 1;
        Integer i1 = new Integer(22);
        Integer i2 = new Integer(22);

        Incriment inc1 = new Incriment();
        Incriment inc2 = new Incriment();

        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);

        System.out.println(i1 == i2);
        System.out.println(i1 != i2);

        inc1.i3 = inc1.i5;
        System.out.println(inc1.equals(inc2));
        System.out.println(inc1);
        System.out.println(inc2);
        System.out.println(inc1.i3);
        inc1 = inc2;
        System.out.println(inc1.equals(inc2));
        System.out.println(inc1==inc2);
        System.out.println(inc1);
        System.out.println(inc2);
        System.out.println(inc1.i3);

    }
}
