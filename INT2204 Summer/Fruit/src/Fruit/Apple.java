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
public class Apple extends Fruit {

    public Apple(int price, int weight) {
        super(price, weight);
    }

    @Override
    public String origin() {
        return "Xinjiang";
    }

    @Override
    public String distribution() {
        return "China producing 50% of the world total";
    }

}
