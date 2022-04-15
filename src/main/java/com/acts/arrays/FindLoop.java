package com.acts.arrays;

public class FindLoop {
    public static int findIndex(int[] data, int el) {
        int res = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                res = i;
            }
        }
        return res;
    }

    public static int indexInRange(int[] data, int el, int start, int finish) {
        int res = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                res = i;
            }
        }
        return res;
    }
}
