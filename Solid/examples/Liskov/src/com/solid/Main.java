package com.solid;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(10);
        rectangle.setWidth(5);
        System.out.println("Area : " + rectangle.CalculateArea());
    }


    void test(Rectangle rectangle) throws Exception {
        rectangle.setWidth(5);
        rectangle.setLength(4);
        if (rectangle.CalculateArea() != 20)
            throw new Exception("Bad area!");
    }
}


