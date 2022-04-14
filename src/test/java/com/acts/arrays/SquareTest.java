package com.acts.arrays;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {
    @Test
    public void whenBound5Than() {
        int bound = 5;
        int[] result = Square.calculate(bound);
        int[] expected = new int[]{0, 1, 4, 9, 16};
        Assert.assertArrayEquals(result, expected);
    }
}
