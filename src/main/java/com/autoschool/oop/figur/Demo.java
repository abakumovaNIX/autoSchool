package com.autoschool.oop.figur;

import com.autoschool.oop.figur.inheritors.Circle;
import com.autoschool.oop.figur.inheritors.Square;
import com.autoschool.oop.figur.inheritors.Triangle;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {
        Figure[] array = new Figure[10];
        array[0] = new Circle(5);
        array[0].name = "a";
        array[1] = new Square(2);
        array[1].name = "b";
        array[2] = new Triangle(3, 4, 5);
        array[2].name = "c";
        array[3] = new Square(20);
        array[3].name = "d";
        array[4] = new Circle(10);
        array[4].name = "e";
        array[5] = new Square(3);
        array[5].name = "f";
        array[6] = new Triangle(5, 6, 9);
        array[6].name = "g";
        array[7] = new Triangle(10, 11, 14);
        array[7].name = "h";
        array[8] = new Square(25);
        array[8].name = "i";
        array[9] = new Circle(6);
        array[9].name = "j";

        List<Figure> sortedList = Arrays.stream(array)
                .sorted(Comparator.comparingDouble(Figure::area))
                .collect(Collectors.toList());

        sortedList.forEach(System.out::println);
    }
}