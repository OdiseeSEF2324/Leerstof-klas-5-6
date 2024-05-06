package be.odisee;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/** Req01
 * Stelt 1 teller voor */
public class Teller {
    /** Req02
     * Totaal aantal */
    private int aantal=0;
    /** Req02
     * Staat de teller aan of uit. Bij uit kan de teller niet verhoogd worden */
    private Boolean staatAan=TRUE;

    // getters en setters
    public int getAantal() {
        return aantal;
    }
    public Boolean staatAan() {
        return staatAan;
    }
    /** Req 05 Zet de status op Aan */
    public void zetAan() {
        this.staatAan = TRUE;
    }
    /** Req 05 Zet de status op Uit */
    public void zetUit() {
        this.staatAan = FALSE;
    }

    /** Req04 Verhoog een teller met een opgegeven waarde
     * @param verhoging de hoeveelheid om het aantal mee te verhogen
     */
    public void verhoog(int verhoging) {
        if (staatAan()) aantal=aantal+verhoging;
    }

    /** De java manier om 2 tellers te vergelijken */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teller teller = (Teller) o;
        return aantal == teller.aantal;
    }

}
