package org.example.exersize.ekkel.loop4;

public class BeginEnd {

    public static  int test(int testval, int begin, int end){

        if (testval>=begin && testval<=end){
            System.out.println("testval "+testval+" в диапазоне begin end");
        }else {
            System.out.println("testval " +testval + " вне дипазона begin end");
        }
        return 1;
    }
    public static void main(String[] args) {

        BeginEnd.test(1,2,50);
    }
}
