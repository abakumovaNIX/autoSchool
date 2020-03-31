package com.autoschool.programming.constructions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class DemoIf {

    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        first();
        second();
        third();
        fourth();
        fifthSixth();
        seventh();
    }

    private static void first() throws IOException {
        System.out.println("Enter 2 numbers");
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        if (a > b) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }

    private static void second() throws IOException {
        System.out.println("Enter 4 numbers");
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());

        if (a >= b && a >= c && a > d) {
            System.out.println(a);
        } else if (b >= a && b >= c && b >= d) {
            System.out.println(b);
        } else if (c >= a && c >= b && c >= d) {
            System.out.println(c);
        } else if (d >= a && d >= b && d >= c) {
            System.out.println(d);
        }
    }

    private static void third() throws IOException {
        System.out.println("Enter 3 numbers");
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a >= b && a >= c && b > c) {
            System.out.println(String.format("%d %d %d", a, b, c));
        } else if (a >= b && c >= b && a >= c) {
            System.out.println(String.format("%d %d %d", a, c, b));
        } else if (b >= a && b >= c && a >= c) {
            System.out.println(String.format("%d %d %d", b, a, c));
        } else if (b >= a && b >= c && c >= a) {
            System.out.println(String.format("%d %d %d", b, c, a));
        } else if (c >= a && c >= b && a >= b) {
            System.out.println(String.format("%d %d %d", c, a, b));
        } else if (c >= a && c >= b && b >= a) {
            System.out.println(String.format("%d %d %d", c, b, a));
        }
    }

    private static void fourth() throws IOException {
        System.out.println("Enter 2 names");
        String name1 = reader.readLine();
        String name2 = reader.readLine();

        if (name1.equals(name2)) {
            System.out.println("Names are equal");
        } else if (name1.length() == name2.length()) {
            System.out.println("Name length is equal");
        }
    }

    private static void fifthSixth() throws IOException {
        System.out.println("Enter name and age");
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());

        if (age < 18) {
            System.out.println("Grow up");
        }
        if (age > 20) {
            System.out.println("18 is enough");
        }
    }


    private static void seventh() throws IOException {
        int i = 7;
        Random random = new Random();
        int secret = random.nextInt(20 + 1);

        System.out.println("Enter number to guess");
        for (; i >= 0; --i) {
            int userNumber = Integer.parseInt(reader.readLine());
            if (userNumber > secret) {
                System.out.println("More than secret. Attempts left: " + i);
            } else if (userNumber < secret) {
                System.out.println("Less than secret. Attempts left " + i);
            } else {
                System.out.println("Win");
                break;
            }
        }
        if (i < 0) {
            System.out.println("Lose");
        }
    }
}