package be.odisee;

import java.util.ArrayList;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/** Req01 Stelt een groep van tellers voor */
public class TellerGroep {
    /** Req01 Lijst van alle tellers */
    private final ArrayList<Teller> tellers;

    // Constructors
    public TellerGroep() {
        tellers = new ArrayList<>();
    }
    public TellerGroep(int aantal) {
        tellers = new ArrayList<>(aantal);
        for(int i = 0; i < aantal; i++) { tellers.add(new Teller()); }
    }

    // accessors and mutators
    /** Req03
     * Voeg een nieuwe teller toe */
    public Teller addTeller() {
        tellers.add(new Teller());
        return tellers.getLast();
    }

    /** Zoek een teller a.h.v. haar index
     * @param index index van de gevraagde teller
     * @return de gevraagde teller
     * */
    public Teller getTeller(int index) { return tellers.get(index); }

    /** Req06
     * Hebben alle tellers (die aan staan) een gelijk aantal?
     * @param vergelijkUitTellers vergelijk ook tellers die uit staan?
     * @return TRUE als de tellers gelijk zijn
     */
    public Boolean tellersZijnGelijk(boolean vergelijkUitTellers) {
        for (Teller teller: tellers) {
            if (vergelijkUitTellers) {
                if (teller.getAantal() != tellers.getFirst().getAantal()) return FALSE;
            } else {
                if (teller.staatAan() && teller.getAantal() != tellers.getFirst().getAantal()) return FALSE;
            }
        }
        return TRUE;
    }

    /** Req06
     * Hebben alle tellers een gelijk aantal? Vergelijkt ook tellers die uit staan.
     * @return TRUE als de tellers gelijk zijn
     * @see TellerGroep#tellersZijnGelijk(boolean) gelijkeAantallen(true)
     */
    public Boolean tellersZijnGelijk() { // optioneel argument: vergelijkUitTellers
        return tellersZijnGelijk(true);
    }

    /** Req07
     * Wat is de hoogste teller (die aan staat)? ALTIJD bruikbaar
     * @param vergelijkUitTellers vergelijk ook tellers die uit staan?
     * @return de waarde van de grootste teller
     */
    public int getHoogsteAantal(boolean vergelijkUitTellers) {
        int hoogsteAantal=0;
        for (Teller teller: tellers) {
            if(vergelijkUitTellers || teller.staatAan()) hoogsteAantal = Math.max(teller.getAantal(), hoogsteAantal);
        }
        return hoogsteAantal;
    }

}
