package com.acts.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrgAreaTest {

    @Test
    public void whenSideis3on3on3() {
        double expected = 3.9;
        double out = TrgArea.area(3, 3, 3);
        double eps = 0.1;
        Assert.assertEquals(expected, out, eps);
    }
}