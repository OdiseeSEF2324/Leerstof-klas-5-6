package Jazzclub;

import java.time.LocalDate;

/**
 * Met behulp van deze klasse kennen we de bijzonderheden van het concert:
 * wie treedt op, wanneer, wat is de capaciteit van de zaal?
 * Deze klasse kan ons ook helpen om te weten of er nog plaatsen vrij zijn
 *
 * REQ0016 - Er kan nagegaan worden of het lidmaatschap geldig is op de datum van het geselecteerde concert - P
 */
public class Concert {

    private String bandNaam; // hier zijn voorlopig geen requirements voor
    private LocalDate datum;
    private int capaciteitZaal; // hier zijn voorlopig geen requirements voor

    /**
     * Retourneert de datum van het concert
     * ten behoeve van REQ0016
     * @return de datum van het concert
     */
    public LocalDate getDatum() {
        return datum; //TODO Juiste code later uit te werken
    }
}
