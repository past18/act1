package com.acts.arrays;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayCharTest {

    @Test
    public void startWith1() {
        char[] word = {'H', 'E', 'L', 'L', 'O'};
        char[] pref = {'H', 'E', 'L'};
        boolean result = ArrayChar.startWith(word, pref);
        Assert.assertTrue(result);
    }

    @Test
    public void startWith2() {
        char[] word = {'H', 'E', 'L', 'L', 'O'};
        char[] pref = {'H', 'E', 'L', 'L', 'O', 'k'};
        boolean result = ArrayChar.startWith(word, pref);
        Assert.assertFalse(result);
    }
}