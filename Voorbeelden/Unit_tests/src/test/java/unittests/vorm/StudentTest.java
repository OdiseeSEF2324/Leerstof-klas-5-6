package unittests.vorm;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    /**
     * Onnodige test. Test enkel niet triviale functies.
     * Een simpele setter, setter of Constructor is een triviale functie
     */
    @Test
    void getName_givenNone_returnNull() {
        Student student = new Student(null,new Date());
        assertNull(student.getName());
    }

    /**
     * Onnodige test. Is deze toString triviaal? Ja
     * Een method is niet triviaal als er een if of een loop gebruikt wordt.
     */
    @org.junit.jupiter.api.Test
    void toString_given_returnsSameValues() {
        Student student = new Student(null,new Date(100,0,1));
        String text=student.toString();
        assertEquals("Student{name='null', birthDate=Sat Jan 01 00:00:00 CET 2000}", text);
    }

    /** Bad test: niet alle paden van de if worden getest. Alle unit tests samen moeten alle lijnen code testen (van niet triviale functies)
     */
    @Test
    void getLeeftijdscategorie_givenDatesFor5and7_returnCorrectCategory() {
        Student student = new Student(null,new Date(101,0,1));
        //ACT + ASSERT
        assertEquals(5,student.leeftijdscategorie());
    }

    /** Good test
     */
    @Test
    void leeftijdscategorie_givenDatesFor5and7_returnCorrectCategory() {
        Student student = new Student(null,new Date(101,0,1));
        Student student2 = new Student(null,new Date(99,0,1));
        //ACT + ASSERT
        assertEquals(5,student.leeftijdscategorie());
        assertEquals(7,student2.leeftijdscategorie());
    }
}