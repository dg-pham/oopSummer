/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Go Eun Sung
 */
public class Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //NullPoiterException
//        npe();

        //ArrayIndexOutOfBoundsException
//        aioobe();
        //ArithmeticException
//        ae();
        //ClassCastException
//        Something c = new Something();
//        c.get(c);
        //IOException
        ioe();
        //FileNotFoundException
//        fnfe();
    }

    public static void npe() throws NullPointerException {
//               NullPoiterException
        Object a = null;
        System.out.println(a.toString());
    }

    public static void aioobe() throws ArrayIndexOutOfBoundsException {
        //ArrayIndexOutOfBoundsException
        int[] b = new int[2];
        System.out.println(b[3]);
    }

    public static void ae() throws ArithmeticException {
        System.out.println(1 / 0);
    }

    public static void cce() throws ClassCastException {
        Something c = new Something();
        c.get(c);
    }

    public static void ioe() throws IOException {
        throw new IOException();
    }

    public static void fnfe() throws FileNotFoundException {
        try (BufferedReader br = new BufferedReader(new FileReader("0021l.txt"))) {
            br.readLine();

        } catch (IOException ex) {
            Logger.getLogger(Exceptions.class.getName()).log(Level.SEVERE, null, ex);                   
        }
    }
}
