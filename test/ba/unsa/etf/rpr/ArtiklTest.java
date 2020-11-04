package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArtiklTest {

    @Test
    void ArtiklTestSve() {
        Artikl a = new Artikl("Biciklo", 1000, "1");
        assertAll(
                ()->assertEquals(a.getKod(),new Artikl("Biciklo", 1000, "1").getKod()),
                ()->assertEquals(a.getKod(),"1"),
                ()->assertEquals(a.getCijena(),1000)
        );

    }

}