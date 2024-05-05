package SRP.school1.bad;

import java.util.ArrayList;
import java.util.List;

/** Beheert de studentenadministratie en bevat onze gebouwen, inschrijvingen,.... */
public class School {
    private final List<Student> students=new ArrayList<>();

    private final List<Building> locations=new ArrayList<>();
    // de inschrijvingen
    private final List<Enrollment> enrollments=new ArrayList<>();

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


     public void addBuilding(Building    building){
        locations.add(building);
    }
    public void removeBuilding(Building building){
        locations.remove(building);
    }
    public Building getBuildingByName(String name){//TODO implement
        return null;
    }
    public Building getBuildingByAddress(String address) {//TODO implement
        return null;
    }
    //and many more building related methods


    public void addEnrollment(Enrollment enrollment){
        enrollments.add(enrollment);
    }
    public void removeEnrollment(Enrollment enrollment){
        enrollments.remove(enrollment);
    }
    public Enrollment getLastEnrollmentByIdentitycard(String identitycard) { //TODO implement
        return null;
    }
    public Enrollment getLastEnrollmentByStudentName(String studentName) { //TODO implement
        return null;
    }
    public List<Enrollment> getEnrollmentsByStudentName(String studentName) {//TODO implement
        return null;
    }
    //and many more enrollement methods


}
