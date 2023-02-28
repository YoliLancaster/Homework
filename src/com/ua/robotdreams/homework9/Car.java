package com.ua.robotdreams.homework9;

public class Car extends Vehicle {
    @Override
    protected String returnVehicleType() {
        return "I'm a car!";
    }
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public Engine getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(Engine typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", typeOfEngine=" + typeOfEngine +
                '}';
    }
}
