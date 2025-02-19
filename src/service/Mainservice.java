package service;

import model.Student;

public class Mainservice {

    public static void main(String[] args) {
        Student st1 = new Student();
        System.out.println(st1); 

        Student st2 = new Student( "John", "Green");
        System.out.println(st2);

        Student st3 = new Student("26377878", "4534434424");
        System.out.println(st3);

        Student st4 = new Student( "Alice", "Brown");
        System.out.println(st4);
    }
}
