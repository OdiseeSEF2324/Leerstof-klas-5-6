package unittests.vorm;

import java.util.ArrayList;
import java.util.List;

/** Stelt de studenteninformatie van de studentadministratie voor  */
public class StudentAdministration {
    private final List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    // Is deze methode enkel gebruikt in de unit tests, maar niet in de productiecode? Verwijder het dan!
    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public int getStudentCount() {return students.size();}

    /** find a student with the give name
     * @param name to search for
     * @return the student with the given name
     */
    public Student getStudentByName(String name) {
        return students.stream().filter(s -> s.getName().equals(name))
                .findFirst().orElse(null);
    }

    /** detect all students with the same name
     * @return all students that share a name with at least 1 other student
     * */
    public List<Student> detectDuplicateStudents() {
        List<Student> duplicates = new ArrayList<>();
        students.forEach(s -> {
            if (students.stream().filter(s1 -> s1.getName().equals(s.getName())).count() > 1) {
                duplicates.add(s);
            }
        });
        return duplicates;
    }
    // and many more studentadministration methods

    @Override
    public String toString() {
        return "StudentAdministration{" +
                "students=" + students +
                '}';
    }
}
