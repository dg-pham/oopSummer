/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasic;

/**
 *
 * @author Go Eun Sung
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fraction fractionA = new Fraction(6, 9);
        Fraction fractionB = new Fraction(4, 7);
        Fraction fractionC = new Fraction(fractionA, fractionB, ".");
//        fractionA.nomalize();
        System.out.println(fractionA.print());
    }

}
