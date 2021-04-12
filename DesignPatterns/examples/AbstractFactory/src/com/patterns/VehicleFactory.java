package com.patterns;

public interface VehicleFactory {
    Car createCar(String model, String color, int power, double space);

    Scooter createScooter(String model, String color, int power);
}
