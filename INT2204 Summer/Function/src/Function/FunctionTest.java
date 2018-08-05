package Function;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Go Eun Sung
 */
public class FunctionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Function func = new Function();

//        System.out.println(func.gcd(10, 15));
//        System.out.println(func.fibonacci(5));

        Fraction frA = new Fraction(6, 9);
        Fraction frB = new Fraction(12, 18);
        Fraction frC = new Fraction(frA, frB, ".");
        
        frA.nomalize();
        frB.nomalize();
//        System.out.println(frC.print());
        System.out.println(frA.equals(frB));
    }
}
