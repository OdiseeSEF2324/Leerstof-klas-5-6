package be.odisee;

public class Main {

    public static void main(String[] args) {

        Teller teller = new Teller();

        teller.zetTellerAan();

        if(teller.staatTellerAan()){
            teller.increment();
            teller.increment();
            teller.increment();

            System.out.println("Huidige waarde van teller " + teller.getWaarde());

            teller.reset();

            System.out.println("Huidige waarde van teller " + teller.getWaarde());
        }

        teller.zetTellerUit();
    }
}
