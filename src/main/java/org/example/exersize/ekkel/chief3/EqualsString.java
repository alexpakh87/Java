package org.example.exersize.ekkel.chief3;

import java.util.Objects;

public class EqualsString {

    String name;
    String age;
    String st1;
    String st2;

    public EqualsString() {

    }

    ;

    public EqualsString(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public static void foo(String str1, String str2) {
        System.out.println("Сравнение строк опрератором ==: " + str1 + " " + str2 + " " + (str1 == str2));
        System.out.println("Сравнение строк оператором !=: " + str1 + " " + str2 + " " + (str1 != str2));
       // System.out.println("Сравнение строк методом equals: " + str1 + " " + str2 + " " + (str1.equals(str2)));

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualsString that = (EqualsString) o;
        return Objects.equals(name, that.name) && Objects.equals(age, that.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "EqualsString{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public static void main(String[] args) {

        EqualsString.foo(new String("Hello"),new String("Hello"));
        EqualsString.foo("Hello","Hello");

        EqualsString e1 = new EqualsString("hew", "33");
        EqualsString e2 = new EqualsString("hew", "33");
        System.out.println("Сравнение объктов оператором == :" + e1 + e2 + (e1 == e2));
        System.out.println("Сравнение объктов оператором != :" + e1 + e2 + (e1 != e2));
        System.out.println("Сравнение объектов методом equals: " + e1 + " " + e2 + " " + (e1.equals(e2)));
        // System.out.println(e1.equals(e2));
    }
}
