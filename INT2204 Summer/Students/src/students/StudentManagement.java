package students;

import java.util.ArrayList;

/**
 *
 * @author CCNE
 */
public class StudentManagement {

    //    properties
    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        //        create objects

        Student s1 = new Student("Pham Tuan Dung", "16021273", "K61T", "nurmengard.no1@gmail.com");
        Student s2 = new Student();
        Student s3 = new Student("a", "b", "c");
        Student s4 = new Student(s1);
        Student s5 = new Student("Marky", "001", "K61CLC", "marky.davinci@gmail.com");
        Student s6 = new Student("DeeDee", "002", "K61CLC", "gluttonous.deedee@gmail.com");
        Student s7 = new Student("Oggy", "000", "K61CB", "oggyoffical@gmail.com");

        //        add items
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);

        //        _print
        //        System.out.println(s1.getInfo());
        //        System.out.println(s2.getInfo());
        //        System.out.println(s3.getInfo());
        //        System.out.println(s4.getInfo());
        //        System.out.println(sameGroup(s5, s6));
        //        removeStudent("001");
        studentsByGroup();

    }

    //        method
    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup() == s2.getGroup();
    }

    public static void studentsByGroup() {
        // has trouble (thầy chữa giùm em. em cảm ơn!!!)
        
//        int i, j, x = -1;
//        int k[] = new int[students.size()];
//        for (i = 0; i < students.size(); i++) {
//            x++;
//
//            k[x] = i;
//            ArrayList<String> list = new ArrayList();
//            list.add(students.get(i).getName());
//            System.out.println("Group " + students.get(i).getGroup() + ":");
//
//            for (j = students.size() - 1; j > i; j--) {
//                if (sameGroup(students.get(i), students.get(j))) {
//                    list.add(students.get(j).getName());
//                }
//            }
//
//            for (int t = 0; t < list.size(); t++) {
//                System.out.println(list.get(t));
//            }
//            System.out.println();
//
//            if (i + 1 < students.size()) {
//                for (int t = 0; t < x + 1; t++) {
//                    while (sameGroup(students.get(k[t]), students.get(i + 1))) {
//                        i++;
//                        
//                    }
//
//                }
//            }
//
//            list.clear();
//        }

        // worse way
        
        System.out.println("Group K61T: ");
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getGroup() == "K61T") {
                System.out.println("." + students.get(i).getName());
            }
        }
        
        System.out.println("Group K61CB: ");
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getGroup() == "K61CB") {
                System.out.println("." + students.get(i).getName());
            }
        }
        
        System.out.println("Group K61CLC: ");
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getGroup() == "K61CLC") {
                System.out.println("." + students.get(i).getName());
            }
        }
        
    }

    public static void removeStudent(String id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
            }
        }
    }
}
