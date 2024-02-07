package com.zaurtregulov.nested_classes.static_nested_class.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela?");
        list.add("OK");
        list.add("poka");

      /*  for (int i = 0; i < list.size(); i++) {
            list.set(i, String.valueOf(list.get(i).length()));
        }*/

        List<Integer> list2 = list.stream().map(element -> element.length()).collect(Collectors.toList());

        System.out.println(list);
        System.out.println(list2);

        int[] array = {5, 9, 3, 8, 1};
        array = Arrays.stream(array).map(element -> {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;
        }).toArray();
//        System.out.println(Arrays.toString(array));
        Set<String> stringSet = new TreeSet<>();
        stringSet.add("privet");
        stringSet.add("kak dela?");
        stringSet.add("OK");
        stringSet.add("poka");
        System.out.println(stringSet);

        Set<Integer> set2 = stringSet.stream().map(e -> e.length()).collect(Collectors.toSet());
        List<Integer> list3 = stringSet.stream().map(e -> e.length()).collect(Collectors.toList());
        System.out.println(set2);
        System.out.println(list3);

    }
}
