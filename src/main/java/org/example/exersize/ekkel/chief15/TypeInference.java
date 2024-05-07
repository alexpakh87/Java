package org.example.exersize.ekkel.chief15;

public class TypeInference<T, V> {


    T t;
    V v;

    public TypeInference(T t, V v) {
        this.t = t;
        this.v = v;
    }
    TypeInference<String, Integer> ti = new TypeInference<>("www", 333);
    void f() {
        TypeInference<String, Integer> ti2 = new TypeInference<>("www", 333);
    }

    public static void main(String[] args) {
        TypeInference<String, Integer> ti = new TypeInference<>("www", 333);
    }
}
