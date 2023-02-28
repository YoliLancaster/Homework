package com.ua.robotdreams.homework9;

public class Truck extends Car{

    protected boolean isLightReflector;
    protected boolean isFoldingTrunk;

    public Truck(String model, int yearOfProduction, Engine typeOfEngine, boolean isLightReflector, boolean isFoldingTrunk) {
        super(model, yearOfProduction, typeOfEngine);
        this.isLightReflector = isLightReflector;
        this.isFoldingTrunk = isFoldingTrunk;
    }


    @Override
    public String getTypeOfCar() {

        return "I'm a Truck Car";
    }


    public boolean getIsLightReflector() {
        return isLightReflector;
    }

    public void setLightReflector(boolean lightReflector) {
        isLightReflector = lightReflector;
    }

    public boolean getIsFoldingTrunk() {
        return isFoldingTrunk;
    }

    public void setFoldingTrunk(boolean foldingTrunk) {
        isFoldingTrunk = foldingTrunk;
    }


    @Override
    public String toString() {
        return "Mercedes{" +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", typeOfEngine=" + typeOfEngine +
                "isLightReflector=" + isLightReflector +
                ", isFoldingTrunk=" + isFoldingTrunk +
                '}';
    }
}
