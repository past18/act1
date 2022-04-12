package com.acts.calculator;


import static com.acts.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Result is: " + sumAndMultiply(20, 25));
    }
}
