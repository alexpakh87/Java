package org.example.exersize.ekkel.chief5;

public class Constuctors {

    Constuctors() {
        System.out.println("Создайте объект этого класса");
    }

    Constuctors(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {

        Constuctors с = new Constuctors();
        Constuctors co = new Constuctors("Объект создан");
    }
}
