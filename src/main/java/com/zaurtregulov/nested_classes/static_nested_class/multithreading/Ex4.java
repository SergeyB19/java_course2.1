package com.zaurtregulov.nested_classes.static_nested_class.multithreading;

public class Ex4 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Privet");
            }
        }).start();
        new Thread(()-> System.out.println("privet")).start();
    }
}
