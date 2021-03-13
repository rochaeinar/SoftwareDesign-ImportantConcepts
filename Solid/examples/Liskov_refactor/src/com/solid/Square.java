package com.solid;

public class Square implements Shape {

    private int width;

    public Square(int width) {
        this.width = width;
    }

    @Override
    public int CalculateArea() {
        return width * width;
    }
}