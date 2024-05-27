package be.odisee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** Stelt een verschilrijboom voor die de opeenvolging van de verschilrijen bewaard. Elke rij is de kindverschilrij van de vorige rij. */
public class Rijboom {
    private List<Rij> boom;

    public Rijboom(Rij startrij) {
        this.boom = new ArrayList<>(Arrays.asList(startrij));
    }

    /**  Req11
     * Berekent de diepte van de verschilboom, dat is het aantal gekende verschilrijen
     * @return de diepte van de rijboom
     */
    public int diepte() {
        return boom.size();
    }

    /**
     * Berekent kindrij van de laatste rij in de boom en voegt deze toe aan de boom
     */
    public void bereken1Kind() {
        boom.add(boom.getLast().berekenKindRij());
    }
}
