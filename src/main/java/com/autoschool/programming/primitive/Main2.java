package com.autoschool.programming.primitive;

import com.autoschool.programming.primitive.com.welcome.Hello;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        Hello hello = new Hello();
        hello.setupName(name);
        hello.welcome();
        System.out.println("Hello, world!");
        hello.byeBay();
    }
}