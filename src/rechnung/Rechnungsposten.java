package rechnung;

public class Rechnungsposten {

    int anzahl;
    Artikel artikel;

    public Rechnungsposten(final int anzahl, final Artikel artikel){
        this.legeAnzahlFest(anzahl);
        this.legeArtikelFest(artikel);
    }

    void legeAnzahlFest(int anzahl) {
        this.anzahl = anzahl;
    }

    void legeArtikelFest(Artikel a) {
        artikel = a;
    }

    double berechneGesamtbetrag(){
        return this.liefereAnzahl() * this.liefereArtikel().lieferePreis();
    }

    int liefereAnzahl(){
        return anzahl;
    }

    Artikel liefereArtikel(){
        return artikel;
    }


}
