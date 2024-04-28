package unittests.vorm;

import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentAdministrationTest {

    /**
     * BAD test: de naam moet volgens het schema ACT_ARRANGE_ASSERT
      */
    @Test
    void testGetStudentByName() {
    }

    /**
     * BAD test: geen assert aanwezig
     * Geen println gewenst! We willen dit automatiseren zodat de computer test en niet wijzelf dit moeten controleren.
     */
    @Test
    void addStudent_givenJake_containsJake() {
        Student jamil = new Student("Jamil",new Date());
        Student jake = new Student("Jake",new Date());
        StudentAdministration administration = new StudentAdministration();
        administration.addStudent(jamil);
        administration.addStudent(jake);
        System.out.println(administration); //yep die zit erin
    }

    /**
     * BAD test: testen van libraries
     * Wat testen we hier eigenlijk? Dat de add op de List<Student> goed gebeurd is.
     * Dat is de functionaliteit van de ArrayList testen, want addStudent bevat slechts 1 function call
     * Deze test mag daarom weggelaten worden.
     */
    @Test
    void addStudent_givenJane_containsJane() {
        //ARRANGE
        Student jamil = new Student("Jamil",new Date());
        Student jane = new Student("Jane",new Date());
        StudentAdministration administration = new StudentAdministration();
        administration.addStudent(jamil);
        //ACT
        administration.addStudent(jane);
        //ASSERT
        assertEquals( 2,administration.getStudents().size());// test alle zijeffecten
        assertTrue(administration.getStudents().contains(jane));
    }

    /** Bad test: niet alle effecten zijn gecontroleerd. Het is mogelijk dat er 2 niet duplicates worden teruggegeven.
     * Test ook of het de correcte studenten zijn.
     */
    @Test
    void detectDuplicates_Given2StudentsSameName_return2Students() {
        //ARRANGE
        Student jamil1 = new Student("Jamil",new Date());
        Student jamil2 = new Student("Jamil",new Date());
        Student jane = new Student("Jane",new Date());
        StudentAdministration administration = new StudentAdministration();
        administration.addStudent(jane);
        administration.addStudent(jamil1);
        administration.addStudent(jamil2);
        //ACT
        List<Student> actual=administration.detectDuplicateStudents();
        //ASSERT
        assertEquals(2,actual.size());  // Nodige test maar niet voldoende. Check ook of de juiste studenten gevonden zijn
    }


    /**
     * GOOD tests
     */
    @Test
    void getStudentByName_GivenSeveralStudents_RetrieveJamil() {
        //ARRANGE
        Student jamil = new Student("Jamil",new Date());
        Student jane = new Student("Jane",new Date());
        Student john = new Student("John",new Date());
        StudentAdministration administration = new StudentAdministration();
        administration.addStudent(jane);
        administration.addStudent(jamil);
        administration.addStudent(john);
        //ACT
        Student found=administration.getStudentByName("Jamil");
        //ASSERT
        assertEquals(jamil,found);
    }

    @Test
    void detectDuplicates_Given3StudentsSameName_return3Students() {
        //ARRANGE
        Student jamil1 = new Student("Jamil",new Date());
        Student jamil2 = new Student("Jamil",new Date());
        Student jane = new Student("Jane",new Date());
        Student john = new Student("John",new Date());
        StudentAdministration administration = new StudentAdministration();
        administration.addStudent(jane);
        administration.addStudent(jamil1);
        administration.addStudent(jamil2);
        administration.addStudent(john);
        administration.addStudent(jamil1);
        //ACT
        List<Student> actual=administration.detectDuplicateStudents();
        //ASSERT
        assertEquals(3,actual.size());  // Nodige test maar niet voldoende. Check ook of de juiste studenten gevonden zijn
        assertTrue(actual.contains(jamil1));
        assertTrue(actual.contains(jamil2));
    }

}