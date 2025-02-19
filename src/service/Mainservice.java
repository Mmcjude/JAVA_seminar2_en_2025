package service;

import model.Student;
import model.Professor;
import model.Degree;
import model.Grade;
import model.Course;

public class Mainservice {

    public static void main(String[] args) {
        // Testing Student class
        Student st1 = new Student();
        System.out.println(st1);

        Student st2 = new Student("John", "Green");
        System.out.println(st2);

        Student st3 = new Student("mercy", "launtner"); 
        System.out.println(st3);

        Student st4 = new Student("Alice", "Brown");
        System.out.println(st4);

        // Testing Professor class
        Professor p1 = new Professor();
        System.out.println(p1);

        Professor p2 = new Professor("James", "Smith", Degree.dr);
        System.out.println(p2);

        Professor p3 = new Professor("Martha", "Vim", Degree.mg);
        System.out.println(p3);
        
        Course c1 = new Course();
        System.out.println(c1);
        
        Course c2 = new Course("Java Programming", 5, p2);
        System.out.println(c2);
        
        Course c3 = new Course("OOP python", 6 , p3);
        System.out.println(c3);
        
        
        
        
        
        
    }
}

        
        