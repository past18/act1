package com.acts.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        return switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tu";
            case 3 -> "We";
            case 4 -> "Th";
            case 5 -> "Fr";
            case 6 -> "Sa";
            case 7 -> "Su";
            default -> "Error";
        };
    }

    public static void main(String[] args) {
        System.out.println(nameOfDay(1));
        System.out.println(nameOfDay(2));
        System.out.println(nameOfDay(3));
        System.out.println(nameOfDay(4));
        System.out.println(nameOfDay(5));
        System.out.println(nameOfDay(6));
        System.out.println(nameOfDay(7));
        System.out.println(nameOfDay(8));
    }
}