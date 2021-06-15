


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
    String momentaneantwortA;
    String momentaneantwortB;
    String momentaneantwortC;
    ZEICHENFLAECHE fragetext;
    
    /**
     * Konstruktor für Objekte der Klasse QUIZFRAGEN
     */
    QUIZ()
    {
        // Instanzvariable initialisieren
        momentanefrage = Frage1;
        momentaneantwortA = Antwort1A;
        momentaneantwortB = Antwort1B;
        momentaneantwortC = Antwort1C;
        
     
        
         
    }

    //void Ausloeser()
    //{
        //TasteGedrueckt();
        // Antwortpruefen();
    //}
    
    /**
     *nicht mehr noetig:
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
            
        }
        else if (momentanefrage == "Frage2")
        {
            
        }
        else if (momentanefrage == "Frage3")
        {
            
        }
        else if (momentanefrage == "Frage4")
        {
            
        }
        else if (momentanefrage == "Frage5")
        {
            
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
    
    
    
    void MomentaneAntwortAaendern()
    {
        if (momentaneantwortA == "Antwort1A")
        {
             momentaneantwortA = "Antwort2A";
            }
        else if(momentaneantwortA == "Antwort2A")
        {
             momentaneantwortA = "Antwort3A";
            }
        else if(momentaneantwortA == "Antwort3A")
        {
             momentaneantwortA = "Antwort4A";
            }
        else if(momentaneantwortA == "Antwort4A")
        {
             momentaneantwortA = "Antwort5A";
            }
        else if(momentaneantwortA == "Antwort5A")
        {
             momentaneantwortA = "Antwort6A";
            }
   }
            
        void MomentaneAntwortBaendern()
    {
        if (momentaneantwortA == "Antwort1B")
            {
             momentaneantwortA = "Antwort2B";
            }
        else if(momentaneantwortA == "Antwort2B")
            {
             momentaneantwortA = "Antwort3B";
            }
        else if(momentaneantwortA == "Antwort3B")
            {
             momentaneantwortA = "Antwort4B";
            }
        else if(momentaneantwortA == "Antwort4B")
            {
             momentaneantwortA = "Antwort5B";
            }
        else if(momentaneantwortA == "Antwort5B")
            {
             momentaneantwortA = "Antwort6B";
            }
    }     
            
        void MomentaneAntwortCaendern()
    {
        if (momentaneantwortA == "Antwort1C")
            {
             momentaneantwortA = "Antwort2C";
            }
        else if(momentaneantwortA == "Antwort2C")
            {
             momentaneantwortA = "Antwort3C";
            }
        else if(momentaneantwortA == "Antwort3C")
            {
             momentaneantwortA = "Antwort4C";
            }
        else if(momentaneantwortA == "Antwort4C")
            {
             momentaneantwortA = "Antwort5C";
            }
        else if(momentaneantwortA == "Antwort5C")
            {
             momentaneantwortA = "Antwort6C";
            }
    }
    
    
    
}
