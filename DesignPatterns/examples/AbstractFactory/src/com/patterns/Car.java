package com.patterns;

public abstract class Car {
    protected String model;
    protected String color;
    protected int power;
    protected double space;

    public Car(String model, String color, int power, double space) {
        this.model = model;
        this.color = color;
        this.power = power;
        this.space = space;
    }

    public abstract void showSpecs();
}