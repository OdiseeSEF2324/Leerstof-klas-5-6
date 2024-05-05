package be.odisee;

/* Requirements
 * a) We simuleren een broodrooster welke gedurende 1 minuut roostert als we het roosteren starten
 *          => klasse Broodrooster, methode Broodrooster.start()
 * b) De broodrooster kan 2 sneden tegelijk roosteren    => Broodrooster.aantalSneden
 * c) Een temperatuurregelknop op het apparaat bepaalt hoeveel weerstand het apparaat levert  => Broodrooster.weerstand
 */

/**
 * Deze klasse stelt een broodrooster voor met 1 knop: een temperatuurregelaar
 */
public class Broodrooster {

    /* variabele die het aantal sneden bijhoudt */
    private final Integer aantalSneden=2;

    /**
     * Req b) Bepaalt hoeveel sneden tegelijk geroosterd worden
    */
    public void getAantalSneden() {}

    /* variabele die de weerstand bijhoudt */
    private Double weerstand;

    /**
     * Req c) De elektrische weerstand zoals bepaald door de temperatuurregelaar
     * */
    public void setWeerstand(Double weerstand) {}

    /**
     * Req a) Start het roosteren gedurende 1 minuut
     */
    public void start() {

    }
}
