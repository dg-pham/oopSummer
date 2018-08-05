/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

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
        Shape s1 = new Circle(10);
        Shape s2 = new Rectangle(10, 15);
        Shape s3 = new Square(10);
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
    
}
