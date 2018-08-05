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
public class Hexagon extends Shape {

    private double side;

    //constructor
    public Hexagon() {
    }

    public Hexagon(double side) {
        this.side = side;
    }

    public Hexagon(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    //getter & setter
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    //get Area &perimmeter
    public double getArea() {
        return 3 * Math.sqrt(3) * this.side * this.side / 2;
    }

    public double getPerimeter() {
        return 6 * this.side;
    }

    public String toString() {
        return "This Hexagon: " + "\n"
                + "color: " + this.getColor() + " & isFilled: " + this.isFilled() + "\n"
                + "if side = " + this.getSide()
                + " then area = " + this.getArea() + " & perimeter = " + this.getPerimeter() + "\n";
    }

}
