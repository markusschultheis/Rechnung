package rechnung;

import java.util.ArrayList;

public class Rechnung {

    //Exemplarvariablen
    boolean premiumkunde;
    private double betrag;
    private double mwst;
    private int anzahl;
    private double einzelpreis;
    int index;

    //Eine Rechnung hat immer einen Rechnungsempfänger
    // Rechnung * ------> 1 Kunde
    private Kunde rechnungsempfaenger;

    //Einer Rechnung kann mehrere Rechnungspositionen beinhalten
    // Rechnung * -------> * Rechnungsposten
    private ArrayList<Rechnungsposten> position;

    //Konstruktor
    public Rechnung(Kunde k) {
        rechnungsempfaenger = k;
        position = new ArrayList<Rechnungsposten>();
    }

    public void legeRechnungsbetragFest(double betrag) {
        this.betrag += betrag;
    }

    public double bestimmeRabatt() {
        double rabatt = 0;
        if (betrag >= 100) {
            rabatt = (int) (betrag / 1.19 * 0.05);
        } else {
                rabatt = 0;
        }

        if (betrag >= 200 && rechnungsempfaenger.istPremiumKunde()) {
            rabatt = (int) (betrag / 1.19 * 0.1);
        }
        return rabatt;
    }

    public void fuegePostenHinzu(final Rechnungsposten p) {
            position.add(p);
            this.betrag += p.berechneGesamtbetrag();
        }

    public double berechneNettopreis() {
        return anzahl*einzelpreis;
    }

    public void legeMehrwertsteuerFest(final double neueMwst) {
        this.mwst = neueMwst;
    }

}

