package objectandclass;

import java.lang.Math;

public class GeometricCircle extends Geometric {
    private double radius;

    public GeometricCircle() {
    }

    public GeometricCircle(double radius) {
        this.radius = radius;
    }

    public GeometricCircle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void printCircle() {
        System.out.println("The circle is created" + getDateCreated() + "the radius is"
                + radius);
        super.getDateCreated();


    }
}
