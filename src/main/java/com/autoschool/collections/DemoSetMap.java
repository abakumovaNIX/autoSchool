package com.autoschool.collections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoSetMap {

    public static void main(String[] args) throws ParseException {
        twelfth();
        thirteenth();
        fourteenth();
        fifteenth();

        Map<String, String> map = sixteenth();
        removeNameDuplicates(map);

        for (Entry<String, String> pair : map.entrySet()) {
            System.out.println(String.format("%s : %s", pair.getKey(), pair.getValue()));
        }

        seventeenth();
    }

    private static void twelfth() {
        Set<String> set = new HashSet<>();
        set.add("Л");
        set.add("Ла");
        set.add("Лав");
        set.add("Лава");
        set.add("Лам");
        set.add("Лама");
        set.add("Ламп");
        set.add("Лампа");
        set.add("Лад");
        set.add("Лада");
        set.add("Ло");
        set.add("Лом");
        set.add("Ле");
        set.add("Лет");
        set.add("Лето");
        set.add("Лета");
        set.add("Летат");
        set.add("Летать");
        set.add("Лё");
        set.add("Лёд");

        for (String text : set) {
            System.out.println(text);
        }
    }

    private static void thirteenth() {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(8);
        set.add(12);
        set.add(18);
        set.add(2);
        set.add(7);
        set.add(3);
        set.add(4);
        set.add(11);
        set.add(25);
        set.add(5);
        set.add(34);
        set.add(20);
        set.add(9);
        set.add(16);
        set.add(41);
        set.add(52);
        set.add(45);
        set.add(15);
        set.add(6);

        set.removeIf(integer -> integer > 10);

        for (int i : set) {
            System.out.println(i);
        }
    }

    private static void fourteenth() {
        Map<String, String> map = new HashMap<>();
        map.put("A", "aa");
        map.put("B", "bb");
        map.put("C", "cc");
        map.put("D", "aa");
        map.put("E", "dd");
        map.put("F", "ee");
        map.put("G", "bb");
        map.put("H", "hh");
        map.put("I", "ff");
        map.put("J", "aa");

        int count = 0;
        String name = "aa";
        for (Entry<String, String> pair : map.entrySet()) {
            String value = pair.getValue();
            if (name.equals(value)) {
                count++;
            }
        }
        System.out.println(String.format("Name %d", count));

        count = 0;
        String lastName = "E";
        for (Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            if (lastName.equals(key)) {
                count++;
            }
        }
        System.out.println(String.format("Last Name %d", count));
    }

    private static void fifteenth() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        Map<String, Date> map = new HashMap<>();
        map.put("A", format.parse("01.01.2000"));
        map.put("B", format.parse("01.02.2000"));
        map.put("C", format.parse("01.03.2000"));
        map.put("D", format.parse("01.04.2000"));
        map.put("E", format.parse("01.05.2000"));
        map.put("F", format.parse("01.06.2000"));
        map.put("G", format.parse("01.07.2000"));
        map.put("H", format.parse("01.08.2000"));
        map.put("I", format.parse("01.09.2000"));
        map.put("J", format.parse("01.10.2000"));

        map.values().removeIf(value -> (value.getMonth() == 5 || value.getMonth() == 6 || value.getMonth() == 7));

        for (Entry<String, Date> pair : map.entrySet()) {
            System.out.println(String.format("%s : %s", pair.getKey(), pair.getValue()));
        }
    }


    private static Map sixteenth() {
        Map<String, String> map = new HashMap<>();
        map.put("A", "aa");
        map.put("B", "bb");
        map.put("C", "cc");
        map.put("D", "aa");
        map.put("E", "dd");
        map.put("F", "ee");
        map.put("G", "bb");
        map.put("H", "hh");
        map.put("I", "ff");
        map.put("J", "aa");

        return map;
    }

    public static void removeNameDuplicates(Map<String, String> map) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> s : copy.entrySet()) {
            for (Map.Entry<String, String> s2 : copy.entrySet()) {
                if (s.getValue().equals(s2.getValue()) && !s.getKey().equals(s2.getKey())) {
                    removeItemFromMapByValue(map, s.getValue());
                }
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }


    private static void seventeenth() {
        Map<String, String> map = new HashMap<>();
        map.put("A", "aa");
        map.put("B", "bb");
        map.put("C", "cc");
        map.put("D", "aa");
        map.put("E", "dd");
        map.put("A", "ee");
        map.put("G", "bb");
        map.put("H", "hh");
        map.put("B", "ff");
        map.put("J", "aa");

        for (Entry<String, String> pair : map.entrySet()) {
            System.out.println(String.format("%s : %s", pair.getKey(), pair.getValue()));
        }
    }
}