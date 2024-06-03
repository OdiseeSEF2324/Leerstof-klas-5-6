package be.odisee.gemiddeldeoplossing;

import java.util.ArrayList;
import java.util.List;

/** Stelt een verzameling van alle ingegeven getallen voor */
public class GetallenVerzameling {
    private final List<Integer> getallen=new ArrayList<Integer>();  //

    /** Req 1
     * Voeg een getal toe aan de verzameling
     * @param getal toe te voegen getal
     */
    public void add(final int getal) {
        getallen.add(getal);
    }

    /** Req 2
     * Bereken het gemiddelde van alle getallen in de verzameling
     * @return het gemiddelde
     */
    public double gemiddelde() {
        // <insert reference to my source on the internet>
        if(getallen.size()==0) {
            return 0;
        } else {
            return (double)getallen.stream().reduce(0, Integer::sum) / getallen.size();
        }
    }
}
