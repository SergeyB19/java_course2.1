package com.zaurtregulov.nested_classes.static_nested_class.lyambda;

public class Test2 {
    static void def(I i) {
        System.out.println(i.abc("privet"));
    }

    public static void main(String[] args) {
        def((String str) -> { return str.length();});
    }

}

interface I {
    int abc(String s);
}
