package be.odisee;

public class Tellers {

    public static void main(String[] args) {
        dag1();
        dag2();
    }

    public static void dag1() {
        // Dag 1: we gaan met de klas op uitstap
        // Start met 2 tellers
        // De eerste teller telt alle kinderen aan het begin van de trip, de tweede op het einde van de trip
        final TellerGroep tellers =new TellerGroep(2);
        Teller startTeller=tellers.getTeller(0);
        Teller eindeTeller=tellers.getTeller(1);
        // de laatste teller staat uit
        eindeTeller.zetUit();

        //Tellen aan het begin
        startTeller.verhoog(5);
        for(int i=0;i<3;i++) {
            startTeller.verhoog(2 );
        }

        //Voeg een extra teller toe voor een mid trip telling
        Teller midTeller=tellers.addTeller();
        midTeller.verhoog(11);

        //Einde van de trip: tellen
        eindeTeller.zetAan();
        eindeTeller.verhoog(10);

        //controle
        if(!tellers.tellersZijnGelijk(false)) {
            //PANIEK!
            System.out.println("ALARM! Kinderen vermist op dag 1!");
            System.out.println("Hoogste aantal = "+tellers.getHoogsteAantal(false)+" kinderen!");
        }
    }

    /** Voert het scenario van dag 2 uit  */
    private static void dag2() {
        // Dag 2: We gaan met de klas naar het zwembad
        TellerGroep tellers =new TellerGroep(2);
        Teller startTeller=tellers.getTeller(0);
        Teller eindeTeller=tellers.getTeller(1);

        // Tel aan het begin
        startTeller.verhoog(5);
        startTeller.zetUit();

        //Tel aan het einde
        for (int i = 0; i < 5; i++) {
            eindeTeller.verhoog(1);
        }

        //zijn alle tellers gelijk?
        if(!tellers.tellersZijnGelijk()) {
            System.out.println("ALARM!");
        }
    }
}
