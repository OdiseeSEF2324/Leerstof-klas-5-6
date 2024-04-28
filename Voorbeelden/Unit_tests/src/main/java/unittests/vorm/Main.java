package unittests.vorm;

import java.util.Date;

public class Main {
    /**
     * GEEN main nodig om je code te testen. Maak unit tests.
     */
    public static void main(String[] args) {
        Student student= new Student("Jozef",new Date(110,3,5));
        StudentAdministration administration = new StudentAdministration();
        administration.addStudent(student);
        System.out.println(administration); //Waarom? Om te controleren of je code werkt? Jij moet niet controleren, schrijf code om dat voor jou te doen.
        administration.removeStudent(student);
        System.out.println(administration);

    }


    /** Verkeerde plaats. De src dir bevat productiecode en geen testcode. Je wilt je testcode niet naar je klanten sturen.
     * Maak een test directory aan volgens de gezien methode.
     */
    void toString_given_returnsSameValues() {
        Student student = new Student(null,new Date(100,0,1));
        String text=student.toString();
        //Assert.assertEquals("Student{name='null', birthDate=Sat Jan 01 00:00:00 CET 2000}", text);
    }
}
