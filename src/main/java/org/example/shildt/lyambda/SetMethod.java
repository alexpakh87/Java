package org.example.shildt.lyambda;

public interface SetMethod {
    int run();

//    static  void fPrivate() {
//        System.out.println("static method");
//
//    }
//
//    default  void fDefaultMethod() {
//        System.out.println("default method");
//    }
}

class FirstLyambda implements SetMethod {
    int i = 45;
    SetMethod setMethod11 = new FirstLyambda() {

        public int ru() {
            return 9;
        }
    };
    SetMethod setMethod = () -> {
        int i = 99;
        return i;
    };


    @Override
    public int run() {
        System.out.println(setMethod.run());

        return 1;
    }

    public static void main(String[] args) {
        SetMethod setMethod;
        //int i = 22;
        int i = 0;
        setMethod = () -> 3;

        ;
        FirstLyambda firstLyambda = new FirstLyambda();
        firstLyambda.run();
    }
}
