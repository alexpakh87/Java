package org.example.exersize.ekkel.incapsulation6;

public class ProtectedMethods {

    private int varPrivate = 1;
    int var = 2;
    public int varPublic = 3;
    protected int varProtected = 4;

//    public int getVarPrivate() {
//        return varPrivate;
//    }
//
//    public void setVarPrivate(int varPrivate) {
//        this.varPrivate = varPrivate;
//    }

    public void fPublic() {

    }

    protected void fProtected() {

    }

    void f() {

    }

    private void fPrivate() {

        System.out.println(varPrivate);

    }

    class Inner {

        Inner inner = new Inner();
        ProtectedMethods pr = new ProtectedMethods();

        public  void fPublic() {
            System.out.println("inner class " + pr.varPrivate);
        }
    }


    public static void main(String[] args) {
        System.out.println();
        ProtectedMethods protectedMethods = new ProtectedMethods();
        int i = protectedMethods.varPublic + protectedMethods.varPrivate;
        System.out.println();
        //int as = protectedMethods.getVarPrivate();
        // System.out.println(as);

    }
}

 
