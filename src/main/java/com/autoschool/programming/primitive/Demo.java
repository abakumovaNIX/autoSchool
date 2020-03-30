package com.autoschool.programming.primitive;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        printHello();
        printHelloName();
    }

    private static void printHello() {
        System.out.println("Hello, world!");
    }

    private static void printHelloName() {
        System.out.println("Enter your name");
        Scanner in = new Scanner(System.in);
        System.out.println("Hello, " + in.nextLine());
        in.close();
    }
}