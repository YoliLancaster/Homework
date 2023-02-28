package com.ua.robotdreams.homework9;

public class Main {

    public class Main {
        public static void main(String[] args) {
            Vehicle vehicle = new Vehicle();
            vehicle.returnVehicleType();
            vehicle.makeSound();

            Car car = new Car();
            car.returnVehicleType();
            car.makeSound();

            Truck truck = new Truck();
            truck.returnVehicleType();
            truck.makeSound();

            Vehicle vehicle2 = new Truck();
            vehicle2.returnVehicleType();
            vehicle2.makeSound();
        }
}
