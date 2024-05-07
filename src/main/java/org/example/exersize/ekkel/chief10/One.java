package org.example.exersize.ekkel.chief10;

public interface One {
   One f();

}

class Realization implements One {

    @Override
    public One f() {

        return null;
    }

    One foo() {
        class ReturnIntObj {

        }
        return new Realization();
    }
}

class Two {

    Two two = new Two();
    void retObj(One one) {

    }

    private class Three implements One {
        @Override
        public One f() {

           One o = new Three();
           return o;
        }
    }
}
