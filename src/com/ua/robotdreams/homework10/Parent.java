package com.ua.robotdreams.homework10;

public class Parent {

    static {
        System.out.println("1 - Parent static block");
    }

    public Parent() {
        System.out.println("4 - Parent constructor");
    }

    {
        System.out.println("3 - Parent non-static block");
    }
}