package com.autoschool.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class DemoHashSet {

    public static void main(String[] args) {
        first();
        second();
        third();
        fourth();
        fifth();
        sixth();
    }

    private static void first() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("арбуз");
        hashSet.add("банан");
        hashSet.add("вишня");
        hashSet.add("груша");
        hashSet.add("дыня");
        hashSet.add("ежевика");
        hashSet.add("жень-шень");
        hashSet.add("земляника");
        hashSet.add("ирис");
        hashSet.add("картофель");

        for (String text : hashSet) {
            System.out.println(text);
        }
    }

    private static void second() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("арбуз", "ягода");
        hashMap.put("банан ", "трава");
        hashMap.put("вишня", "ягода");
        hashMap.put("груша", "фрукт");
        hashMap.put("дыня", "овощ");
        hashMap.put("ежевика", "куст");
        hashMap.put("жень-шень", "корень");
        hashMap.put("земляника", "ягода");
        hashMap.put("ирис", "цветок");
        hashMap.put("картофель", "клубень");

        for (Entry<String, String> pair : hashMap.entrySet()) {
            System.out.println(String.format("%s : %s", pair.getKey(), pair.getValue()));
        }
    }

    private static void third() {
        HashMap<String, Cat> hashMap = new HashMap<>();
        hashMap.put("CatA", new Cat("CatA"));
        hashMap.put("CatD", new Cat("CatD"));
        hashMap.put("CatB", new Cat("CatB"));
        hashMap.put("CatF", new Cat("CatF"));
        hashMap.put("CatH", new Cat("CatH"));
        hashMap.put("CatJ", new Cat("CatJ"));
        hashMap.put("CatC", new Cat("CatC"));
        hashMap.put("CatI", new Cat("CatI"));
        hashMap.put("CatG", new Cat("CatG"));
        hashMap.put("CatE", new Cat("CatE"));

        for (Entry<String, Cat> pair : hashMap.entrySet()) {
            System.out.println(String.format("%s : %s", pair.getKey(), pair.getValue().getName()));
        }
    }

    private static void fourth() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("арбуз", "ягода");
        hashMap.put("банан ", "трава");
        hashMap.put("вишня", "ягода");
        hashMap.put("груша", "фрукт");
        hashMap.put("дыня", "овощ");
        hashMap.put("ежевика", "куст");
        hashMap.put("жень-шень", "корень");
        hashMap.put("земляника", "ягода");
        hashMap.put("ирис", "цветок");
        hashMap.put("картофель", "клубень");

        for (Entry<String, String> pair : hashMap.entrySet()) {
            System.out.println(String.format("%s", pair.getKey()));
        }
    }

    private static void fifth() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("арбуз", "ягода");
        hashMap.put("банан ", "трава");
        hashMap.put("вишня", "ягода");
        hashMap.put("груша", "фрукт");
        hashMap.put("дыня", "овощ");
        hashMap.put("ежевика", "куст");
        hashMap.put("жень-шень", "корень");
        hashMap.put("земляника", "ягода");
        hashMap.put("ирис", "цветок");
        hashMap.put("картофель", "клубень");

        for (Entry<String, String> pair : hashMap.entrySet()) {
            System.out.println(String.format("%s", pair.getValue()));
        }
    }

    private static void sixth() {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("арбуз", "ягода");
        hashMap.put("банан ", 7);
        hashMap.put("вишня", new Exception());
        hashMap.put("груша", "фрукт");
        hashMap.put("дыня", 7.8);
        hashMap.put("ежевика", "куст");
        hashMap.put("жень-шень", "корень");
        hashMap.put("земляника", new Object());
        hashMap.put("ирис", "цветок");
        hashMap.put("картофель", "клубень");

        for (Entry<String, Object> pair : hashMap.entrySet()) {
            System.out.println(String.format("%s : %s", pair.getKey(), pair.getValue()));
        }
    }
}