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
public class Novel {

    private String name, genre;
    private int year;

    //Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //Constructor
    public Novel(String name, String genre, int year) {
        this.name = name;
        this.genre = genre;
        this.year = year;
    }

    //get info
    public void showInfo() {
        System.out.println("name: " + this.getName());
        System.out.println("genre: " + this.getGenre());
        System.out.println("year: " + this.getYear());
    }
}
