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
public class Painting {

    private String name, artist;
    private int year;

    //Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //Constructor
    public Painting(String name, String artist, int year) {
        this.name = name;
        this.artist = artist;
        this.year = year;
    }

    //get info
    public void showInfo() {
        System.out.println("name: " + this.getName());
        System.out.println("artist: " + this.getArtist());
        System.out.println("year: " + this.getYear());
    }
}
