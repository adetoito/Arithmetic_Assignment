package com.company;

public class Main {

    public static void main(String[] args) {
        int A = 79 + 3 * (4 + 82 - 68) - 7 + 19;
        int B = (179 + 21 + 10) / 7 + 181;
        int C = 10389 * 56 * 11 + 2246;

        String eqA = "79 + 3 * (4 + 82 - 68) - 7 + 19";
        String eqB = "(179 + 21 + 10) / 7 + 181";
        String eqC = "10389 * 56 * 11 + 2246";

        System.out.println(eqA + " = " + A);
        System.out.println(eqB + " = " + B);
        System.out.println(eqC + " = " + C);
    }
}
