package com.patterns;

public class CompanyB extends Company {

    private final CarProductSecurity carProductSecurity;
    private final String carType;

    public CompanyB(CarProductSecurity carProductSecurity, String carType) {
        super(carProductSecurity, carType);
        this.carProductSecurity = carProductSecurity;
        this.carType = carType;
    }

    @Override
    public void assemble() {
        System.out.println("Assembling " + carProductSecurity.productName() + " for " + carType);
    }

    @Override
    public void produceProduct() {
        carProductSecurity.produce();
        System.out.println("Modifying product " + carProductSecurity.productName() + " according to " + carType);
    }

}
