package com.solid;

public class Square extends Rectangle {

    @Override
    public int CalculateArea() {
        return getWidth() * getWidth();
    }
}