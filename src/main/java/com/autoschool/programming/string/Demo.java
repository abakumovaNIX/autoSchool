package com.autoschool.programming.string;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        stringIndex("Java");
        stringIndex("Hibernate");
        beforeDot("Spring.Framework");
        countSpace("A U T O M A T I O N");

        Scanner in = new Scanner(System.in);
        System.out.println("Enter string");
        String string = in.nextLine();
        System.out.println("Enter string to be replaced");
        String stringToChange = in.nextLine();
        System.out.println("Enter new substring");
        String newString = in.nextLine();
        in.close();
        changeSubString(string, stringToChange, newString);
        changeSubString("Java is a general-purpose programming language that is class-based", "class-based", "object-oriented");

        maxLengthWord("Java Spring Framework");
    }

    private static void stringIndex(String s) {
        System.out.println("First " + s.charAt(0));
        if (s.length() % 2 == 1) {
            System.out.println("Middle " + s.charAt(s.length() / 2));
        } else {
            System.out.println("Middle -");
        }
        System.out.println("Last " + s.charAt(s.length() - 1));
    }

    private static void beforeDot(String s) {
        System.out.println(s.substring(0, s.indexOf('.') + 1));
    }

    private static void countSpace(String s) {
        int i = 0;
        for (int k = 0; k < s.length(); k++) {
            char a = s.charAt(k);
            if (a == ' ') {
                i++;
            }
        }
        System.out.println("Space - " + i);
    }

    private static void changeSubString(String string, String stringToChange, String newString) {
        System.out.println(string.replace(stringToChange, newString));
    }

    private static void maxLengthWord(String s) {
        String[] words = s.split(" ");
        String word = "";
        for (String w : words) {
            if (w.length() > word.length()) {
                word = w;
            }
        }
        System.out.println("Max word - " + word);
    }
}