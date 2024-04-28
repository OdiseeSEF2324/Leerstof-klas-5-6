package SRP.school1.better;

import java.util.ArrayList;
import java.util.List;

/**
 * Verbindt de verschillende services/administraties/... van 1 school
 */
public class School {
    private final StudentAdministration students = new StudentAdministration();

    private final BuildingRegistration buildings=new BuildingRegistration();

    private final EnrollmentRepository enrollmentRepository=new EnrollmentRepository();

    public StudentAdministration getStudentAdministration() {return students;}
    public BuildingRegistration getBuildingRegistration() {return buildings;}
    public EnrollmentRepository getEnrollmentRepository() {return enrollmentRepository;}


}
