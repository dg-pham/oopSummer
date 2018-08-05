/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjunit;

//import java.text.DecimalFormat;

/**
 *
 * @author CCNE
 */
public class BMI {

    private double height, weight;

    //getter & setter
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    //constructor
    public BMI(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    //get BMI index
    public double bmi() {
//        DecimalFormat df = new DecimalFormat("0.00");
        
        return (this.getWeight() / (this.getHeight() * this.getHeight()));
    }

    //judge base on the BMI 
    public String comments() {
        if (this.bmi() < 18.5) {
            return ("Thiếu cân");
        }
        else if (this.bmi() < 23 && this.bmi() >= 18.5) {
            return("Bình thường");
        }
        else if (this.bmi() < 25 && this.bmi() >= 23) {
            return("Thừa cân");
        } else {
            return("Béo phì");
        }
    }
}
