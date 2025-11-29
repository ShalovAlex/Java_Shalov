package ru.courses.main;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class Degree {
    public static double pow1(String xStr, String yStr) {
        int x = parseInt(xStr);
        int y = parseInt(yStr);
        return pow(x, y);
    }

    public static void main(String[] args) {
        double result1 = pow(2, 3);
        System.out.println(result1);
    }
}
