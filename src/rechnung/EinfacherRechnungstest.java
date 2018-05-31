package rechnung;

public class EinfacherRechnungstest {

    public static void main(String[] args) {

        double rabatt;

        Kunde k = new Kunde("Anna Lena Müller");
        Rechnung r = new Rechnung(k);
        r.legeRechnungsbetragFest(120);
        rabatt = r.bestimmeRabatt();
        if (rabatt != 5) {
            System.out.println("Der Rabatt bei eine Rechnung von 120 Euro wird falsch berechnet.");
            System.out.println("Der Rabatt sollte  5 Prozent betragen, betraegt aber " + rabatt);
        }

        Kunde k1 = new Kunde("Karl Heinz Müller");
        Rechnung r1 = new Rechnung(k1);
        r1.legeRechnungsbetragFest(220);
        rabatt = r1.bestimmeRabatt();
        if (rabatt != 9) {
            System.out.println("Der Rabatt bei eine Rechnung von 220 Euro wird falsch berechnet.");
            System.out.println("Der Rabatt sollte 5 Prozent betragen, betraegt aber " + rabatt);
        }

        Kunde k2 = new Premiumkunde("Horst Müller");
        Rechnung r2 = new Rechnung(k2);
        r2.legeRechnungsbetragFest(220);
        rabatt = r2.bestimmeRabatt();
        if (rabatt != 18) {
            System.out.println("Der Rabatt bei eine Rechnung von 220 Euro wird falsch berechnet.");
            System.out.println("Der Rabatt sollte  10 Prozent betragen, betraegt aber " + rabatt);
        }
    }
}
