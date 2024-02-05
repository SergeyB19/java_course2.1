package com.zaurtregulov.nested_classes.static_nested_class.local_inner_class;

public class LocalInner2 {
    public static void main(String[] args) {
        class Slojeine implements Math2 {

            @Override
            public int doOperation(int a, int b) {
                return a+b;
            }
        }
        Slojeine s = new Slojeine();
        System.out.println(s.doOperation(5,3));
    }
}

interface Math2 {
    int doOperation(int a, int b);
}
