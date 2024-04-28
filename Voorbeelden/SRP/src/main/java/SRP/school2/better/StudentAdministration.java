package SRP.school2.better;

import java.util.ArrayList;
import java.util.List;
/** Stelt de studenteninformatie van de studentadministratie voor  */
public class StudentAdministration {
    private final List<Student> students = new ArrayList<>();

    /** Probleem: geeft alle studenten terug. Doorbreekt data hiding en encapsulation
     Deze method wordt vervangen door een versie welke een kopij teruggeeft
    /*
    public static List<Student> getStudents() {
        return students;
    }*/
    /** Geeft de studenten terug van een bepaalde klas, vb 1TI-3-4 */
    public List<Student> getStudents(final String klass) {
        List<Student> klas = new ArrayList<>(); //Maak een nieuwe lijst welke teruggegeven wordt
        for (Student s : students) {
            if(true ) { //TODO maak een test welke de klas van de student controleert
                klas.add(s);
            }
        }
        return klas;
    }
    //voorbeeld van een vervangende methode welke niet alle studenten, maar enkel de relevante informatie teruggeeft.
    public Double averageAge() { //TODO implement
        return null;
    }


    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public Student getStudentByName(String name) {//TODO implement
        return null;
    }

    public Student getStudentByIdentitycard(String identitycard) { //TODO implement
        return null;
    }

    private void detectDuplicateStudents() {
    }
    // and many more studentadministration methods
    @Override
    public String toString() {
        return "StudentAdministration{" +
                "students=" + students.toString() +
                '}';
    }
}
