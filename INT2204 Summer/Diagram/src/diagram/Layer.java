/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram;

import java.util.ArrayList;

/**
 *
 * @author Go Eun Sung
 */
public class Layer {

    private boolean visible;

    //getter & setter
    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    ArrayList<Shape> layers = new ArrayList<>();

    //method
    public void deleteTriangle() {
        for (int i = 0; i < layers.size(); i++) {
            if (layers.get(i) instanceof Triangle) {
                layers.remove(i);
            }
        }
    }

    //duplicate
    public void deleteDuplicate() {
        if (layers.size() > 1) {
            for (int i = 0; i < layers.size(); i++) {
                for (int j = i + 1; j < layers.size(); j++) {
                    /*check same coordinates */
                    if (layers.get(i).getX() == layers.get(j).getX()
                            && layers.get(i).getY() == layers.get(j).getY()) {
                        //check same class?
                        if (layers.get(i) instanceof Circle
                                && layers.get(j) instanceof Circle) {
                            //check duplicate?
                            Circle a = (Circle) layers.get(i);
                            Circle b = (Circle) layers.get(j);
                            if (a.getRadius() == b.getRadius()) {
                                layers.remove(j);
                            }
                        }

                        //check same class?
                        if (layers.get(i) instanceof Triangle
                                && layers.get(j) instanceof Triangle) {
                            //check duplicate?
                            Triangle a = (Triangle) layers.get(i);
                            Triangle b = (Triangle) layers.get(j);
                            if (a.getA() == b.getA() && a.getB() == b.getB() && a.getC() == b.getC()) {
                                layers.remove(j);
                            }
                        }

                        //check same class?
                        if (layers.get(i) instanceof Rectangle
                                && layers.get(j) instanceof Rectangle) {
                            //check duplicate?
                            Rectangle a = (Rectangle) layers.get(i);
                            Rectangle b = (Rectangle) layers.get(j);
                            if (a.getLength() == b.getLength() && a.getWidth() == b.getWidth()) {
                                layers.remove(j);
                            }
                        }

                        //check same class?
                        if (layers.get(i) instanceof Square
                                && layers.get(j) instanceof Square) {
                            //check duplicate?
                            Square a = (Square) layers.get(i);
                            Square b = (Square) layers.get(j);
                            if (a.getSide() == b.getSide()) {
                                layers.remove(j);
                            }
                        }
                        //check same class?
                        if (layers.get(i) instanceof Hexagon
                                && layers.get(j) instanceof Hexagon) {
                            //check duplicate
                            Hexagon a = (Hexagon) layers.get(i);
                            Hexagon b = (Hexagon) layers.get(j);
                            if (a.getSide() == b.getSide()) {
                                layers.remove(j);
                            }
                        }
                    }
                }
            }
        }
    }
}
