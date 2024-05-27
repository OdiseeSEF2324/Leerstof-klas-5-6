package be.odisee;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RijTest {
    //Geen test nodig voor req01


    @Test    // Req02
    void givenNulRij_isNul_ReturnsTrue(){
        // Arrange given a Rij that is a nulrij
        Rij rij = new Rij(0, 0, 0);

        //ACT isNul
        boolean res=rij.isNul();

        //Assert returns true
        assertTrue(res,"Dit is wel een nulrij");
    }

    @Test    // Req02
    void givenRij001_isNul_ReturnsFalse(){
        // Arrange given a Rij that is a nulrij
        Rij rij = new Rij(0, 0, 1);

        //ACT isNul
        boolean res=rij.isNul();

        //Assert returns False
        assertFalse(res,"Dit is geen nulrij");
    }

    @Test   //Req04
    void givenVerschilRij321_toString_returns321() {

        // Arrange given a 4 element Rij
        Rij rij = new Rij(3,2,1);

        //ACT toString
        String res=rij.toString();

        //Assert returns true
        assertEquals("{3,2,1}",res);
    }

    @Test //  req05
    void givenVerschilRij_berekenKindRij_returnsKindrij() {

        //Arrange maak verschilrij 3210
        Rij rij = new Rij(5,3,7);

        //Act Bereken kindrijen
        Rij kind=rij.berekenKindRij();

        //Assert correcte kindrij?
        assertEquals("{2,2,4}",kind.toString() );
    }

    

}