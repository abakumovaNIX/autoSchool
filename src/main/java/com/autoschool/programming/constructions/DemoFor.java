package com.autoschool.programming.constructions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoFor {

    public static void main(String[] args) throws InterruptedException {
        //thirteenth();
        //fourteenth();
        //fifteenth();
        //sixteenth();
        //seventeenth();
        eighteenth();
    }

    private static void thirteenth() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    private static void fourteenth() {
        int i = 0, j = 0, temp = 0;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter height and width");
            i = Integer.parseInt(reader.readLine());
            j = Integer.parseInt(reader.readLine());
            temp = j;
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (; i > 0; i--) {
            j = temp;
            for (; j > 0; j--) {
                System.out.print("8");
            }
            System.out.println();
        }
    }

    private static void fifteenth() {
        int i = 11, j = 1, temp = j, k = 0;
        for (; i > 0; i--) {
            j = temp;
            for (; j <= k + 1; j++) {
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

    private static void seventeenth() {
        String name = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter name");
            name = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(name + " loves me");
        }
    }

    private static void eighteenth() throws InterruptedException {
        for (int i = 30; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(100);
        }
    }
}