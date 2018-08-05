/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

import java.util.Scanner;

/**
 *
 * @author Go Eun Sung
 */
public class BubbleSort {
    public void arrange(){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        sc.close();
        double a[] = new double[n];
        for(int i = 0; i < n; i++){
            a[i] = Math.random();
        }
        
        for(int i = 0; i < n; i++){
            for(int j = n - 1; j > i; j--){
                if(a[j] < a[j - 1]){
                    double tmp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = tmp;
                    
                }
            }
        }
        
        for(int i = 0; i < n; i++){
            System.out.println(a[i]);
        }
    }
}
