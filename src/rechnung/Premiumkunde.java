package rechnung;

public class Premiumkunde extends Kunde {

    /**
     * Erzeugt einen neuen Kunde als Premiumkunde
     * @param name Kundenname
     */

    public Premiumkunde(String name) {
        super(name);
        super.premiumkunde = true;
    }

    //für die Testklasse
    public void legePremiumKundeFest(boolean istPremium) {
        super.premiumkunde = true;
    }
}
