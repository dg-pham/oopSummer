/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Go Eun Sung
 */
public class Circle extends Shape {

    private double radius = 1.0;
    final double PI = 3.14;

    //constructor
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    //getter & setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    //method
    public double getArea() {
        return this.PI * this.getRadius() * this.getRadius();
    }

    public double getPerimeter() {
        return 2 * (this.PI * this.getRadius() * this.getRadius()) / this.getRadius();
    }

    @Override
    public String toString() {
        return "This Circle: " + "\n"
                + "color: " + this.getColor() + " & isFilled: " + this.isFilled() + "\n"
                + "if radius = " + this.getRadius()
                + " then area = " + this.getArea() + " & perimeter = " + this.getPerimeter() + "\n";
    }

}
