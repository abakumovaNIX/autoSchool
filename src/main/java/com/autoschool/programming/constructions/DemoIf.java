package com.autoschool.programming.constructions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class DemoIf {

    public static void main(String[] args) throws IOException {
        first();
        second();
        third();
        forth();
        fifthSixth();
        seventh();
    }

    private static void first() {
        int a = 0, b = 0;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter 2 numbers");
            a = Integer.parseInt(reader.readLine());
            b = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (a > b) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }

    private static void second() {
        int a = 0, b = 0, c = 0, d = 0;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter 4 numbers");
            a = Integer.parseInt(reader.readLine());
            b = Integer.parseInt(reader.readLine());
            c = Integer.parseInt(reader.readLine());
            d = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
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

    private static void third() {
        int a = 0, b = 0, c = 0;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter 3 numbers");
            a = Integer.parseInt(reader.readLine());
            b = Integer.parseInt(reader.readLine());
            c = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (a >= b && a >= c && b > c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a >= b && c >= b && a >= c) {
            System.out.println(a + " " + c + " " + b);
        } else if (b >= a && b >= c && a >= c) {
            System.out.println(b + " " + a + " " + c);
        } else if (b >= a && b >= c && c >= a) {
            System.out.println(b + " " + c + " " + a);
        } else if (c >= a && c >= b && a >= b) {
            System.out.println(c + " " + a + " " + b);
        } else if (c >= a && c >= b && b >= a) {
            System.out.println(c + " " + b + " " + a);
        }
    }

    private static void forth() {
        String name1 = "", name2 = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter 2 names");
            name1 = reader.readLine();
            name2 = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (name1.equals(name2)) {
            System.out.println("Names are equal");
        } else if (name1.length() == name2.length()) {
            System.out.println("Name length is equal");
        }
    }

    private static void fifthSixth() {
        int age = 0;
        String name = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter name and age");
            name = reader.readLine();
            age = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (age < 18) {
            System.out.println("Grow up");
        }
        if (age > 20) {
            System.out.println("18 is enough");
        }
    }

    private static void seventh() throws IOException {
        Random random = new Random();
        int secret = random.nextInt(20 + 1);
        int userNumber = 0, attempt = -1;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number to guess");
        userNumber = Integer.parseInt(reader.readLine());

        if (userNumber > secret || userNumber < secret) {
            for (int i = 7; i > 0; --i) {
                if (userNumber > secret) {
                    System.out.println("More than secret. Attempts left: " + i);
                    attempt = Integer.parseInt(reader.readLine());
                    userNumber = attempt;
                } else if (userNumber < secret) {
                    System.out.println("Less than secret. Attempts left " + i);
                    attempt = Integer.parseInt(reader.readLine());
                    userNumber = attempt;
                }
            }
            if (userNumber == secret) {
                System.out.println("Win");
            }
        } else {
            System.out.println("Guessed on first try");
        }
        if (userNumber > secret || userNumber < secret) {
            System.out.println("Lose");
        }
    }
}