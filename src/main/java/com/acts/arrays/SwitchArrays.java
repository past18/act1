package com.acts.arrays;

public class SwitchArrays {
    public static int[] swap(int[] data, int source, int dest) {
        int temp = data[source];
        data[source] = data[dest];
        data[dest] = temp;
        return data;
    }
}