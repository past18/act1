package com.acts.condition;

public class Tour {

    public static void offer(boolean passport) {
        System.out.println("A client has foreign passport : " + passport);
        if (passport) {
            System.out.println("Tours abroad.");
        } else {
            System.out.println("Tours in Ukraine.");
        }
    }

    public static void main(String[] args) {
        Tour.offer(true);
        Tour.offer(false);
    }
}
