package be.odisee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static be.odisee.Lamp.LampToestand.AAN;
import static be.odisee.Lamp.LampToestand.UIT;
import static org.junit.jupiter.api.Assertions.*;

class GekleurdeLampTest {

    GekleurdeLamp lamp;

    @BeforeEach
    //Req07 Gekleurde lampen kunnen aangemaakt worden. Ze krijgen een kleur naar keuze.
    public void setUp() {
        lamp = new GekleurdeLamp(Color.GREEN);
    }

    @Test
    // Req02 Een nieuwe gekleurde lamp staat UIT
    public void constructor_returnsLampUIT () {
        // Arrange
        // Act
        // Assert
        assertEquals(UIT, lamp.getToestand());
    }

    @Test
    // Req03 Het is mogelijk om een gekleurde lamp AAN te zetten
    public void setter_toestandAAN() {
        // Arrange
        // Act
        lamp.setToestand(AAN);
        // Assert
        assertEquals(AAN, lamp.getToestand());
    }

    @Test
    // Req04 Het is mogelijk om een gekleurde lamp UIT te zetten
    public void setter_toestandUIT() {
        // Arrange
        // Act
        lamp.setToestand(UIT);
        // Assert
        assertEquals(UIT, lamp.getToestand());
    }

    @Test
    // De AAN/UIT status van een gekleurde lamp kan opgevraagd worden
    // Req06 De AAN/UIT-status van een gekleurde lamp kan geswicht worden: van AAN naar UIT en omgekeerd
    public void toggle_andereToestand() {
        // Arrange
        Lamp lamp1= new GekleurdeLamp(Color.CYAN);
        lamp1.setToestand(AAN);
        Lamp lamp2= new GekleurdeLamp(Color.ORANGE);
        lamp2.setToestand(UIT);
        // Act
        lamp1.toggle();
        lamp2.toggle();
        // Assert
        assertEquals(UIT,lamp1.getToestand());
        assertEquals(AAN,lamp2.getToestand());
    }

    @Test
    // Req08 (Enkel ) van gekleurde lampen kan de kleur opgevraagd worden
    // Req09 (Enkel ) van gekleurde lampen kan de kleur veranderd worden
    public void getKleur_returnsKleur() {
        // Arrange
        lamp.setKleur(Color.PINK);
        // Act
        Color result = lamp.getKleur();
        // Assert
        assertEquals(Color.PINK, result);
    }

    @Test
    // Req10 Er zijn twee soorten gekleurde lampen: degene die gebruik maken van LED lichten enerzijds
    //          en degene die gebruik maken van halogeen lichten anderzijds
    public void getSoort_returnsLEDofHalogeen() {
        // Arrange
        // Act
        GekleurdeLamp.LampSoort lampSoort = lamp.getSoort();
        // Assert
        assertTrue(lampSoort.equals(GekleurdeLamp.LampSoort.LED)
                            || lampSoort.equals(GekleurdeLamp.LampSoort.HALOGEEN));
    }

}