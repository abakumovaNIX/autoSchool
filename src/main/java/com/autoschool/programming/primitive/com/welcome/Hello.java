package com.autoschool.programming.primitive.com.welcome;

public class Hello {

    private String name;

    public String getName() {
        return name;
    }

    public void setupName(String name) {
        this.name = name;
    }

    public void welcome() {
        System.out.println("Hello, " + getName());
    }

    public void byeBay() {
        System.out.println("Bye, " + getName());
    }
}