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
public class Rectangle extends Shape {

    private double width = 1.0, length = 1.0;

    //constructor
    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
        
    }

    //getter & setter
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        }
    }

    public double getArea() {
        return this.getLength() * this.getWidth();
    }

    public double getPerimeter() {
        return 2 * (this.getLength() + this.getWidth());
    }

    @Override
    public String toString() {
        return "This Rectangle: " + "\n"
                + "color: " + this.getColor() + " & isFilled: " + this.isFilled() + "\n"
                + "if width = " + this.getWidth() + " length = " + this.getLength()
                + " then area = " + this.getArea() + " & perimeter = " + this.getPerimeter() + "\n";
    }
}
