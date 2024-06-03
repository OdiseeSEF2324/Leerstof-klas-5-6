package be.odisee;

import java.awt.*;
import java.util.Random;

public class GekleurdeLamp extends Lamp {

    Color kleur;

    public enum LampSoort {
        LED, HALOGEEN
    }

    private final LampSoort soort;

    /**
     * Constructor
     * <p>
     * Req07 Gekleurde lampen kunnen aangemaakt worden. Ze krijgen een kleur naar keuze.
     * Req10 Er zijn twee soorten gekleurde lampen: degene die gebruik maken van LED lichten enerzijds
     *         en degene die gebruik maken van halogeen lichten anderzijds
     *
     * @param kleur de gewenste kleur
     */
    public GekleurdeLamp(Color kleur) {
        super();
        this.kleur = kleur;

        // Ten behoeve van Req10 geven we de gekleurde lamp random ofwel LED ofwel Halogeen lichten
        Random random = new Random();
        if (random.nextBoolean()) this.soort = LampSoort.LED;
        else this.soort = LampSoort.HALOGEEN;
    }

    /**
     *
     * Req08 (Enkel ) van gekleurde lampen kan de kleur opgevraagd worden
     *
     * @return de kleur van de lamp
     */
    public Color getKleur() {
        return kleur;
    }

    /**
     *
     * Req09 (Enkel ) van gekleurde lampen kan de kleur veranderd worden
     *
     * @param kleur de kleur die we wensen in te stellen van de lamp
     */
    public void setKleur(Color kleur) {
        this.kleur = kleur;
    }

    public LampSoort getSoort() {
        return soort;
    }
}
