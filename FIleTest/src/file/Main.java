/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;

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
        FileTest ft = new FileTest();
        File f = new File("C:\\Users\\Go Eun Sung\\Documents\\NetBeansProjects\\FIleTest\\src\\filetest\\Utils.java");
//        System.out.println(ft.getAllFunctions(f.getAbsolutePath()));
        System.out.println(ft.findFunctionByName("findFileByName(String,String)"));
        System.out.println(ft.findFunctionByName("main(String[])"));
        System.out.println(ft.findFunctionByName("writeContentToFile(String)"));
        System.out.println(ft.findFunctionByName("readContentFromFile(String)"));       
    }
    
}
