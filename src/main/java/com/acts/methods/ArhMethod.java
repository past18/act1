package com.acts.methods;

public class ArhMethod {

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        String name = "Pavlo";
        ArhMethod.hello(name, 23);
    }
}
