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

    //TODO optellen van 2 PreciezeTijdspanne

}