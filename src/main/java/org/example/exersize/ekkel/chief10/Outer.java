package org.example.exersize.ekkel.chief10;

public class Outer {
    private String str;

    public Outer(String str) {
        this.str = str;
    }

    public Inner getInnerObj() {
        return new Inner();
    }

    class  Inner {

        @Override
        public String toString() {
            return str;
        }
    }

    public static void main(String[] args) {
        Outer o = new Outer("string");
        Inner inner = o.getInnerObj();
        Outer.Inner inner1 = o.new Inner();

        //Inner i = new Inner();
        System.out.println(inner);
        System.out.println(o);

    }
}

class Other {
    Outer outer = new Outer("");
    Outer.Inner in = outer.new Inner();
}
