package org.example.exersize.ekkel.class7;

class Stat{

}
public class StaticFinal {
    static final int I = 1;
    //final StaticFinal st;

    final Stat stat;

    StaticFinal() {
        this.stat = new Stat();
        System.out.println(stat);
//        Stat stat1= new Stat();
//        stat=stat1;
    }

    public StaticFinal(StaticFinal st) {
        this.stat = new Stat();
    }

    public static void main(String[] args) {
        new StaticFinal();

        //StaticFinal st2 = new StaticFinal();
        //st=st2;
        //System.out.println(st2);
    }
}
