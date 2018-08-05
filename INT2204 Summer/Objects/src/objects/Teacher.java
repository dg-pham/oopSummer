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
public class Teacher {

    private String name;
    private String id;
    private String subject;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Constructor

    public Teacher(String name, String id, String subject, String email) {
        this.name = name;
        this.id = id;
        this.subject = subject;
        this.email = email;
    }
    
    //Getter & Setter
    public void showInfo() {
        System.out.println("name: " + this.getName());
        System.out.println("id: " + this.getId());
        System.out.println("subject: " + this.getSubject());
        System.out.println("email: " + this.getEmail());
    }
    
    //teaching method
    public void teach(String a){
        System.out.println(this.getName() + "teaches" + a);
    }
}
