package com.autoschool.programming.constructions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoFor {

    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException, IOException {
        thirteenth();
        fourteenth();
        fifteenth();
        sixteenth();
        seventeenth();
        eighteenth();
    }

    private static void thirteenth() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    private static void fourteenth() throws IOException {
        int i, j;
        System.out.println("Enter height and width");
        i = Integer.parseInt(reader.readLine());
        j = Integer.parseInt(reader.readLine());

        for (; i > 0; i--) {
            for (int t = j; t > 0; t--) {
                System.out.print("8");
            }
            System.out.println();
        }
    }

    private static void fifteenth() {
        int i = 11, j = 1, k = 0;
        for (; i > 0; i--) {
            for (int t = j; t <= k + 1; t++) {
                System.out.print("8");
            }
            System.out.println();
            k++;
        }
    }

    private static void sixteenth() {
        for (int i = 0; i <= 9; i++) {
            System.out.print("8");
        }
        for (int i = 0; i <= 9; i++) {
            System.out.println("8");
        }
    }

    private static void seventeenth() throws IOException {
        String name = "";
        System.out.println("Enter name");
        name = reader.readLine();

        for (int i = 0; i < 10; i++) {
            System.out.println(name + " loves me");
        }
    }

    private static void eighteenth() throws InterruptedException {
        for (int i = 30; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(100);
        }
        System.out.println("Boom");
    }
}