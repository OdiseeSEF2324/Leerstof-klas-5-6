package SRP.school3.bad;

import java.util.ArrayList;
import java.util.List;
/** Stelt de studenteninformatie van de studentadministratie voor  */
public class StudentAdministration {
    private final List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {return students;}

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
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
