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
public class ExpressionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Expression ex = new Square(new Addition(new Subtraction(new Square(new Numeral(10)), new Numeral(1))
                ,new Multiplication(new Numeral(2), new Numeral(3))));
        System.out.println(ex.evaluate());
        Expression ex1 = new Division(new Numeral(3), new Numeral(0));
        try{
            System.out.println(ex1.evaluate());
        } catch(Exception e){
            System.out.println("Lỗi chia cho 0");
        }
    }

   
}
