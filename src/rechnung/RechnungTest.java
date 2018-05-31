package rechnung;

public class RechnungTest {



    public static void main(String[] args) {

        Kunde k = new Kunde("Anna Lena Meier");
        Rechnung r = new Rechnung(k);
        Artikel a = new Artikel("Deospray", 11111, 2.95);
        Rechnungsposten p = new Rechnungsposten(1, a);
        Artikel b = new Artikel("Zahnbürste", 10000, 3.90);
        Rechnungsposten p1 = new Rechnungsposten(2,b);
        r.legeRechnungsbetragFest(p.berechneGesamtbetrag());
        r.legeRechnungsbetragFest(p1.berechneGesamtbetrag());
        r.bestimmeRabatt();
    }
}
