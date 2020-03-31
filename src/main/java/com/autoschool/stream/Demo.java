package com.autoschool.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("");
        list.add("bv");
        list.add("");
        list.add("des");
        list.add("ujgb");
        list.add("bgt");
        list.add("mnkj");
        list.add("bdt");
        list.add("pl");
        list.add("z");
        list.add("q");
        list.add("a");
        list.add("tgbbtg");
        list.add("edswss");
        list.add("bnkk");
        list.add("ujn");
        list.add("i");
        list.add("k");
        list.add("l");
        list.add("o");
        list.add("p");
        list.add("");
        list.add("wsx");
        list.add("edcv");
        list.add("gtbb");
        list.add("nbmjht");
        list.add("okku");
        list.add("nbmk");
        list.add("edxaa");
        list.add("ujyh");
        list.add("rfet");
        list.add("qaws");
        list.add("zxcv");
        list.add("vcxz");
        list.add("zxc");
        list.add("cxz");
        list.add("xsw");
        list.add("wsx");
        list.add("qaz");
        list.add("zaq");
        list.add("rf");
        list.add("ws");

        list.forEach(v -> System.out.println(v.length()));
        System.out.println();
        list.forEach(v -> {
            if (!v.isEmpty() && !v.contains("d"))
                System.out.println(v);
        });

        System.out.println();
        list.stream().sorted().forEach(System.out::println);
    }
}