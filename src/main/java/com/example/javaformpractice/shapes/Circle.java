package com.example.javaformpractice.shapes;

public class Circle implements IShape, IRound{
    private double radius; // field

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2); //radius^2
    }
}
