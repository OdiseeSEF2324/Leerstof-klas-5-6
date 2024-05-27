package Jazzclub;

import java.time.LocalDate;

/**
 * De verantwoordelijkheid is hier het beheren van Lidmaatschapsinformatie
 * De sleutel om het terug de vinden is het e-mailadres
 * Een lidmaatschap is 1 jaar geldig. Daarna is het vervallen.
 *
 * REQ0005 - Het is bekend welk lid zich succesvol bekend gemaakt heeft
 * REQ0016 - Er kan nagegaan worden of het lidmaatschap geldig is op de datum van het geselecteerde concert - P
 * REQ0017 - De status (geldig of vervallen) van het lidmaatschap op concertdatum is bekend - I,O
 */
public class Lidmaatschap {

    private String eMailadres;
    private LocalDate laatsteDagGeldigheid;

    /**
     * Retourneert het e-mailadres
     * ten behoeve van REQ0005
     * @return het e-mailadres
     */
    public String getEMailadres() {
        return eMailadres; //TODO Juiste code later uit te werken
    }

    /**
     * Checkt of het lidmaatschap voor een gegeven checkdatum geldig is
     * ten behoeve van REQ0016 en REQ0017
     * @param checkdatum de datum waarvoor het lidmaatschap gecheck wordt
     * @return true als het lidmaatschap nog geldig is,
     *         false als het lidmaatschap vervallen is
     */
    public boolean checkGeldigheid(LocalDate checkdatum) {
        return false; //TODO Juiste code later uit te werken
    }
}
