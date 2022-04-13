package com.acts.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1:
                name = "Monday";
                break;
            case 2:
                name = "Tu";
                break;
            case 3:
                name = "We";
                break;
            case 4:
                name = "Th";
                break;
            case 5:
                name = "Fr";
                break;
            case 6:
                name = "Sa";
                break;
            case 7:
                name = "Su";
                break;
            default:
                name = "Error";
                break;

        }
        return name;
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