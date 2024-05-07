package org.example.exersize.ekkel.chief3;

public class Dog {
    String name;
    String say;

    public Dog(String name, String say) {
        this.name = name;
        this.say = say;
    }

    public void debug(){

    }
    //org.example.exersize.chief5.Dog.

    @Override
    public String toString() {
        return name + " " + say;
    }

    @Override
//    public boolean equals(Object obj) {
//        return (this == obj);
//    }
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }
        Dog dog = (Dog) obj;
        //boolean currencyDogEquals=(this.name==null&&dog.name==null)||(this.);
        return this.name == dog.name && this.say == dog.say;

    }

    public boolean trueFalse( int b, int c) {
        return  b<c;
    }


    public static void main(String[] args) {
        Dog spot = new Dog("Spot", "baw");
        Dog scruffy = new Dog("Scruffy", "guv");
        Dog lusia = new Dog("Spot", "baw");

        System.out.println(spot == lusia);
        System.out.println(spot.equals(lusia));
        System.out.println(spot.equals(scruffy));


        spot = lusia;

        System.out.println(spot == lusia);
        System.out.println(spot.equals(lusia));

        System.out.println(spot);
        System.out.println(scruffy);

        System.out.println();

        //org.example.exersize.chief5.Dog.debug2("ef");


    }
}
