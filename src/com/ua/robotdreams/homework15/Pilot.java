package com.ua.robotdreams.homework15;

public class Pilot extends Human {
    @Override
    public void takeOff() {
        System.out.println("Fasten your seatbelts! We're taking off!");
    }

    @Override
    public void flying() {
        System.out.println("Look! We're flying!");
    }

    @Override
    public void landing() {
        System.out.println("Get ready! We're going to land!");
        System.out.println("\n");
    }
    @Override
    public void canDo() {
        System.out.println("I can fly a plane!");
    }
}