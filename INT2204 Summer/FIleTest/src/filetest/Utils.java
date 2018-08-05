/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filetest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Go Eun Sung
 */
public class Utils {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//write
//        writeContentToFile("C:\\Users\\Go Eun Sung\\Documents\\NetBeansProjects\\Utils\\The a.b.c murders.txt");
//read     
//        try {
//            // TODO code application logic here
//            System.out.print(readContentFromFile("C:\\Users\\Go Eun Sung\\Documents\\NetBeansProjects\\Utils\\The a.b.c murders.txt"));
//        } catch (IOException ex) {
//            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
//        }
//find
        try {
            File a = findFileByName("C:\\Users\\Go Eun Sung\\Documents\\NetBeansProjects\\FIleTest", "The a.b.c murders.txt");
            System.out.println(a.getName());
        } catch (NullPointerException e) {
            System.out.println("no file is found");
        }
    }

    public static String readContentFromFile(String path) throws IOException {

        FileReader fr = null;
        BufferedReader br = null;

        try {

            //read
            File f = new File(path);
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return "";
    }

    public static void writeContentToFile(String path) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        String data;
        try {
            //set path
            Scanner sc = new Scanner(System.in);
            data = sc.nextLine();
            sc.close();

            //read
            File f = new File(path);
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            bw.write("\n" + data);
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public static File findFileByName(String folderPath, String fileName) {
        File f = new File(folderPath);
        File f0 = new File(fileName);
        if (f.exists()) {
            if (f.isDirectory()) {
                File[] list = f.listFiles();
                if (list != null) {
                    for (File file : list) {
                        if (file.isFile() && file.getName().equals(fileName)) {
                            return f0;
                        }
                    }
                }
            }
        }

        return null;
    }
}
