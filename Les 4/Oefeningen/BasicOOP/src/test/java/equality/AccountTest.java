package equality;

import equality.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    /** De operator== kan testen of 2 objecten hetzelfde object zijn  */
    @Test
    void operatorGelijkheid_zelfdeObjecten_areEqual() {
        //Arrange
        Account a = new Account(35,"Dragon");
        Account b = a;
        //Act
        boolean result = a==b;
        //Assert
        assertTrue(result,"de operator== faalt!");
    }

    //TODO voeg 2 testen toe welke de return van de equals methode testen als je 2 verschillende objecten gebruikt.
    // false als de objecten verschillende waarden bevatten, vb nummers 35 en 36
    // true als de objecten dezelfde waarden bevatten vb allebei nummer 35 en naam "
    @Test
    void act_arrange_assert() {
        //Geef een goede naam
    }

}