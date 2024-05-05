package SRP.school3.bad;

public class StudentAdministrationZoekStudent {
    private StudentAdministration sa;

    public StudentAdministrationZoekStudent(StudentAdministration sa) {
        this.sa = sa;
    }

    public Student getStudentByName(String name) {
        for (Student student : sa.getStudents() ){
            if (student.getName().equals(name)){
                    return student;
                }
        }
        return null;
    }

    public Student getStudentByIdentitycard(String identitycard) { //TODO implement
        return null;
    }

    //TODO maak een method welke zoekt op email
    //TODO maak een method welke zoekt op studentennr
    //TODO maak een method welke zoekt op naam en geboortedatum
    //TODO maak een method welke zoekt op login
    // en nog meer
}
