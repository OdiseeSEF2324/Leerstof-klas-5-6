package SRP.school2.bad;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/** Stelt alle studenten voor
 */
//De javadoc hierboven is een leugen: de class heeft een extra verantwoordelijkheid, namelijk 1 student voor te stellen
public class Student {
    // naam van de student
    private String name;
    private Date birthDate;

    private static List<Student> students = new ArrayList<Student>();

    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    // Getters en setters voor 1 student
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    // methods voor de lijst van studenten

    /** Probleem: geeft alle studenten terug. Doorbreekt data hiding en encapsulation
     */
    public static List<Student> getStudents() {
        return students;
    }

    public static void addStudent(Student student) {
        students.add(student);
    }
    public static void removeStudent(Student student) {
        students.remove(student);
    }
    public static Student getStudentByName(String name) {//TODO implement
        return null;
    }
    public static Student getStudentByIdentitycard(String identitycard) { //TODO implement
        return null;
    }
    private static void detectDuplicateStudents() {
    }
    // and many more studentadministration methods
}
