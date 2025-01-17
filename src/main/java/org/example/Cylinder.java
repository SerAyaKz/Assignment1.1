package org.example;

public class Cylinder {
    private double radius;
    private double height;

    // Constructor


    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Method to calculate the surface area of the cylinder
    public double surfaceArea() {
        double baseArea = Math.PI * radius * radius;
        double lateralArea = 2 * Math.PI * radius * height;
        return 2 * baseArea + lateralArea;
    }

    // Method to calculate the volume of the cylinder
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    // toString method to provide a string representation of the cylinder
    @Override
    public String toString() {
        return "Cylinder with radius: " + radius + " and height: " + height;
    }
}
