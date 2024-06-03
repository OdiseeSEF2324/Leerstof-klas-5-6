package be.odisee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static be.odisee.Lamp.LampToestand.AAN;
import static be.odisee.Lamp.LampToestand.UIT;
import static org.junit.jupiter.api.Assertions.*;

class LampTest {

    Lamp lamp;

    @BeforeEach
    // Req01 Lampen kunnen aangemaakt worden
    public void setUp() {
        lamp = new Lamp();
    }

    @Test
    // Req02 Een nieuwe lamp staat UIT
    public void constructor_returnsLampUIT () {
        // Arrange
        // Act
        // Assert
        assertEquals(UIT, lamp.getToestand());
    }

    @Test
    // Req03 Het is mogelijk om een lamp AAN te zetten
    public void setter_toestandAAN() {
        // Arrange
        // Act
        lamp.setToestand(AAN);
        // Assert
        assertEquals(AAN, lamp.getToestand());
    }

    @Test
    // Req04 Het is mogelijk om een lamp UIT te zetten
    public void setter_toestandUIT() {
        // Arrange
        // Act
        lamp.setToestand(UIT);
        // Assert
        assertEquals(UIT, lamp.getToestand());
    }

    @Test
    // De AAN/UIT status van een lamp kan opgevraagd worden
    // Req06 De AAN/UIT-status van een lamp kan geswicht worden: van AAN naar UIT en omgekeerd
    public void toggle_andereToestand() {
        // Arrange
        Lamp lamp1= new Lamp();
        lamp1.setToestand(AAN);
        Lamp lamp2= new Lamp();
        lamp2.setToestand(UIT);
        // Act
        lamp1.toggle();
        lamp2.toggle();
        // Assert
        assertEquals(UIT,lamp1.getToestand());
        assertEquals(AAN,lamp2.getToestand());
    }

    @Test
    // Req08 Enkel van gekleurde lampen kan de kleur opgevraagd worden
    public void noSuchMethod_getColor() {
        // Arrange
        // Act
        // Assert
        assertThrows( NoSuchMethodException.class,
                () -> lamp.getClass().getMethod("getColor")
        );
    }

    @Test
    // Req09 Enkel van gekleurde lampen kan de kleur veranderd worden
    public void noSuchMethod_setColor()  {
        // Arrange
        // Act
        // Assert
        assertThrows( NoSuchMethodException.class,
                () -> lamp.getClass().getMethod("setColor")
        );
    }

}