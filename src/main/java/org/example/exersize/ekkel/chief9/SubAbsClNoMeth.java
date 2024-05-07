package org.example.exersize.ekkel.chief9;

public class SubAbsClNoMeth extends AbstactClassNoMethod {
    void foo() {
        System.out.println(this);
    }

    static void GetObj(AbstactClassNoMethod absclmeth) {
       // absclmeth.foo() нужно нисходящее преобразование

        ((SubAbsClNoMeth)absclmeth).foo();//нисходящее преобразование

    }

    public static void main(String[] args) {
        SubAbsClNoMeth s = new SubAbsClNoMeth();
        SubAbsClNoMeth.GetObj(s);// восходящее преобразование
        s.foo();
    }

}
