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
public abstract class Shape {

    private String color;
    private boolean filled;
    
    //centre coordinates
    private double x = 0;
    private double y = 0;

    //constructor
    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
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
    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    @Override
    public abstract String toString();
}
