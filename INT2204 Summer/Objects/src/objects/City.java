/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author Go Eun Sung
 */
public class City {

    private String name;
    private int acreage, population;

    //Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAcreage() {
        return acreage;
    }

    public void setAcreage(int acreage) {
        if (acreage > 0) {
            this.acreage = acreage;
        }
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if (population > 0) {
            this.population = population;
        }
    }

    //Constructor
    public City(String name, int acreage, int population) {
        this.name = name;
        this.acreage = acreage;
        this.population = population;
    }

    //get info
    public void showInfo() {
        System.out.println("name: " + this.getName());
        System.out.println("acreage: " + this.getAcreage() + "m2");
        System.out.println("population: " + this.getPopulation());
        System.out.println("Density" + this.Density() + "p/m2");
    }

    //get the Density
    public int Density() {
        return getPopulation() / getPopulation();
    }
}
