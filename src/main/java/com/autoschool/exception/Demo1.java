package com.autoschool.exception;

public class Demo1 {

    public static void main(String[] args) {
        Logic logic = new Logic();
        try {
            logic.threadMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            int zero = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("You shall not fall!");
        }
    }
}