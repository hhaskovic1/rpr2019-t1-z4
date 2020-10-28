package ba.unsa.etf.rpr;

public class Supermarket {

    private int broj=0;
    private Artikl[] artikli = new Artikl[1000];


    public void dodajArtikl(Artikl artikl) {

        artikli[broj]=artikl;
        broj++;

    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(int kod) {

        for(Artikl a:artikli) {
            if(a.getKod()==kod)
        }

    }
}
