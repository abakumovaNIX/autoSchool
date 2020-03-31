package com.autoschool.programming.constructions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoWhile {

    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        eighth();
        ninth();
        tenth();
        eleventh();
        twelfth();
    }

    private static void eighth() {
        int i = 0;
        while (i < 10) {
            System.out.println(i + 1);
            i++;
        }
    }

    private static void ninth() {
        int i = 10;
        while (i > 0) {
            System.out.println(i);
            i--;
        }
    }

    private static void tenth() throws IOException {
        System.out.println("Enter string and number of repeats");
        String s = reader.readLine();
        int n = Integer.parseInt(reader.readLine());

        while (n > 0) {
            System.out.println(s);
            n--;
        }
    }

    private static void eleventh() {
        int i = 10, j;
        while (i > 0) {
            j = 10;
            while (j > 0) {
                System.out.print("S");
                j--;
            }
            System.out.println();
            i--;
        }
    }

    private static void twelfth() {
        int i = 1, j;
        while (i <= 10) {
            j = 1;
            while (j <= 10) {
                System.out.print(i * j + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}