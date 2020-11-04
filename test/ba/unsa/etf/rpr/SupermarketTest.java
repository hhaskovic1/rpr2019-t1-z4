package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static jdk.nashorn.internal.objects.NativeArray.length;
import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    private Korpa korpa = new Korpa();
    private Supermarket supermarket = new Supermarket();

    @Test
    void dodajArtikl() {
        assertEquals(0,length(korpa.getArtikli()));
        assertTrue(korpa.dodajArtikl(new Artikl("Biciklo", 1000, "4")));
    }

    @Test
    void getArtikli() {
        assertEquals(0,length(korpa.getArtikli()));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "2"));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "3"));
        Korpa korpa1 = new Korpa();
        korpa1.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        korpa1.dodajArtikl(new Artikl("Biciklo", 1000, "2"));
        korpa1.dodajArtikl(new Artikl("Biciklo", 1000, "3"));

        for(int i=0; i<3; i++) {
            assertEquals(korpa.getArtikli()[i].getKod(),korpa1.getArtikli()[i].getKod());
        }




    }

    @Test
    void izbaciArtiklSaKodom() {
        assertEquals(0,length(korpa.getArtikli()));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "2"));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "3"));

        Korpa korpa1 = new Korpa();
        korpa1.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        korpa1.dodajArtikl(new Artikl("Biciklo", 1000, "2"));
        korpa1.dodajArtikl(new Artikl("Biciklo", 1000, "3"));

        for(int i=0; i<3; i++) {
            assertEquals(korpa.getArtikli()[i].getKod(),korpa1.getArtikli()[i].getKod());
        }

        korpa.izbaciArtiklSaKodom("1");
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "4"));
        for(int i=0; i<3; i++) {
            assertNotEquals(korpa.getArtikli()[i].getKod(),korpa1.getArtikli()[i].getKod());
        }
    }

}