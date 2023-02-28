package com.ua.robotdreams.homework10;

public class Child extends Parent{
    static {
        System.out.println("2 - Child static block");
    }

    public Child() {
        System.out.println("6 - Child constructor");
    }

    {
        System.out.println("5 - Child non-static block");
    }
}