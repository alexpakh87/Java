package org.example.exersize.ekkel.chief5;

public class Dog {

    public static void debug(String str){
        System.out.println(str);
    }
    public static void debug2(String str){
        System.out.println(str);
    }

    Dog bark(String str) {
        System.out.println(str);
        return this;
    }

    Dog bark(String str, int cont) {
        System.out.println(str + " " + cont + " раз");
        return this;
    }

    Dog bark(int count, String str) {
        System.out.println(count + " раз" + " " + str);
        return this;
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        new Dog().bark("vj");
        dog.bark("собака лает")
                .bark("собака лает", 5)
                    .bark(7, "собака лает");
//        dog.bark("собака лает", 5);
//        dog.bark(7, "собака лает");
    }
}
