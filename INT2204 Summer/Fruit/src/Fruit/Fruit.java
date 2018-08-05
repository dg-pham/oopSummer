/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fruit;

/**
 *
 * @author Go Eun Sung
 */
public abstract class Fruit {

    private int price, weight;

    //constructor
    public Fruit(int price, int weight) {
        this.price = price;
        this.weight = weight;
    }

    //getter & setter
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }
    
    //method
    public abstract String origin();
    public abstract String distribution();
  
}
