package com.acts.arrays;

import java.util.Arrays;

public class AlgoArray {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[min]) {
                    min = j;
                }
            }
            int temp = data[i];
            data[i] = data[min];
            data[min] = temp;
        }
        return data;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 4, 3, 8, 9, 6};
        System.out.println(Arrays.toString(AlgoArray.sort(array)));
    }
}
