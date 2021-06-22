import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Beschreiben Sie hier die Klasse Spiel.
 * 
 * @author (Lara und Linda) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Spiel extends QUIZ
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    ZEICHENFLAECHE zeichenflaeche;
    FRAGEN fragen;
    QUIZ quiz;
    
    Label fragetext; 
    
    Label antworttext;
    
    private static final int rasterGroesse = 40;
    private static final int hoeheFenster = rasterGroesse * 20;
    private static final int breiteFenster = rasterGroesse * 26;
    private static ZEICHENFLAECHE o = null;
    private JFrame fenster = null;
    JLabel l;
    int x,y;
    JFrame f;
   
    static int Punkte = 0;
    /**
     * Konstruktor für Objekte der Klasse Spiel
     */
    public Spiel()
    {
        // Instanzvariable initialisieren
        Spielstarten();
        
    }

    /**
     * Diese Methode fuehrt das Spiel durch und setzt alle Methoden in die richtige 
     * Reihenfolge
     * 
     * 
     */
    void Spielstarten()
    {
        // tragen Sie hier den Code ein
        zeichenflaeche = new ZEICHENFLAECHE();
        zeichenflaeche. FensterGeben (). addKeyListener (new KeyAdapter() {
            public void keyPressed(KeyEvent e)
            {
                TasteGedrueckt ((char) e. getKeyCode ());
                
            }
        });
        if (momentanefrage == "Frage1")
        {
                if (Ergebniss == true)
                {
                    MomentaneFrageaendern();
                    fragetext = new Label();
                    fragetext.setText(momentanefrage);
                    fragetext.setVisible(true);
                    fragetext.setLocation(200,50);
                    fragetext.setSize(400,50);
                    fenster.add(fragetext);
                    
                    MomentaneAntwortAaendern();
                    antworttext = new Label();
                    antworttext.setText(momentaneantwortA);
                    antworttext.setVisible(true);
                    antworttext.setLocation(200,100);
                    antworttext.setSize(450,50);
                    fenster.add(antworttext);
                    
                    Punkte = Punkte +1;
                    zeichenflaeche.vogelbew();
                
                }
                else if (Ergebniss == false)
                {
                    MomentaneFrageaendern();
                    fragetext = new Label();
                    fragetext.setText(momentanefrage);
                    fragetext.setVisible(true);
                    fragetext.setLocation(200,50);
                    fragetext.setSize(400,50);
                    fenster.add(fragetext);
                    
                    MomentaneAntwortCaendern();
                    MomentaneAntwortBaendern();
                    antworttext = new Label();
                    antworttext.setText(momentaneantwortA);
                    antworttext.setVisible(true);
                    antworttext.setLocation(200,100);
                    antworttext.setSize(450,50);
                    fenster.add(antworttext);
                }
        }
        else if (momentanefrage == "Frage2")
        {
                if (Ergebniss == true)
                {
                    MomentaneFrageaendern();
                    fragetext = new Label();
                    fragetext.setText(momentanefrage);
                    fragetext.setVisible(true);
                    fragetext.setLocation(200,50);
                    fragetext.setSize(400,50);
                    fenster.add(fragetext);
                    
                    MomentaneAntwortCaendern();
                    MomentaneAntwortCaendern();
                    antworttext = new Label();
                    antworttext.setText(momentaneantwortC);
                    antworttext.setVisible(true);
                    antworttext.setLocation(200,100);
                    antworttext.setSize(450,50);
                    fenster.add(antworttext);
                    
                    Punkte = Punkte +1;
                    zeichenflaeche.vogelbew();
                }
                else if (Ergebniss == false)
                {
                    MomentaneFrageaendern();
                    fragetext = new Label();
                    fragetext.setText(momentanefrage);
                    fragetext.setVisible(true);
                    fragetext.setLocation(200,50);
                    fragetext.setSize(400,50);
                    fenster.add(fragetext);
                    
                    MomentaneAntwortAaendern();
                    MomentaneAntwortBaendern();
                    antworttext = new Label();
                    antworttext.setText(momentaneantwortC);
                    antworttext.setVisible(true);
                    antworttext.setLocation(200,100);
                    antworttext.setSize(450,50);
                    fenster.add(antworttext);
                }
        }
        else if (momentanefrage == "Frage3")
        {
                if (Ergebniss == true)
                {
                    MomentaneFrageaendern();
                    fragetext = new Label();
                    fragetext.setText(momentanefrage);
                    fragetext.setVisible(true);
                    fragetext.setLocation(200,50);
                    fragetext.setSize(400,50);
                    fenster.add(fragetext);
                    
                    MomentaneAntwortCaendern();
                    MomentaneAntwortCaendern();
                    antworttext = new Label();
                    antworttext.setText(momentaneantwortC);
                    antworttext.setVisible(true);
                    antworttext.setLocation(200,100);
                    antworttext.setSize(450,50);
                    fenster.add(antworttext);
                    
                    Punkte = Punkte +1;
                    zeichenflaeche.vogelbew();
                }
                else if (Ergebniss == false)
                {
                    MomentaneFrageaendern();
                    fragetext = new Label();
                    fragetext.setText(momentanefrage);
                    fragetext.setVisible(true);
                    fragetext.setLocation(200,50);
                    fragetext.setSize(400,50);
                    fenster.add(fragetext);
                    
                    MomentaneAntwortAaendern();
                    MomentaneAntwortBaendern();
                    antworttext = new Label();
                    antworttext.setText(momentaneantwortC);
                    antworttext.setVisible(true);
                    antworttext.setLocation(200,100);
                    antworttext.setSize(450,50);
                    fenster.add(antworttext);
                }
        }
        else if (momentanefrage == "Frage4")
        {
                if (Ergebniss == true)
                {
                    MomentaneFrageaendern();
                    fragetext = new Label();
                    fragetext.setText(momentanefrage);
                    fragetext.setVisible(true);
                    fragetext.setLocation(200,50);
                    fragetext.setSize(400,50);
                    fenster.add(fragetext);
                    
                    MomentaneAntwortBaendern();
                    MomentaneAntwortBaendern();
                    antworttext = new Label();
                    antworttext.setText(momentaneantwortB);
                    antworttext.setVisible(true);
                    antworttext.setLocation(200,100);
                    antworttext.setSize(450,50);
                    fenster.add(antworttext);
                    
                    Punkte = Punkte +1;
                    zeichenflaeche.vogelbew();
                }
                else if (Ergebniss == false)
                {
                    MomentaneFrageaendern();
                    fragetext = new Label();
                    fragetext.setText(momentanefrage);
                    fragetext.setVisible(true);
                    fragetext.setLocation(200,50);
                    fragetext.setSize(400,50);
                    fenster.add(fragetext);
                    
                    MomentaneAntwortAaendern();
                    MomentaneAntwortCaendern();
                    antworttext = new Label();
                    antworttext.setText(momentaneantwortB);
                    antworttext.setVisible(true);
                    antworttext.setLocation(200,100);
                    antworttext.setSize(450,50);
                    fenster.add(antworttext);
                }
        }
        else if (momentanefrage == "Frage5")
        {
                if (Ergebniss == true)
                {
                    MomentaneFrageaendern();
                    fragetext = new Label();
                    fragetext.setText(momentanefrage);
                    fragetext.setVisible(true);
                    fragetext.setLocation(200,50);
                    fragetext.setSize(400,50);
                    fenster.add(fragetext);
                    
                    MomentaneAntwortBaendern();
                    MomentaneAntwortBaendern();
                    antworttext = new Label();
                    antworttext.setText(momentaneantwortB);
                    antworttext.setVisible(true);
                    antworttext.setLocation(200,100);
                    antworttext.setSize(450,50);
                    fenster.add(antworttext);
                    
                    Punkte = Punkte +1;
                    zeichenflaeche.vogelbew();
                }
                else if (Ergebniss == false)
                {
                    MomentaneFrageaendern();
                    fragetext = new Label();
                    fragetext.setText(momentanefrage);
                    fragetext.setVisible(true);
                    fragetext.setLocation(200,50);
                    fragetext.setSize(400,50);
                    fenster.add(fragetext);
                    
                    MomentaneAntwortAaendern();
                    MomentaneAntwortCaendern();
                    antworttext = new Label();
                    antworttext.setText(momentaneantwortB);
                    antworttext.setVisible(true);
                    antworttext.setLocation(200,100);
                    antworttext.setSize(450,50);
                    fenster.add(antworttext);
                }
        }
       
       
    }
    void TasteGedrueckt (char welche)
    {
        //System. out. println ("Taste gedrückt: " + welche);
        quiz.TasteGedrueckt ( welche);
    }
    static int getPunkte()
    {
        return Punkte;
    }
}

