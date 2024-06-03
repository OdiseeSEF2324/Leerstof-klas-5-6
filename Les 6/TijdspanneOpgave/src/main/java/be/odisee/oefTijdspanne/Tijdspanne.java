package be.odisee.oefTijdspanne;

/** Onthoudt een tijdspanne als een aantal minuten */
public class Tijdspanne {
    protected int minuten;
    public Tijdspanne(int minuten) {
        this.minuten = minuten;
    }
    public int getMinuten() {
        return minuten;
    }

    /**
     * Tel 2 tijdspannes bij elkaar op: de eigen tijd plus de tijd van de andere
     * @param andere andere tijdspanne
     */
    public void bijTellen(Tijdspanne andere) {
        //TODO implement
    }
}

