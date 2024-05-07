package org.example.exersize.ekkel.class7.root;

public class Stem extends Root{
    Stem(String str) {
       // super("root");
        System.out.println("call component stem");
    }
    Component1 component1 = new Component1("1");
    Component2 component2 = new Component2("2");
    Component3 component3 = new Component3("3");
}
