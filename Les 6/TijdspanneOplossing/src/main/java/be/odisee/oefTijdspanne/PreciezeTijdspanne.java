package be.odisee.oefTijdspanne;

/** Onthoudt een tijdspanne als een aantal minuten en seconden */
public class PreciezeTijdspanne extends Tijdspanne {
    protected int seconden;
    public int getSeconden() {
        return seconden;
    }
    public PreciezeTijdspanne(int minuten, int seconden) {
        super(minuten);
        this.seconden = seconden;
    }
    /**
     * Tel 2 tijdspannes bij elkaar op: de eigen tijd plus de tijd van de andere
     * @param andere andere tijdspanne
     */
    public void bijTellen(PreciezeTijdspanne andere) {
        super.bijTellen(andere);
        this.seconden+=andere.getSeconden();
    }
}
