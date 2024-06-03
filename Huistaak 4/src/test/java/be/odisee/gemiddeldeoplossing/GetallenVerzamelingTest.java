package be.odisee.gemiddeldeoplossing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetallenVerzamelingTest {
    // Req 1 hoeft geen test want add is te eenvoudig

    //req 2
    @Test
    void gemiddelde_givenGeenGetallen_is0() {
        GetallenVerzameling gv=new GetallenVerzameling();
        //act
        double gem=gv.gemiddelde();
        //assert
        assertEquals(0,gem);
    }
    //req 2
    @Test
    void gemiddelde_givenEnkeleGetallen_returnsGemiddelde() {
        GetallenVerzameling gv=new GetallenVerzameling();
        gv.add(1);
        //act
        double gem=gv.gemiddelde();
        //assert
        assertEquals(1,gem);

        gv.add(12);
        //act
        gem=gv.gemiddelde();
        //assert
        assertEquals(6.5,gem);

        gv.add(17);
        //act
        gem=gv.gemiddelde();
        //assert
        assertEquals(10.0,gem);

    }

}