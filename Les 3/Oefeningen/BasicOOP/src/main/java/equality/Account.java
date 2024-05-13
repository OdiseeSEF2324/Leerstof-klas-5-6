package equality;

/** Stelt een algemeen profiel van een persoon voor */
public class Account {
    final int nummer;
    final String naam;

    public Account(int nummer, String naam) {
        this.nummer = nummer;
        this.naam = naam;
    }

    /** Test of 2 objecten gelijkwaardig zijn
     * @param o Het andere object waarmee we het this object vergelijken
     * @return of this en other gelijkwaardig zijn
     * */
    @Override
    public boolean equals(Object o) {
        //TODO herschrijf deze methode om de gelijkwaardigheid te testen. Maak eerst een unit test
        Account other=(Account)o;
        return false;
    }


}
