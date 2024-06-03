package be.odisee;

public class Lamp {

    public enum LampToestand  {
        AAN, UIT
    }

    private LampToestand toestand;

    /**
     * Constructor
     * Req01 Lampen kunnen aangemaakt worden
     * Req02 Een nieuwe lamp staat uit
     * Req10 Er zijn twee soorten gekleurde lampen: degene die gebruik maken van LED lichten enerzijds
     *       en degene die gebruik maken van halogeen lichten anderzijds
     */
    public Lamp() {
        this.toestand = LampToestand.UIT;
    }

    public LampToestand getToestand() {
        return toestand;
    }

    /**
     * Setter
     * Req03 Het is mogelijk om een lamp AAN te zetten
     * Req04 Het is mogelijk om een lamp UIT te zetten
     *
     * @param toestand gewenste toestand AAN of UIT
     */
    public void setToestand(LampToestand toestand) {
        this.toestand = toestand;
    }

    /**
     * toggle de toestand van AAN naar UIT en omgekeerd
     * <p>
     * Req06 De AAN/UIT-status van een lamp kan geswicht worden: van AAN naar UIT en omgekeerd
     */
    public void toggle() {
        switch (this.toestand) {
            case AAN: this.toestand = LampToestand.UIT; break;
            case UIT: this.toestand = LampToestand.AAN; break;
        }
    }
}
