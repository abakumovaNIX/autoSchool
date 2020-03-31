package com.autoschool.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {

    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        seventh();
        eighth();
        ninth();
        tenth();
        eleventh();
    }

    private static void seventh() {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        list.add("ee");

        System.out.println(list.size());

        for (String s : list) {
            System.out.println(s);
        }
    }

    private static void eighth() throws IOException {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter string");
            list.add(reader.readLine());
        }

        String max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max.length() < list.get(i).length()) {
                max = list.get(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (max.length() == list.get(i).length()) {
                System.out.println(list.get(i));
            }
        }
    }

    private static void ninth() throws IOException {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter string");
            list.add(reader.readLine());
        }

        String min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (min.length() > list.get(i).length()) {
                min = list.get(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (min.length() == list.get(i).length()) {
                System.out.println(list.get(i));
            }
        }
    }

    private static void tenth() throws IOException {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter string");
            list.add(0, reader.readLine());
        }

        for (String s : list) {
            System.out.println(s);
        }
    }

    private static void eleventh() throws IOException {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter string");
            list.add(reader.readLine());
        }

        for (int i = 0; i < 13; i++) {
            String s = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            list.add(0, s);
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}