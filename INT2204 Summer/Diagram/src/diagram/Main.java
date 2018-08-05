/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram;

/**
 *
 * @author Go Eun Sung
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Diagram d1 = new Diagram();
        Layer l1 = new Layer();
        Shape s1 = new Triangle(3, 4, 5);
        Shape s2 = new Circle(10);
        Shape s3 = new Triangle(3, 4, 5);
        Shape s4 = new Rectangle(10, 5);
        l1.layers.add(s1);
        l1.layers.add(s2);
        l1.layers.add(s3);
        l1.layers.add(s4);
        d1.diagrams.add(l1);
        
//        l1.deleteTriangle();
//        System.out.println(l1.layers.get(0));
        
//        l1.deleteDuplicate();
//        System.out.println(l1.layers);
        d1.classify();
        
        System.out.println(d1.diagrams.get(0).layers);
//        System.out.println(s1.getClass() == s2.getClass());
    }
} 