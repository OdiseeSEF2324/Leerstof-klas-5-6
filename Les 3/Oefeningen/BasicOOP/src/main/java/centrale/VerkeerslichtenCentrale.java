package centrale;
import java.util.ArrayList;
import java.util.List;

/** Stelt een verkeerlichtencentrale voor van de simulatie en voert de simulatie uit */
public class VerkeerslichtenCentrale {

    //Corrigeer de code denkende aan static, final, access modifiers, information hiding en SRP
    // Er is ook 1 lijn overbodige code (met verkeerde resultaten tot gevolg)
    // en 1 logische fout

    //** Bepaald of de centrale actief is.*/
    boolean isActive=false;
    int aantalLichten=3;
    /** Welke verkeerslichten zijn aan? De lichten zijn strikt oplopend genummerd. */
    List<Boolean> verkeerslichtenActief = new ArrayList<Boolean>(aantalLichten);

    // De code van deze class voldoet aan de centralestandaard versie 1.2a
    static private String versie="1.2a";

    public String getCentraleVersie() { return versie; }

    public VerkeerslichtenCentrale() {
        initialize();
        isActive=true;
    }

    /** Maakt de verkeerslichten aan */
    public void initialize() {
        for(int i=aantalLichten ;i>0;i--) {
            verkeerslichtenActief.add(true);
        }
    }

    /** Schakel een verkeerslicht uit
      * @param lichtnr volgnr van het uit te schakelen licht
     */
    public void schakelLichtUit(int lichtnr) {
        int lichtnrUitTeSchakelen = lichtnr-1;
        if(lichtnr>=verkeerslichtenActief.size()) lichtnr=verkeerslichtenActief.size();
        if(isActive) verkeerslichtenActief.set(lichtnrUitTeSchakelen,Boolean.FALSE);
    }

    /** start de simulatie */
    public static void main(String[] args) {
        VerkeerslichtenCentrale centrale1=new VerkeerslichtenCentrale();
        centrale1.initialize();

        centrale1.schakelLichtUit(3);

        System.out.println("centralestandaard versie: "+ centrale1.getCentraleVersie());
        for (Boolean licht: centrale1.verkeerslichtenActief) {
            System.out.println("verkeerslicht "+(licht?"aan":"uit"));
        }
    }
}
