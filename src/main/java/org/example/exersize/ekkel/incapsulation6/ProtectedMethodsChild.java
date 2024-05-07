package org.example.exersize.ekkel.incapsulation6;

public class ProtectedMethodsChild extends ProtectedMethods {
    public static void main(String[] args) {
        ProtectedMethods protectedMethods = new ProtectedMethods();
        protectedMethods.f();
        protectedMethods.fPublic();
        protectedMethods.fProtected();
        Connection c =Connection.GetObj();
        Connection c2 = Connection.GetObj();
        System.out.println(c);
        System.out.println(c2);
    }
}
