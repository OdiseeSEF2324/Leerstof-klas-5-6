package SRP.school1.better;

import java.util.ArrayList;
import java.util.List;
/** Stelt de studenteninformatie van de studentadministratie voor  */
public class StudentAdministration {
    private final List<Student> students=new ArrayList<>();
    public void addStudent(Student student){
        students.add(student);
    }
    public void removeStudent(Student student){ students.remove(student); }
    public Student getStudentByName(String name){//TODO implement
        return null;
    }
    public Student getStudentByIdentitycard(String identitycard) { //TODO implement
        return null;
    }
    private void detectDuplicateStudents(){ }
    // and many more studentadministration methods
}
