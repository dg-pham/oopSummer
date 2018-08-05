/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram;

/**
 *
 * @author Go Eun Sung
 */
public class Triangle extends Shape {
    
    // sides
    private double a = 1.0, b = 1.0, c = 1.0;
    //constructor
    public Triangle() {

    }
    
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public Triangle(double a, double b, double c, String color, boolean filled) {
        super(color, filled);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //getter&setter
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    //gets area, perimeter
    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "This Triangle: " + "\n"
                + "color: " + this.getColor() + " & isFilled: " + this.isFilled() + "\n"
                + "sides = " + this.getA() + "," + this.getB() + "," + this.getC()
                + " then area = " + this.getArea() + " & perimeter = " + this.getPerimeter() + "\n";
    }
}
