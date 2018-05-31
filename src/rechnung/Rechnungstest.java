package rechnung;

public class Rechnungstest extends junit.framework.TestCase {

    public void setUp() {



    }

    public void testeRabattBeiNeuerRechnung() {

        Kunde k = new Kunde("Anna Lena Müller");
        Premiumkunde p = new Premiumkunde("Michael Müller");
        Rechnung r = new Rechnung(k);
        Rechnung rp = new Rechnung(p);

        // To Do
        assertEquals("Rabatt bei 0 Euro und normaler Kundin fehlerhaft.",0, (int) r.bestimmeRabatt());

        r.legeRechnungsbetragFest(100);
        rp.legeRechnungsbetragFest(100);
        assertEquals("Rabatt bei 100 Euro und normaler Kundin fehlerhaft.",4, (int) r.bestimmeRabatt());
        assertEquals("Rabatt bei 100 Euro und Premiumkunde fehlerhaft.", 4,(int) rp.bestimmeRabatt());
        r.legeRechnungsbetragFest(200);
        rp.legeRechnungsbetragFest(200);
        assertEquals("Rabatt bei 200 Euro und normaler Kundin fehlerhaft.",8, (int) r.bestimmeRabatt());
        assertEquals("Rabatt bei 200 Euro und Premiumkunde fehlerhaft.", 16,(int) rp.bestimmeRabatt());
        k.premiumkunde = true;
        assertEquals("Rabatt bei 200 Euro und normaler Kundin , die hochgestuft wurde ist fehlerhaft.",16, (int) r.bestimmeRabatt());

        r.legeRechnungsbetragFest(-1);
        assertEquals("Rabatt bei 0 Euro und normaler Kundin fehlerhaft.",0,(int) r.bestimmeRabatt());
        rp.legeRechnungsbetragFest(-1);
        assertEquals("Rabatt bei 0 Euro und normaler Kundin fehlerhaft.",0,(int) r.bestimmeRabatt());
    }


}
