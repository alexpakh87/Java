package org.example.exersize.ekkel.loop4;

public class Switcher {


    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {

            switch (i) {
                case 1:
                    System.out.println("case 1");
                    break;
                case 2:
                    System.out.println("case 2");
                    break;
                case 3:
                    System.out.println("case 3");
                    break;
                case 4:
                    System.out.println("case 4");
                    break;
                default:
                    System.out.println("exit");
            }
        }
    }
}