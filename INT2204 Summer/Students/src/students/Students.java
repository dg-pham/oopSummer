/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students;

/**
 *
 * @author Go Eun Sung
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author CCNE
 */
class Student {

//    private String
    private String name;
    private String id;
    private String group;
    private String email;

//    constructor #1
    public Student(String name, String id, String group, String email) {
        this.name = name;
        this.id = id;
        this.group = group;
        this.email = email;
    }

//    constructor #2
    public Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K61CB";
        this.email = "uet@vnu.edu.vn";
    }

//    constructor #3
    public Student(String n, String sid, String em) {
        this.name = n;
        this.id = sid;
        this.group = "K61CB";
        this.email = em;
    }

//    constructor #4
    public Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

//     getter & setter
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

//    method
    public String getInfo() {
        return name + "\n" + id + "\n" + group + "\n" + email + "\n";
    }

}
