package be.odisee;

/** Stelt een verschilrij voor
 */
public class Rij {
    /** Req01 */
    private final int element0;
    private final int element1;
    private final int element2;

    /** Constructor */
    Rij(int... args) {
        element0 = args[0];
        element1 = args[1];
        element2 = args[2];
    }

    /** Test of alle elementen 0 zijn
     * @return true als alle elementen 0 zijn
     */
    boolean isNul() {
        return element0 == 0 && element1 == 0 && element2 == 0;


    }

    /** Stelt de getallen voor als een string
     * @return de getallen op volgorde omgeven door {} gescheiden door een komma
     */
    @Override
    public String toString() {
        String str= "{" +
                element0 + ","
                + element1 + ","
                + element2 +'}';
        return str;
    }

    /** Berekent het kind van de verschilrij.
     * @return Rij de kindrij
     */
    public Rij berekenKindRij() {
        return new Rij(Math.abs(element0-element2),Math.abs(element1-element0), Math.abs(element2-element1));
    }
}
