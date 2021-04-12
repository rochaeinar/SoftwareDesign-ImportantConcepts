package com.patterns;

public class ElectricScooter extends Scooter {
    public ElectricScooter(String model, String color,
                           int power) {
        super(model, color, power);
    }

    public void showSpecs() {
        System.out.println("Scooter electrica de modelo: " +
                model + " de color: " + color +
                " de potencia: " + power);
    }

}