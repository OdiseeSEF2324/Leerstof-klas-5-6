package SRP.school2.better;


import java.util.Date;

public class SomeOtherClass {
    public static void main(String[] args) {
        StudentAdministration students=new StudentAdministration();
        students.addStudent(new Student("joske", new Date()));
        System.out.println(students.getStudents("1TI-3-4"));
        students.getStudents("1TI-3-4").add(new Student("joske", new Date()));
        System.out.println(students.toString());
    }
}