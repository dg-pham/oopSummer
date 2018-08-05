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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fruit fr1 = new CaoPhong_Orange(150, 120);
        Fruit fr2 = new King_Orange(200, 120);
        Fruit fr3 = new Apple(150, 150);
        
        args[0] = fr1.toString();
        System.out.println(args[0]);
    }
}
