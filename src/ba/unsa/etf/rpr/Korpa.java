package ba.unsa.etf.rpr;

public class Korpa {

    int broj = 0;
    private Artikl[] korpa = new Artikl[50];


    public boolean dodajArtikl(Artikl artikl) {
        if(broj==50) {
            return false;
        }
        Artikl i = new Artikl(artikl);
        korpa[broj]=i;
        broj++;

        return true;
    }

    public Artikl[] getArtikli() {
        return korpa;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {

        Artikl x = null;
        int br=-1;
        boolean nasao = false;

        for(Artikl a:korpa) {
            br++;
            if(a.getKod().equals(kod)) {
                x=a;
                nasao=true;
                break;
            }
        }

        if(nasao) {
            for(int i=br; i<broj; i++) {
                korpa[i]=korpa[i+1];
            }
            broj--;
        }

        return x;


    }

    public int dajUkupnuCijenuArtikala() {
        int suma = 0;

        for(int i=0; i<broj; i++) {
            suma = suma + korpa[i].getCijena();
        }

        return suma;
    }
}
