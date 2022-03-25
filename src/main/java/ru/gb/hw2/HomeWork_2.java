/**
 * Java 1. HomeWork 2
 *
 * @author Dmitriy
 * @version 25.03.2022
 */

package ru.gb.hw2;


public class HomeWork_2 {
    public static void main(String[] args) {
        System.out.println(summary(11, 9));
        compare(120);
        System.out.println(positAndNegat(-1));
        printString("Hello", 3);
        System.out.println(leapYear(2017));

    }

    static boolean summary(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    static void compare(int a) {
        System.out.println(a >= 0 ? "Positive" : "Negative");
    }

    static boolean positAndNegat(int a) {
        return a >= 0;
    }

    static void printString(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    static boolean leapYear(int a) {
        if (a % 4 == 0) {
            return true;
        }
        if (a % 100 != 0) {
            return false;
        }
        if (a % 400 == 0) {
            return true;
        }
        return false;
    }
}
