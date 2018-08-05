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
public class Cat {

    private String name, breed;
    private int size;

    //Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size > 0) {
            this.size = size;
        }
    }

    //Constructor
    public Cat(String name, String breed, int size) {
        this.name = name;
        this.breed = breed;
        this.size = size;
    }

    //get info
    public void showInfo() {
        System.out.println("name: " + this.getName());
        System.out.println("size: " + this.getSize() + "kg");
        System.out.println("Breed: " + this.getBreed());
    }

    //sounding
    public void sound() {
        System.out.println("meow meow");
    }
}
