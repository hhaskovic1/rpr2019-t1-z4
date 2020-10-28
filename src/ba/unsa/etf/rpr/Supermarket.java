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

    public Artikl izbaciArtiklSaKodom(String kod) {

        Artikl x = null;
        int br=-1;
        boolean nasao = false;

        for(Artikl a:artikli) {
            br++;
            if(a.getKod().equals(kod)) {
                x=a;
                nasao=true;
                break;
            }
        }

        if(nasao) {
            for(int i=br; i<broj; i++) {
                artikli[i]=artikli[i+1];
            }
            broj--;
        }

        return x;


    }
}
