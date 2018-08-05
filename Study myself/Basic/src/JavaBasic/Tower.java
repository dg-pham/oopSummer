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
public class Tower {

    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            for (int s = 5; s > i; s--) {
                System.out.print(" ");
            }

            for (int l = i; l >= 1; l--) {
                System.out.print(l);
            }

            for (int r = 2; r <= i; r++) {
                System.out.print(r);
            }

            System.out.println();
        }
    }
}
