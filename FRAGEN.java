







import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;

/**
<<<<<<< HEAD
 *In dieser Klasse werden die Fragen für das QUIZ festgelegt
 * 
 * @author (LINDA UND LARA) 
 * @version (18.05)
 */
public class FRAGEN
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen

    
    String Frage1;
    String Frage2;
    String Frage3;
    String Frage4;
    String Frage5;
    String Antwort1;
    String Antwort2;
    String Antwort3;
    String Antwort4;
    String Antwort5;
    String RichtigeAnwort1;
    String RichtigeAnwort2;
    String RichtigeAnwort3;
    String RichtigeAnwort4;
    String RichtigeAnwort5;
    String TextField;
    ImageIcon ImageFrage1;


    /**
     * Konstruktor für Objekte der Klasse FRAGEN
     */
     FRAGEN()
    {
        
        // Instanzvariable initialisieren
        Frage1 = "Wie viele Zaehne kann ein Hai im Laufe seines Lebens haben?";
        Frage2 = "Welche der folgenden Nagetiere haelt keinen Winterschlaf?";
        Frage3 = "Wie nennt man ein maennliches Schaf?";
        Frage4 = "Welcher dieser Affen zaehlt nicht zu den Menschenaffen?";
        Frage5 = "Wer oder was ist eine Mimiose?";
        Antwort1 = "(A) Bis zu 20 000 Zaehne   (B) Bis zu 10 000 Zaehne  (C) bis zu 2000 Zaehne"  ;
        Antwort2 = "(A) Murmeltier  (B) Siebenschlaefer  (C) Lemming ";
        Antwort3 = "(A) Lamm   (B) Hammel   (C) Widder ";
        Antwort4 = "(A) Gorilla   (B) Gibbon   (C) Oran-utan";
        Antwort5 = "(A) eine Hautkrankheit   (B)  eine tropische Pflanze  (C) ein biochemischer Vorgang ";
        RichtigeAnwort1 = "(A)";
        RichtigeAnwort2  = "(C)";
        RichtigeAnwort3  = "(C)";
        RichtigeAnwort4  = "(B)";
        RichtigeAnwort5  = "(B)";

  }
  
  void Frage1 ()
        {
           System. out. println(Frage1); 
           System. out. println(Antwort1);
        }
  void Frage2 ()
        {
           System. out. println (Frage2); 
           System. out. println(Antwort2);
        }
  void Frage3 ()
        {
           System. out. println (Frage3); 
           System. out. println(Antwort3);
        }
  void Frage4 ()
        {
           System. out. println (Frage4); 
           System. out. println(Antwort4);
        }      
  void Frage5 ()
        {
           System. out. println (Frage5);
           System. out. println(Antwort5);
        }
 }
  


