package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hauptfenster {

    static JFrame kundenansicht;
    static JDesktopPane anzeigeflaeche;
    static JButton neuerKundeButton;
    static JButton neuerArtikelButton;
    static int x, y;

    static ActionListener kundeButton;

    public static void main(String[] args){

        x = 1024;
        y = 768;

        //Erzeuge Fenster
        kundenansicht = new JFrame();
        kundenansicht.setTitle("Kundenverwaltung - v1.0 (c) Markus Schultheis");
        kundenansicht.setSize(x, y);

        //Erzeuge Zeichenfläche
        anzeigeflaeche = new JDesktopPane();
        anzeigeflaeche.setSize(x,y);

        //Erzeuge Buttons
        neuerArtikelButton = new JButton("neuer Artikel");
        neuerKundeButton = new JButton("neuer Kunde");

        neuerArtikelButton.setLocation(10,10);
        neuerKundeButton.setLocation(neuerArtikelButton.getX(),  neuerArtikelButton.getY()+50);

        neuerArtikelButton.setSize(150,30);
        neuerKundeButton.setSize(150,30);

        anzeigeflaeche.add(neuerArtikelButton);
        anzeigeflaeche.add(neuerKundeButton);

        neuerArtikelButton.setVisible(true);
        neuerKundeButton.setVisible(true);

        kundenansicht.add(anzeigeflaeche);

        anzeigeflaeche.setVisible(true);
        kundenansicht.setVisible(true);

        neuerKundeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                guiKunde fenster = new guiKunde();
                fenster.neuerKunde.setSize(x/2,y/2);
            }
        });

        neuerArtikelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guiArtikel fenster = new guiArtikel();
                fenster.neuerArtikel.setSize(x/2,y/2);
            }
        });

    }
}
