import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.KeyListener;
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
    
    //private static final int rasterGroesse = 40;
    //private static final int hoeheFenster = rasterGroesse * 20;
    //private static final int breiteFenster = rasterGroesse * 26;
    //private static ZEICHENFLAECHE o = null;
    //private JFrame fenster = null;
    //JLabel l;
    //int x,y;
    //JFrame f;
   
    
    /**
     * Konstruktor für Objekte der Klasse Spiel
     */
    public Spiel()
    {
        // Instanzvariable initialisieren
        
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
        new ZEICHENFLAECHE() ;
        
        
        if (momentanefrage == "Frage1")

        {
              Antwortpruefen ();
              ZEICHENFLAECHE zeichenflaeche;
        
                if (Ergebniss == true)
                
                {
                    MomentaneFrageaendern ();
                    MomentaneAntwortAaendern ();
                    MomentaneAntwortBaendern ();
                    MomentaneAntwortCaendern ();
                    
                    //Frageerstellen();
                    //AntwortAerstellen ();
                    //AntwortBerstellen ();
                    //AntwortCerstellen ();
                    
                    
                    
                    
                }
                else if (Ergebniss == false)
                {
                    
                }
        }
        else if (momentanefrage == "Frage2")
        {
                if (Ergebniss == true)
                {
                    
                }
                else if (Ergebniss == false)
                {
                    
                }
        }
        else if (momentanefrage == "Frage3")
        {
                if (Ergebniss == true)
                {
                    
                }
                else if (Ergebniss == false)
                {
                    
                }
        }
        else if (momentanefrage == "Frage4")
        {
                if (Ergebniss == true)
                {
                    
                }
                else if (Ergebniss == false)
                {
                    
                }
        }
        else if (momentanefrage == "Frage5")
        {
                if (Ergebniss == true)
                {
                    
                }
                else if (Ergebniss == false)
                {
                                    }
        }
       
       
    }
}
