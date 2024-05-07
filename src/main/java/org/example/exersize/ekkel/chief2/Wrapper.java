package org.example.exersize.ekkel.chief2;

import java.util.List;

public class Wrapper {
    Integer x = 1;
    byte x2 = 4;
    boolean bool = false;
    double x3 = 3.3;
    String str = "string";

    public int sumEvenNumbers(List<Integer> intList) {
        intList.add(33);
        intList.add(22);
        intList.add(36);
        intList.add(37);
        int sum = 0;
        for (Integer i : intList)
            if (i % 2 == 0)
                sum += i;
        return sum;
    }


    public static void main(String[] args) {
Integer x4=44;
int x5 =new Integer(33);
        Wrapper wrapper = new Wrapper();
       // System.out.println(x4,wrapper.sumEvenNumbers());


    }
}
