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
public class Song {

    private String name, artist, composer;

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

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    //Constructor
    public Song(String name, String artist, String composer) {
        this.name = name;
        this.artist = artist;
        this.composer = composer;
    }

    //get info
    public void showInfo() {
        System.out.println("name: " + this.getName());
        System.out.println("artist: " + this.getArtist());
        System.out.println("composer: " + this.getComposer());
    }
}
