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
public class Gamer {

    private String name, team, rank;
    private int age;

    //Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    //Constructor
    public Gamer(String name, String team, String rank, int age) {
        this.name = name;
        this.team = team;
        this.rank = rank;
        this.age = age;
    }

    //get info
    public void showInfo() {
        System.out.println("name: " + this.getName());
        System.out.println("age: " + this.getAge());
        System.out.println("team: " + this.getTeam());
        System.out.println("rank: " + this.getRank());
    }

    //get game's name
    public String Gamming(String a) {
        return this.getName() + "is playing" + a;
    }
}
