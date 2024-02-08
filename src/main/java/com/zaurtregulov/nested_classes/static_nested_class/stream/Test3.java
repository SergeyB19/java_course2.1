package com.zaurtregulov.nested_classes.static_nested_class.stream;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};
        Arrays.stream(array).forEach(el -> {
            el *= 2;
            System.out.print(el);
        });
        System.out.println();
        Arrays.stream(array).forEach(el -> {
            System.out.print(el);
        });
        System.out.println();
        Arrays.stream(array).forEach(System.out::print);
        System.out.println();
        Arrays.stream(array).forEach(Utils::myMethod);
        Arrays.stream(array).forEach(el->Utils.myMethod(el));
    }
}

class Utils {
    public static void myMethod(int a) {
        a = a + 5;
        System.out.println("Element = " + a);
    }
}
