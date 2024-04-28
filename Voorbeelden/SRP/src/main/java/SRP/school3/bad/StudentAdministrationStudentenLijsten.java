package SRP.school3.bad;

import java.util.ArrayList;
import java.util.List;

public class StudentAdministrationStudentenLijsten {
    private StudentAdministration sa;

    public StudentAdministrationStudentenLijsten(StudentAdministration sa) {
        this.sa = sa;
    }


    /** Geeft de studenten terug van een bepaalde klas, vb 1TI-3-4 */
    public List<Student> getStudents(final String klass) {
        List<Student> klas = new ArrayList<>(); //Maak een nieuwe lijst welke teruggegeven wordt
        for (Student s : sa.getStudents()) {
            if(true ) { //TODO maak een test welke de klas van de student controleert
                klas.add(s);
            }
        }
        return klas;
    }

    //TODO method voor studenten per opleiding en jaar
    //TODO method voor studenten per vak en jaar
    //TODO method voor studenten per jaar en klas
    //TODO method voor geslaagde studenten per vak
    //TODO method voor studenten in EP3
    //en nog meer

}
