


import java. awt. *;
import java. awt. event. *;
/**
<<<<<<< HEAD
 * Die Klasse Quiz steuert die Klasse Spiel.
 * 
 * @author (LINDA UND LARA) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class QUIZ extends FRAGEN
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    
    char geantwortet;
    String momentanefrage;
    boolean Ergebniss;
    String momentaneantwort;
    ZEICHENFLAECHE fragetext;
    
    /**
     * Konstruktor für Objekte der Klasse QUIZFRAGEN
     */
    QUIZ()
    {
        // Instanzvariable initialisieren
        momentanefrage = Frage1;
        momentaneantwort = Antwort1;
        
         
    }

    void Ausloeser()
    {
        //TasteGedrueckt();
         Antwortpruefen();
    }
    
    /**
     * hier wird die gedruekte Taste einer moeglichen Antwortmoeglichkeit zugeordnet
     *
     */
    void TasteGedrueckt(char welche)
    {
        System. out. println ("Taste gedrückt: " + welche);
    
        switch (welche)
        {
          case 'A':
          case 'a':
            geantwortet = 'A';
            break;
          case 'B':
          case 'b':
            geantwortet = 'B';
            break;
          case 'C':
          case 'c':
            geantwortet = 'C';
            break;
          default:
            //System. out. println ());
        }

  
    }
    
    /**
     * nicht mehr noetig
     *
     */
    
    void Fragestellen ()
    {
      
        
        if (momentanefrage == "Frage1")
        {
            Frage1 ();
        }
        else if (momentanefrage == "Frage2")
        {
            Frage2 ();
        }
        else if (momentanefrage == "Frage3")
        {
            Frage3 ();
        }
        else if (momentanefrage == "Frage4")
        {
            Frage4 ();
        }
        else if (momentanefrage == "Frage5")
        {
            Frage5 ();
        }
      
    }
    
    void Antwortpruefen()
    {
        if (momentanefrage == "Frage1")
        {
           if (geantwortet == 'A')
            {
            Ergebniss = true;
            }
           else 
            {   
            Ergebniss = false;
            }
        }
        else if (momentanefrage == "Frage2")
        {
            if (geantwortet == 'C')
            {
            Ergebniss = true;
            }
           else 
            {   
            Ergebniss = false;
            }
        }
        else if (momentanefrage == "Frage3")
        {
            if (geantwortet == 'C')
            {
            Ergebniss = true;
            }
           else 
            {   
            Ergebniss = false;
            }
        }
        else if (momentanefrage == "Frage4")
        {
            if (geantwortet == 'B')
            {
            Ergebniss = true;
            }
           else 
            {   
            Ergebniss = false;
            }
        }
        else if (momentanefrage == "Frage5")
        {
            if (geantwortet == 'B')
            {
            Ergebniss = true;
            }
           else 
            {   
            Ergebniss = false;
            }
        }
    }
    
    void MomentaneFrageaendern()
    {
        if (momentanefrage == "Frage1")
            {
             momentanefrage = "Frage2";
             //fragetext.setText(momentanefrage);
            }
        else if(momentanefrage == "Frage2")
            {
             momentanefrage = "Frage3";
             //fragetext.setText(momentanefrage);
            }
        else if(momentanefrage == "Frage3")
            {
             momentanefrage = "Frage4";
             //fragetext.setText(momentanefrage);
            }
        else if(momentanefrage == "Frage4")
            {
             momentanefrage = "Frage5";
             //fragetext.setText(momentanefrage);
            }
        else if(momentanefrage == "Frage5")
            {
             momentanefrage = "Frage6";
             //fragetext.setText(momentanefrage);
            }
    }
    
    
    
    void MomentaneAntwortaendern()
    {
        if (momentaneantwort == "Antwort1")
            {
             momentaneantwort = "Antwort2";
            }
        else if(momentaneantwort == "Antwort2")
            {
             momentaneantwort = "Antwort3";
            }
        else if(momentaneantwort == "Antwort3")
            {
             momentaneantwort = "Antwort4";
            }
        else if(momentaneantwort == "Antwort4")
            {
             momentaneantwort = "Antwort5";
            }
        else if(momentaneantwort == "Antwort5")
            {
             momentaneantwort = "Antwort6";
            }
    }
    
    
}
