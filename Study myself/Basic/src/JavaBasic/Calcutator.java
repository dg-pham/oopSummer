/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasic;

import java.util.Scanner;

/**
 *
 * @author Go Eun Sung
 */
public class Calcutator {
    public static void main(String[] args) {
        int a;
        int b;
        String calculation;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("FirstNum: ");
        a = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Calculation: ");
        calculation = sc.nextLine();
        
        System.out.println("SecondNum: ");
        b = sc.nextInt();
        sc.nextLine();
        
        sc.close();
        
        switch(calculation){
            case "+" :
                System.out.println("Result: " + (a + b));
                break;
                
            case "-" :
                System.out.println("Result: " + (a - b));
                break;
            
            case "x" :
            case "*" :
                System.out.println("Result: " + (a * b));
                break;
                
            case ":" :
            case "/" :
                System.out.println("Result: " + (a / b));
                break;
            
            case "%" :
                System.out.println("Result: " + (a % b));
                break;    
            
            default:
                System.out.println("Please retype!");
                break;
        }
    }
}
