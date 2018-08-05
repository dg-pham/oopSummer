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
public class Subtraction extends BinaryExpression{
    private Expression left;
    private Expression right;
    
    //constructor

    public Subtraction(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    
    public Subtraction(Numeral left, Numeral right) {
        this.left = left;
        this.right = right;
    }
    
    //getter & setter

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }
    

    @Override
    public Expression left() {
        return this.getLeft();
    }

    @Override
    public Expression right() {
        return this.getRight();
    }

    @Override
    public String toString() {
        return "-";
    }

    @Override
    public int evaluate() {
        return this.getLeft().evaluate() - this.getRight().evaluate();
    }
}
