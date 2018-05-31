package rechnung;

public class Kunde {

    boolean premiumkunde;
    private String name;
    private String anschrift;

    public Kunde(String name, String anschrift) {
        this.name = name;
        this.anschrift = anschrift;
    }

    /**
     * erzeugt einen neuen Kunden mit angegebenem Namen
     * @param name der Name des Kunden
     */
    public Kunde (String name) {
        this.name = name;
    }

    /**
     * liefert Informationen, ob es sich um einen Premiumkunden handelt
     * @return true, wenn es sich um einen Premiumkunden handelt, ansonsten false
     */
    public boolean istPremiumKunde() {
        boolean premiumkunde = false;
        if (this.premiumkunde == true) {
            premiumkunde = true;
        }
        return premiumkunde;
    }

    /**
     * gibt die Kundenanschrift zurück
     * @return anschrift des Kunden
     */
    public String liefereAnschrift() {
        return anschrift;
    }

    public String liefereName() {
        return name;
    }

    public void legeAnschriftFest(String anschrift) {
        this.anschrift = anschrift;
    }

    public void legeNameFest(String name) {
        this.name = name;
    }
}
