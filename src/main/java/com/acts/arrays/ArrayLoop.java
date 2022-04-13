package com.acts.arrays;

public class ArrayLoop {
    public static int funk(int index) {
        return index * 2 + 3;
    }

    public static void main(String[] args) {
        int[] five = new int[5];
        for (int i = 0; i < five.length; i++) {
            five[i] = funk(i);
        }
        for (int i : five) {
            System.out.println(i);
        }
    }
}
