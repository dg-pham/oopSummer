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
public abstract class BinaryExpression extends Expression{

    public abstract Expression left();

    public abstract Expression right();

}
