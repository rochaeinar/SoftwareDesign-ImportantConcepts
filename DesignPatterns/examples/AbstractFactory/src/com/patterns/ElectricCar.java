package com.patterns;

public class ElectricCar extends Car {
    public ElectricCar(String model, String
            color, int power, double space) {
        super(model, color, power, space);
    }

    public void showSpecs() {
        System.out.println(
                "Automovil electrico de modelo: " + model +
                        " de color: " + color + " de potencia: " +
                        power + " de espacio: " + space);
    }
}