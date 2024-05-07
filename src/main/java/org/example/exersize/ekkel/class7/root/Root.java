package org.example.exersize.ekkel.class7.root;

public class Root {
    Root() {

    }
    Root(String str) {
        System.out.println(" call root");
    }

    Component1 component1 = new Component1("1");
    Component2 component2 = new Component2("2");
    Component3 component3 = new Component3("3");

    public void Deleg() {
        component1.Deleg();
    }

    public void Deleg2() {
        component1.Deleg2();
    }

    public static void main(String[] args) {
        Root root = new Root("root");
    }

}
