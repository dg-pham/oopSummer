/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjunit;

/**
 *
 * @author Go Eun Sung
 */
public class Functions {

    //get max
    public static int max(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    //get min
    public static int min(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min >= a[i]) {
                min = a[i];
            }
        }
        return min;
    }
}
