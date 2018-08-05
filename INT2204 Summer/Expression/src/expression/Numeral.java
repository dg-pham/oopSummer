/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expression;

/**
 *
 * @author Go Eun Sung
 */
public class Numeral extends Expression{

    private int value;

    //constructor
    public Numeral() {
    }

    public Numeral(int value) {
        this.value = value;
    }

    //getter & setter
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public int evaluate() {
        return this.getValue();
    }
}
