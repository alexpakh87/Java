package org.example.exersize.ekkel.class7;

public class SecondClass extends FirstClass{
    FirstClass firstClass = new FirstClass(1);

    SecondClass() {
        super(1);
    }
    SecondClass(int i) {
        super(1);
        //   FirstClass firstClass = new FirstClass();
        System.out.println("call secondClass constructor");
    }

    void initObj() {
        if (firstClass == null) {
            firstClass = new FirstClass(1);
        }
    }

}

