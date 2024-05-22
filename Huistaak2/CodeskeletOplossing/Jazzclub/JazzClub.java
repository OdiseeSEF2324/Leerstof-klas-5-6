package Jazzclub;

import java.util.List;

/**
 * Deze klasse is verantwoordelijk voor het bijhouden en beheren
 * van de leden van de jazzclub,
 * de concerten - voorlopig beperkt tot 1 concert
 * en de plaatsreservaties door de leden gemaakt voor de concerten
 *
 * REQ0005 - Het is bekend welk lid zich succesvol bekend gemaakt heeft
 * REQ0015 - Het is bekend welk concert het lid geselecteerd heeft
 * REQ0018 - Bij geldig lidmaatschap kan de plaatsreservatie vastgelegd worden
 * REQ0019 - Bij vervallen lidmaatschap kan de plaatsreservatie onder voorbehoud vastgelegd worden
 */
public class JazzClub {

    private List<Lidmaatschap> lidmaatschappen;
    private Concert concert;
    private List<Plaatsreservatie> plaatsreservaties;

    /**
     * Zoek het lidmaatschap aan de hand van het e-mailadres
     * ten behoeve van REQ0005
     * @param eMailadres het e-mailadres waarop gezocht wordt
     * @return het gezochte Lidmaatschap als het bestaat, anders null
     */
    public Lidmaatschap getLidByEmail(String eMailadres) {
        return null; //TODO juiste code later in te vullen
    }

    /**
     * Retourneert het voorlopig enige concert
     * ten behoeve van REQ0015
     * @return het concert
     */
    public Concert getConcert() {
        return this.concert; //TODO juiste code later in te vullen
    }

    /**
     * Legt afhankelijk van de lidmaatschapsStatus een plaatsreservatie definitief of onder voorbehoud vast
     * ten behoeve van REQ0018 en REQ0019
     * @param lidmaatschap het lidmaatschap waarvoor de reservatie wordt vastgelegd
     * @param concert het concert waarvoor de reservatie wordt vastgelegd
     */
    public void legPlaatsreservatieVast(Lidmaatschap lidmaatschap, Concert concert) {
        //TODO juiste code later in te vullen
    }
}
