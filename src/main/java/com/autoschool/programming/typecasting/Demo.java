package com.autoschool.programming.typecasting;

public class Demo {

    public static void main(String[] args) {
        division(21, 8);
        sumOfDigits(123);
        round(5.78);
        round(5.18);
        changeVariables(0, 2, 5);
    }

    private static void division(int q, int w) {
        System.out.println("q / w = " + q / w + " mod " + q % w);
    }

    private static void sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10);
            n /= 10;
        }
        System.out.println("Sum of digits " + sum);
    }

    private static void round(double n) {
        System.out.println("Rounding " + Math.round(n));
    }

    private static void changeVariables(int a, int b, int c) {
        int tempC = c;
        int tempB = b;
        c = a + b + c;
        b = tempC - a;
        a += tempB;
        System.out.println("a " + a + " b " + b + " c " + c);
    }
}