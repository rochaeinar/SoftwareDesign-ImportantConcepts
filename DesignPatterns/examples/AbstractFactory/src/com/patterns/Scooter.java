package com.patterns;

public abstract class Scooter {
    protected String model;
    protected String color;
    protected int power;

    public Scooter(String model, String color, int power) {
        this.model = model;
        this.color = color;
        this.power = power;
    }

    public abstract void showSpecs();
}