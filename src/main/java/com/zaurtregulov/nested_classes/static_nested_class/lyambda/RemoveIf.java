package com.zaurtregulov.nested_classes.static_nested_class.lyambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Privet");
        al.add("Poka");
        al.add("Ok");
        al.add("Uchim Java");
        al.add("A imenno lambdas");
//        al.removeIf(element -> element.length() < 5);
        Predicate<String> p = element -> element.length() < 5;
        al.removeIf(p);
        System.out.println(al);

    }
}
