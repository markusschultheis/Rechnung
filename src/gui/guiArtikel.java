package gui;

import rechnung.Artikel;
import rechnung.Rechnungsposten;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class guiArtikel {

    JFrame neuerArtikel;

    JDesktopPane flaeche;

    JButton btnSpeichern;

    JLabel lblArtikelbeschreibung;
    JLabel lblArtikelpreis;
    JLabel lblArtikelname;

    JTextField txtBeschreibung;
    JTextField txtName;
    JTextField txtPreis;

    long datensaetze;

    public guiArtikel(){

        datensaetze = Artikel.anzahlDatensaetze;

        neuerArtikel = new JFrame("Artikel");
        flaeche = new JDesktopPane();
        neuerArtikel.add(flaeche);

        flaeche.setSize(Hauptfenster.x,Hauptfenster.y);

        lblArtikelbeschreibung = new JLabel("Artikelbeschreibung");
        lblArtikelbeschreibung.setLocation(0,0);
        lblArtikelbeschreibung.setSize(200,100);

        lblArtikelname = new JLabel("Artikelname");
        lblArtikelname.setLocation(lblArtikelbeschreibung.getX(),lblArtikelbeschreibung.getY()+100);
        lblArtikelname.setSize(200,100);

        lblArtikelpreis = new JLabel("Artikelpreis");
        lblArtikelpreis.setLocation(lblArtikelname.getX(),lblArtikelname.getY()+100);
        lblArtikelpreis.setSize(200,100);

        txtBeschreibung = new JTextField("ihre Artikelbeschreibung");
        txtBeschreibung.setLocation(lblArtikelbeschreibung.getX(),lblArtikelbeschreibung.getY()+70);
        txtBeschreibung.setSize(200,20);

        txtName = new JTextField("ihr Artikelname");
        txtName.setLocation(lblArtikelname.getX(),lblArtikelname.getY()+70);
        txtName.setSize(200,20);

        txtPreis = new JTextField("ihr Artikelpreis (netto)");
        txtPreis.setLocation(lblArtikelpreis.getX(),lblArtikelpreis.getY()+70);
        txtPreis.setSize(200,20);
        txtPreis.setText("" + datensaetze);

        btnSpeichern = new JButton("speichern");
        btnSpeichern.setLocation(txtPreis.getX()+20, txtPreis.getY()+20);
        btnSpeichern.setSize(200,20);
        btnSpeichern.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int artikelnummer = char(txtName.getText());
                Artikel artikel = new Artikel (txtBeschreibung.getText(), artikelnummer, txtPreis.getText());
                txtBeschreibung.setText("");
                txtPreis.setText("");
                txtName.setText("");
            }
        });

        flaeche.add(btnSpeichern);
        flaeche.add(txtPreis);
        flaeche.add(txtName);
        flaeche.add(txtBeschreibung);
        flaeche.add(lblArtikelbeschreibung);
        flaeche.add(lblArtikelname);
        flaeche.add(lblArtikelpreis);

        btnSpeichern.setVisible(true);
        txtPreis.setVisible(true);
        txtName.setVisible(true);
        txtBeschreibung.setVisible(true);
        lblArtikelpreis.setVisible(true);
        lblArtikelname.setVisible(true);
        lblArtikelbeschreibung.setVisible(true);
        flaeche.setVisible(true);
        neuerArtikel.setVisible(true);

    }
}
