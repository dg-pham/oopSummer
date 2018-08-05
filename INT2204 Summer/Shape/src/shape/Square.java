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
public class Square extends Rectangle {

    private double side;

    //constructor
    public Square() {
    }

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        this.side = side;
    }

    //getter & setter
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    
    public void setWidth(double side) {
        side = this.getSide();
        this.setLength(side);
    }

    @Override
    public void setLength(double side) {
        side = this.side;
        this.setLength(side);
    }

    public String toString() {
        return "This Square: " + "\n"
                + "color: " + this.getColor() + " & isFilled: " + this.isFilled() + "\n"
                + "if side = " + this.getSide()
                + " then area = " + this.getArea() + " & perimeter = " + this.getPerimeter() + "\n";
    }
}
