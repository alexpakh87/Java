package org.example.exersize.ekkel.chief8;

public class Cylce {

    private int wheels;

    public void quantityWheels(Cylce cylce) {
        if (cylce.getClass() == Unicyle.class) {
            wheels = 1;
            System.out.println("unicyle " + wheels + " wheels");
        }
        if (cylce.getClass() == Bicycle.class) {
            wheels = 2;
            System.out.println("bicyle " + wheels + " wheels");
        }
        if (cylce.getClass() == Tricyle.class) {
            wheels = 1;
            System.out.println("tricyle " + wheels + " wheels");
        }
    }

    void foo() {
        System.out.println("call base foo");
        foo2();
    }

    void  foo2() {
        System.out.println("call base foo2 ");


    }

    static final void ride(Cylce cylce) {
//        System.out.println("transformation");
//        cylce.foo();

    }

    static void ride2(Unicyle unicyle) {
        System.out.println("non transformation");
        unicyle.foo();

    }

    public static void main(String[] args) {
        Unicyle unicyle = new Unicyle();
        Bicycle bicycle = new Bicycle();
        Tricyle tricyle = new Tricyle();


        Cylce[]cylces={new Unicyle(),new Bicycle(), new Tricyle()};//восходящее преобразование
        for (Cylce bal : cylces) {

        }
        ((Unicyle)cylces[0]).balance();//нисходящее преобразование

//        unicyle.quantityWheels(bicycle);

            Cylce.ride(unicyle);

      ride(bicycle);
//        ride(tricyle);
        unicyle.foo();
    }
}
