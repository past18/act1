package com.acts.arrays;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchArraysTest {
    @Test
    public void whenSwap3to5() {
        int[] input = {1, 2, 3, 4, 5};
        int source = 2;
        int dest = input.length - 1;
        int[] result = SwitchArrays.swap(input, source, dest);
        int[] expected = {1, 2, 5, 4, 3};
        Assert.assertArrayEquals(expected, result);
    }
}