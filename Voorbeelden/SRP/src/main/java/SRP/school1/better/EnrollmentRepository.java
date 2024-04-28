package SRP.school1.better;

import java.util.ArrayList;
import java.util.List;

public class EnrollmentRepository {
    // de inschrijvingen
    private final List<Enrollment> enrollments = new ArrayList<>();


    public void addEnrollment(Enrollment enrollment) {
        enrollments.add(enrollment);
    }

    public void removeEnrollment(Enrollment enrollment) {
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
