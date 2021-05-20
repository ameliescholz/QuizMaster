import java.awt.*;
import javax. swing. *;
import java.awt.event.*;
/**
 * Beschreiben Sie hier die Klasse ZEICHENFLÄCHE.
 * 
 * @author (Lara und Linda) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class ZEICHENFLAECHE 

{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private static final int rasterGroesse = 40;
    private static final int hoeheFenster = rasterGroesse * 20;
    private static final int breiteFenster = rasterGroesse * 26;
    private static ZEICHENFLAECHE o = null;
    private JFrame fenster = null;
    
   
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
