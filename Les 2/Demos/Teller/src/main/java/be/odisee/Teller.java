package be.odisee;

/**
 * Een eenvoudige teller welke per 1 omhoog kan
 */
public class Teller {

    private int waarde;
    private boolean tellerStaatAan;

    /**
     * Default constructor: een Teller-object wordt aangemaakt
     * met waarde 0 en is uitgeschakeld.
     */
    public Teller(){
        this.waarde = 0;
        this.tellerStaatAan = false;
    }

    /**
     * Vermeerder waarde van Teller met 1.
     * Heeft geen effect als de teller uit staat.
     */
    public void increment(){
        if (tellerStaatAan){
            this.waarde++;
        }
    }

    /**
     * Zet waarde van Teller op 0.
     * Heeft geen effect als de teller uit staat.
     */
    public void reset(){
        if (tellerStaatAan){
            this.waarde = 0;
        }
    }

    /**
     * Waarde van de teller. Indien de teller uitstaat, geef nul terug.
     * @return waarde van de Teller
     */
    public int getWaarde(){
        if (tellerStaatAan) {
            return this.waarde;
        } else {
            return 0;
        }
    }

    /** Zet teller aan en zet waarde op 0 */
    public void zetTellerAan(){
        this.tellerStaatAan = true;
        this.waarde = 0;
    }

    /** Zet teller uit en zet waarde op 0 */
    public void zetTellerUit(){
        this.tellerStaatAan = false;
        this.waarde = 0;
    }

    /** Controleer of de teller aanstaat
     * @return true als de Teller aan staat
     */
    public boolean staatTellerAan(){
        return this.tellerStaatAan;
    }

}
