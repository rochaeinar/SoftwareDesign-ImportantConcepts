package com.solid;

public class Main {

    public static void main(String[] args) {
        Shape shape = new Rectangle(2, 5);

        System.out.println("Area : " + shape.CalculateArea());
    }

    void test(Shape shape) throws Exception {
        if (shape.CalculateArea() != 20)
            throw new Exception("Bad area!");
    }
}


