package com.acts.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void findIndex() {
        int[] test1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int result = FindLoop.findIndex(test1, 7);
        int expected = 6;
        assertEquals(result, expected);
    }

    @Test
    public void findIndex2() {
        int[] test1 = new int[]{1, 2, 3, 4, 5, 6, 8, 9};
        int result = FindLoop.findIndex(test1, 7);
        int expected = -1;
        assertEquals(result, expected);
    }

    @Test
    public void findIndexInRange() {
        int[] test1 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int result = FindLoop.indexInRange(test1, 6, 6, 7);
        int expected = 6;
        assertEquals(result, expected);
    }

    @Test
    public void findIndexInRange2() {
        int[] test1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int result = FindLoop.indexInRange(test1, 5, 0, 8);
        int expected = 4;
        assertEquals(result, expected);
    }
}
