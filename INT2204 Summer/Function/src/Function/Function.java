/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

/**
 *
 * @author Go Eun Sung
 */
public class Function {
    
    //GCD method
    
    public int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        if (a <= b) {
            return gcd(b - a, a);
        } else {
            return gcd(b, a - b);
        }
    }

    //Fibonacci method
    
    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
