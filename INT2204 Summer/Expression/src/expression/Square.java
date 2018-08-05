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
public class Square extends Expression {

    private Expression expression = new Numeral();

    //constructor
    public Square(Expression expression) {
        this.expression = expression;
    }

    //getter & setter
    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "^2";
    }

    @Override
    public int evaluate() {
        return this.getExpression().evaluate() * this.getExpression().evaluate();
    }

}
