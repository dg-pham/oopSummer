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
public class Students {

    private String name;
    private String id;
    private String group;
    private String email;

    //Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Constructor
    public Students(String name, String id, String group, String email) {
        this.name = name;
        this.id = id;
        this.group = group;
        this.email = email;
    }
    
    //get info
    public void showInfo() {
        System.out.println("name: " + this.getName());
        System.out.println("id: " + this.getId());
        System.out.println("group: " + this.getGroup());
        System.out.println("email: " + this.getEmail());
    }
    
    //study method
    public void study(String a){
        System.out.println(this.getName() + "is studying" + a);
    }
}
