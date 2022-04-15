package com.acts.arrays;

public class ArrayChar {
    public static boolean startWith(char[] data, char[] pref) {
        boolean result = true;
        if (data.length >= pref.length) {
            for (int i = 0; i < pref.length; i++) {
                if (data[i] != pref[i]) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;

    }
}