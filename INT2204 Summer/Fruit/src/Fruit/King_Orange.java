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
public class King_Orange extends Orange{

    public King_Orange(int price, int weight) {
        super(price, weight);
    }

    @Override
    public String origin() {
        return "Vietnam";
    }

    @Override
    public String distribution() {
        return "Ha Giang, Yen Bai, Tuyen Quang";
    }
    
}
