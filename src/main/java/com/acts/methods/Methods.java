package com.acts.methods;

public class Methods {
    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Methods.plus(1, 2);
        Methods.plus(10, 15);
    }
}
