package com.patterns;

public class ElectricVehicleFactory implements VehicleFactory {
    @Override
    public Car createCar(String model, String color, int power, double space) {
        return new ElectricCar(model, color, power, space);
    }

    @Override
    public Scooter createScooter(String model, String color, int power) {
        return new ElectricScooter(model, color, power);
    }
}
