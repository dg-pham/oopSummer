/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjunit;

/**
 *
 * @author CCNE
 */
public class BMITest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BMI p1 = new BMI(1.62, 50);
        BMI p2 = new BMI(1.72, 50);
        BMI p3 = new BMI(1.30, 50);
        BMI p4 = new BMI(1.62, 60);
        BMI p5 = new BMI(1.82, 40);
        
//        System.out.println(p1.bmi());
        System.out.println(p2.comments());
        System.out.println(p3.comments());
        System.out.println(p4.comments());
        System.out.println(p5.comments());
        
    }
    
}
