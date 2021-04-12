package com.patterns;

public class Main {

    public static int nAutos = 3;
    public static int nScooters = 2;
    private static Car[] cars = new Car[nAutos];
    private static Scooter[] scooters = new Scooter[nScooters];


    public static void main(String[] args) {


        loadGasoline();
        loadElectric();

        showCars();
        showScooters();
    }

    private static void showScooters() {
        for (Scooter scooter : scooters)
            scooter.showSpecs();
    }

    private static void showCars() {
        for (Car auto : cars)
            auto.showSpecs();
    }

    private static void loadElectric() {
        ElectricVehicleFactory electricVehicleFactory = new ElectricVehicleFactory();
        for (int index = 0; index < nScooters; index++)

            scooters[index] = electricVehicleFactory.createScooter("clasico",
                    "rojo", 2 + index);
    }

    private static void loadGasoline() {
        GasolineVehicleFactory gasolineVehicleFactory = new GasolineVehicleFactory();
        for (int index = 0; index < nAutos; index++)
            cars[index] = gasolineVehicleFactory.createCar("estandar",
                    "amarillo", 6 + index, 3.2);
    }
}
