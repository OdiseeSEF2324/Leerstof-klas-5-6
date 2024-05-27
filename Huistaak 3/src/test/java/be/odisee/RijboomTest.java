package be.odisee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RijboomTest {

    @Test // Req11
    void givenBoomMet1Rij_diepte_Returns1() {
        //Assert Een boom met 1 rij
        Rijboom b=new Rijboom(new Rij(1,2,3));

        // Act
        int res = b.diepte();

        //Assert diepte is 1
        assertEquals(1,res);
    }

    @Test // Req11
    void givenBoomMet3Rijen_diepte_Returns3() {
        //Assert Een boom met 3 rijen
        Rijboom b=new Rijboom(new Rij(1,2,3));
        for (int i = 0; i < 2; i++) {
            b.bereken1Kind();
        }

        // Act
        int res = b.diepte();

        //Assert diepte is 3
        assertEquals(3,res);
    }

}