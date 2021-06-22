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
public class SPIEL extends QUIZ
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
   
    private static final int rasterGroesse = 40;
    private static final int hoeheFenster = rasterGroesse * 20;
    private static final int breiteFenster = rasterGroesse * 26;
    private static ZEICHENFLAECHE o = null;
    private JFrame fenster = null;
    JLabel l;
    int x,y;
    JFrame f;
    
    
    
    Button antworttextA;
    Button antworttextB;
    Button antworttextC;
    
    
    /**
     * Konstruktor für Objekte der Klasse Spiel
     */
    public SPIEL()
    {
        // Instanzvariable initialisieren
        fenster = new JFrame ("QuizMaster");
        fenster. setResizable (false);
        fenster. setVisible (true);
        fenster. setLayout (null);
        fenster. getContentPane (). setBackground (new Color (240, 240, 240));
        Insets i = fenster.getInsets();
        fenster. setSize (breiteFenster, hoeheFenster + i.top);  
        
        fragetext = new Label();
        fragetext.setText(momentanefrage);
        fragetext.setVisible(true);
        fragetext.setLocation(200,50);
        fragetext.setSize(400,50);
        fenster.add(fragetext);
        
         antworttextA = new Button();
        antworttextA.setLocation(10,150);
        antworttextA.setLabel(momentaneantwortA);
        antworttextA.setVisible(true);
        antworttextA.setSize(200,30);
        antworttextA.setEnabled(true);
        antworttextA.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                geantwortet = 'A';
                Spielstarten();
            }
        });
        fenster.add(antworttextA);
        
        antworttextB = new Button();
        antworttextB.setLocation(250,150);
        antworttextB.setLabel(momentaneantwortB);
        antworttextB.setVisible(true);
        antworttextB.setSize(200,30);
        antworttextB.setEnabled(true);
        antworttextB.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                geantwortet = 'B';
            }
        });
        fenster.add(antworttextB);
        
        
        antworttextC = new Button();
        antworttextC.setLocation(490,150);
        antworttextC.setLabel(momentaneantwortC);
        antworttextC.setVisible(true);
        antworttextC.setSize(200,30);
        antworttextC.setEnabled(true);
        antworttextC.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                geantwortet = 'C';
            }
        });
        fenster.add(antworttextC);
    
        
        
        
        
        fenster.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(1);
            }
        });
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
              
           
        
                if (Ergebniss == true)
                
                {
                    MomentaneFrageaendern ();
                    MomentaneAntwortAaendern ();
                    MomentaneAntwortBaendern ();
                    MomentaneAntwortCaendern ();
                    
                    Frageerstellen();
                    AntwortAerstellen ();
                    AntwortBerstellen ();
                    AntwortCerstellen ();
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
    
    
    
    
    
    
    
    
    
    //static JFrame FensterGeben ()
    //{
        //if (o == null)
        //{
            //o = new ZEICHENFLAECHE ();
        //}
        //return o.fenster;
    //}
    
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
    
    void Frageerstellen()
    {
        fragetext = new Label();
        fragetext.setText(momentanefrage);
        fragetext.setVisible(true);
        fragetext.setLocation(200,50);
        fragetext.setSize(400,50);
        fenster.add(fragetext);  
    }
    
    
    
    void AntwortAerstellen ()
      {
      antworttextA = new Button();
        antworttextA.setLocation(10,150);
        antworttextA.setLabel(momentaneantwortA);
        antworttextA.setVisible(true);
        antworttextA.setSize(200,30);
        antworttextA.setEnabled(true);
        antworttextA.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                geantwortet = 'A';
                Spielstarten();
            }
        });
        fenster.add(antworttextA);  
      }
      
    void AntwortBerstellen ()
     {
      antworttextB = new Button();
        antworttextB.setLocation(250,150);
        antworttextB.setLabel(momentaneantwortB);
        antworttextB.setVisible(true);
        antworttextB.setSize(200,30);
        antworttextB.setEnabled(true);
        antworttextB.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                geantwortet = 'B';
                Spielstarten();
            }
        });
        fenster.add(antworttextB);  
     }
     
     void AntwortCerstellen ()
     {
        antworttextC = new Button();
        antworttextC.setLocation(490,150);
        antworttextC.setLabel(momentaneantwortC);
        antworttextC.setVisible(true);
        antworttextC.setSize(200,30);
        antworttextC.setEnabled(true);
        antworttextC.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                geantwortet = 'C';
                Spielstarten();
            }
        });
        fenster.add(antworttextC); 
    }
}
