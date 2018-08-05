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
public abstract class Shape {

    private String color = "red";
    private boolean filled = true;

    //constructor
    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    //getter & setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (this.filled == true) {
            this.color = color;
        }
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public abstract String toString();
}
