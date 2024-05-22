package Jazzclub;

/**
 * Hiermee kunnen we voor een lidmaatschap een een plaatsreservatie in een concert maken
 * De plaatsreservatie kan vastgelegd zijn of onder voorbehoud
 *
 * REQ0018 - Bij geldig lidmaatschap kan de plaatsreservatie vastgelegd worden
 * REQ0019 - Bij vervallen lidmaatschap kan de plaatsreservatie onder voorbehoud vastgelegd worden
 */
public class Plaatsreservatie {

    private Lidmaatschap lidmaatschap;
    private Concert concert;
    private String reservatieStatus;

    /**
     * Creëert een definitieve reservatie
     * indien het lidmaatschap geldig is op de concertdatum
     * Creërt een reservatie onder voorbehoud
     * indien het lidmaatschap vervallen is op de concertdatum
     * ten behoeve van REQ0018 en REQ0019
     * @param lidmaatschap het lidmaatschap waarvoor gereserveerd wordt
     * @param concert het concert waarvoor gereserveerd wordt
     */
    public Plaatsreservatie(Lidmaatschap lidmaatschap, Concert concert) {
        this.lidmaatschap = lidmaatschap;
        this.concert = concert;
        this.reservatieStatus= "Onder voorbehoud";
        //TODO Juiste code later uit te werken
    }
}
