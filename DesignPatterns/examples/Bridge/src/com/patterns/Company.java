package com.patterns;

public abstract class Company {

    private final CarProductSecurity carProductSecurity;
    private final String carType;

    public Company(CarProductSecurity carProductSecurity, String carType) {
        this.carProductSecurity = carProductSecurity;
        this.carType = carType;
    }

    public abstract void assemble();

    public abstract void produceProduct();

    public void printDetails() {
        System.out.println("Car: " + carType + ", Product:" + carProductSecurity.productName());
    }
}
