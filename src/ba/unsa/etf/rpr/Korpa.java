package ba.unsa.etf.rpr;

public class Korpa {

    int broj = 0;
    private Artikl[] korpa = new Artikl[50];


    public boolean dodajArtikl(Artikl artikl) {
        if(broj==50)return false;
        
        korpa[broj]=artikl;
        broj++;

        return true;
    }

    public Artikl[] getArtikli() {
        return korpa;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
    }
}
