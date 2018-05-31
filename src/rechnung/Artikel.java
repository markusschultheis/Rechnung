package rechnung;

public class Artikel {

    public static long anzahlDatensaetze;
    long artikelnr;
    String beschreibung;
    double preis;

    public Artikel(String neueBeschreibung, long neueArtikelnr, double neuerPreis) {
        this.beschreibung = neueBeschreibung;
        this.artikelnr = neueArtikelnr;
        this.preis = neuerPreis;
        anzahlDatensaetze++;
    }

    void legeArtikelnrFest(long neueArtikelnr){
        this.artikelnr = neueArtikelnr;
    }

    void legeBeschreibugFest(String neueBeschreibung){
        this.beschreibung = neueBeschreibung;
    }

    void legePreisFest(double neuerPreis){
        this.preis = neuerPreis;
    }

    long liefereArtikelnr(){
        return this.artikelnr;
    }

    double lieferePreis() {
        return this.preis;
    }

    String liefereBeschreibung() {
        return this.beschreibung;
    }

}