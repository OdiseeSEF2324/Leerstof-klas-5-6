package SRP.school2.bad;

import java.util.Date;

public class SomeOtherClass {
    public static void main(String[] args) {
        Student.addStudent(new Student("joske", new Date()));
        System.out.println(Student.getStudents());
        Student.getStudents().add(new Student("joske", new Date()));
        System.out.println(Student.getStudents());
    }
}