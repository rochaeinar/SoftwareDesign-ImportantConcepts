package com.patterns;

public class GasolineVehicleFactory implements VehicleFactory {
    @Override
    public Car createCar(String model, String color, int power, double space) {
        return new GasolineCar(model, color, power, space);
    }

    @Override
    public Scooter createScooter(String model, String color, int power) {
        return new GasolineScooter(model, color, power);
    }
}
