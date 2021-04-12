package com.patterns;

public class GasolineCar extends Car {
    public GasolineCar(String model, String
            color, int power, double space) {
        super(model, color, power, space);
    }

    public void showSpecs() {
        System.out.println(
                "Automovil de gasolina de modelo: " + model +
                        " de color: " + color + " de potencia: " +
                        power + " de espacio: " + space);
    }
}