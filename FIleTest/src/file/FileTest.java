/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Go Eun Sung
 */
public class FileTest {

    public List<String> getAllFunctions(String path) {
        File f = new File(path);
        FileReader fr = null;
        BufferedReader br = null;
        String line = "";
        ArrayList<String> l = new ArrayList();
        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            if (f.exists()) {
                if (f.getAbsolutePath().endsWith(".java")) {
                    while ((line = br.readLine()) != null) {
                        if (line.contains("public static")) {
//                            String[] s = line.split(" ");
                            l.add(line.substring(0, line.length() - 2).replace("throws IOException", ""));
                        }
                    }
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileTest.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(FileTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return l;
    }

//
    public String findFunctionByName(String name) {
        File f = new File("C:\\Users\\Go Eun Sung\\Documents\\NetBeansProjects\\FIleTest\\src\\filetest\\Utils.java");
        List<String> list = getAllFunctions("C:\\Users\\Go Eun Sung\\Documents\\NetBeansProjects\\FIleTest\\src\\filetest\\Utils.java");
        Set<String> s = new HashSet(list);
        Set<String> s1 = new HashSet();
        String[] s0 = name.replace("(", " ").replace(")", " ").replace(",", " ").split(" ");
        for(String t : s0){
            s1.add(t);
        }
        
        for (String i : s) {
            for(String j : s1)
            if (i.replace("(", " ").replace(")", "").replace(",", " ").contains(
                    j.replace("(", " ").replace(")", " ").replace(",", " "))) {
                return i.trim();
            }
        }
        return "";
    }

}
