import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.KeyListener;

/**
 * Beschreiben Sie hier die Klasse ZEICHENFLÄCHE.
 * 
 * @author (Lara und Linda) 
 * @version (eine Versionsnummer oder ein Datum)
 */

public class ZEICHENFLAECHE extends QUIZ
{




   
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private static final int rasterGroesse = 40;
    private static final int hoeheFenster = rasterGroesse * 20;
    private static final int breiteFenster = rasterGroesse * 26;
    private static ZEICHENFLAECHE o = null;
    private JFrame fenster = null;
    JLabel l;
    int x,y;
    JFrame f;
    
    Label fragetext;
    
    Label antworttext;
   
  
    /**
     * Konstruktor für Objekte der Klasse ZEICHENFLAECHE
     */
    public ZEICHENFLAECHE()
    {
        // Instanzvariable initialisieren
        fenster = new JFrame ("QuizMaster");
        fenster. setResizable (false);
        fenster. setVisible (true);
        fenster. setLayout (null);
        fenster. getContentPane (). setBackground (new Color (240, 240, 240));
        Insets i = fenster.getInsets();
        fenster. setSize (breiteFenster, hoeheFenster + i.top);  
        //ImageFrage1 = new ImageIcon ("Frage 1.jpg");
        //l = new JLabel (ImageFrage1);
        //l.setLocation(x,y);
        //f.add(l);
        //x = 0;
        //y = 0;
        //f = new JFrame();
        //f.setVisible(true);
        //f.setSize(500,500);
        
        
        fragetext = new Label();
        fragetext.setText(momentanefrage);
        fragetext.setVisible(true);
        fragetext.setLocation(200,50);
        fragetext.setSize(400,50);
        fenster.add(fragetext);
        
        antworttext = new Label();
        antworttext.setText(momentaneantwort);
        antworttext.setVisible(true);
        antworttext.setLocation(200,100);
        antworttext.setSize(450,50);
        fenster.add(antworttext);
        
        
        
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    static JFrame FensterGeben ()
    {
        if (o == null)
        {
            o = new ZEICHENFLAECHE ();
        }
        return o. fenster;
    }
    
    static int RasterGroesseGeben ()
    {
        return rasterGroesse;
    }
    
    static int FensterBreiteGeben ()
    {
        return breiteFenster;
    }
    
    static int FensterHoeheGeben ()
    {
        return hoeheFenster;
    }
    
     
    
}

