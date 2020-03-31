package com.autoschool.programming.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Demo {

    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int[] a = initializeArray();
        max(a);

        String[] strings;
        strings = initializeStringArray();
        linesInReverse(strings);

        twoArrays();

        reverseArray();

        int[] b = initializeArray();
        divideAndCopyArray(b);
    }

    private static int[] initializeArray() throws IOException {
        int[] array = new int[20];
        System.out.println("Enter 20 digits");

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        return array;
    }

    private static void max(int[] array) {
        System.out.println(Arrays.stream(array).max().getAsInt());
    }

    private static String[] initializeStringArray() throws IOException {
        String[] array = new String[10];
        System.out.println("Enter 8 lines");

        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        return array;
    }

    private static void linesInReverse(String[] strings) {
        for (int i = strings.length - 1; i >= 0; i--) {
            System.out.println(strings[i]);
        }
    }

    private static void twoArrays() throws IOException {
        int[] arrayInt = new int[10];
        String[] arrayString = new String[10];

        System.out.println("Enter 10 lines");
        for (int i = 0; i < arrayString.length; i++) {
            arrayString[i] = reader.readLine();
        }

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = arrayString[i].length();
        }

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(arrayInt[i]);
        }
    }

    private static void reverseArray() throws IOException {
        int[] array = new int[10];
        int temp;

        System.out.println("Enter 10 digits");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < array.length / 2; i++) {
            temp = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void divideAndCopyArray(int[] a) {
        int[] firstHalf = new int[10];
        int[] secondHalf = new int[10];

        System.arraycopy(a, 0, firstHalf, 0, 10);
        System.arraycopy(a, 10, secondHalf, 0, 10);

        for (int i = 0; i < secondHalf.length; i++) {
            System.out.println(secondHalf[i]);
        }
    }
}