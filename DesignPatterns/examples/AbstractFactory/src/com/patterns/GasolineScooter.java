package com.patterns;

public class GasolineScooter extends Scooter {
    public GasolineScooter(String model, String color,
                           int power) {
        super(model, color, power);
    }

    public void showSpecs() {
        System.out.println("Scooter de gasolina de modelo: " +
                model + " de color: " + color +
                " de potencia: " + power);
    }

}