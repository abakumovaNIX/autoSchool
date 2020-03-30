package com.autoschool.programming.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
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

    private static int[] initializeArray() {
        int[] array = new int[20];
        System.out.println("Enter 20 digits");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return array;
    }

    private static void max(int[] array) {
        System.out.println(Arrays.stream(array).max().getAsInt());
    }

    private static String[] initializeStringArray() {
        String[] array = new String[10];
        System.out.println("Enter 8 lines");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i = 0; i < array.length; i++) {
                array[i] = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return array;
    }

    private static void linesInReverse(String[] strings) {
        for (int i = strings.length - 1; i >= 0; i--) {
            System.out.println(strings[i]);
        }
    }

    private static void twoArrays() {
        int[] arrayInt = new int[10];
        String[] arrayString = new String[10];

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter 10 lines");
            for (int i = 0; i < arrayString.length; i++) {
                arrayString[i] = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = arrayString[i].length();
        }
        Arrays.stream(arrayInt).forEach(System.out::println);
    }

    private static void reverseArray() {
        int[] array = new int[10];
        int temp;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter 10 digits");
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < array.length / 2; i++) {
            temp = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = temp;
        }

        Arrays.stream(array).forEach(System.out::println);
    }

    private static void divideAndCopyArray(int[] a){
        int[] firstHalf = new int[10];
        int[] secondHalf = new int[10];

        System.arraycopy(a, 0, firstHalf, 0, 10);
        System.arraycopy(a, 10, secondHalf, 0, 10);

        Arrays.stream(secondHalf).forEach(System.out::println);
    }
}