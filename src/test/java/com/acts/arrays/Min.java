package com.acts.arrays;

public class Min {
    public static int findMin(int[] data) {
        int min = data[0];
        for (int i = 0; i <= data.length-1; i++) {
            if (min > data[i]) {
                min = data[i];
            }
        }
        return min;
    }
}
