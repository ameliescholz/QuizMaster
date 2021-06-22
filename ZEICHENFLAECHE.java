import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
//import java.awt.event.KeyListener;
	

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
    
    ImageIcon vogel;
    JLabel v;
    int w,z;
    
    Label fragetext;
    
    Label antworttext;
    
    private Timer timer;
    
    JLabel lbl;
    int d = 8*100;
    int r;
    
    JLabel lbl2;
    int d2 = 3*100;
    int r2; 

  
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
        fenster. getContentPane (). setBackground (new Color (0, 255, 255));
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
        
        vogelm();
        sonnem();
        wolkem(150);
        wolkem2(300);
        baumm();
        baumm2();
        baumm3();
        baumm4();
        baumm5();
        
        fragetext = new Label();
        fragetext.setText(momentanefrage);
        fragetext.setVisible(true);
        fragetext.setLocation(200,50);
        fragetext.setSize(400,50);
        fenster.add(fragetext);
         
        antworttext = new Label();
        antworttext.setText(momentaneantwortA);
        antworttext.setVisible(true); 
        antworttext.setLocation(200,100);
        antworttext.setSize(450,50);
        fenster.add(antworttext);
        
        

        
        timer = new Timer (1000, new ActionListener () {
        public void actionPerformed(ActionEvent evt)
        {
            
             TaktImpulsAusfuehren ();
             
        }
        });  
        timer. start();
    }
    void TaktImpulsAusfuehren ()
    {
        //System. out. println ("Tick");
        
        wolkebew();
        
    }  
    
    public void vogelm()
    {
        vogel = new ImageIcon("bild2.jpg");
        w = 100;
        z = 500;
        int skalierung = 2;
        int width = vogel.getIconWidth()/skalierung;
        int height = vogel.getIconHeight()/skalierung;
        
        //Image scaled = scaleImage(vogel.getImage(), width, height);
        Image scaled = vogel.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon sc = new ImageIcon(scaled);
        v = new JLabel(sc);
        v.setLocation(w,z);
        fenster.add(v);
        int u = vogel.getIconWidth()/skalierung;
        int h = vogel.getIconHeight()/skalierung;
        v.setSize(u,h);
    }
    public int getVogelx()
    {
        return w;
    }
    public int getVogely()
    {
        return z;
    }
    public void vogelbew()
    {
        if(Spiel.getPunkte() == 1)
        {
            v.setLocation(320,500);
        }else if(Spiel.getPunkte() ==2)
        {
            v.setLocation(500,500);
        }else if(Spiel.getPunkte() ==3)
        {
            v.setLocation(650,500);
        }else if(Spiel.getPunkte() ==4)
        {
            v.setLocation(820,500);
        }
    }
    
    public void sonnem()
    {
        SonneIcon si = new SonneIcon();
        JLabel s = new JLabel(si);
        s.setLocation(8*100,-120);
        s.setSize(si.getIconWidth(),si.getIconHeight());
        s.setVisible(true);
        fenster.add(s);
    }
    public void baumm()
    {
        BaumIcon bi = new BaumIcon();
        JLabel b = new JLabel(bi);
        b.setLocation(80,640);
        b.setSize(bi.getIconWidth(),bi.getIconHeight());
        b.setVisible(true);
        fenster.add(b);
    } 
    public void baumm2()
    {
        BaumIcon bi = new BaumIcon();
        JLabel b = new JLabel(bi);
        b.setLocation(300,640);
        b.setSize(bi.getIconWidth(),bi.getIconHeight());
        b.setVisible(true);
        fenster.add(b);
    } 
    public void baumm3()
    {
        BaumIcon bi = new BaumIcon();
        JLabel b = new JLabel(bi);
        b.setLocation(480,640);
        b.setSize(bi.getIconWidth(),bi.getIconHeight());
        b.setVisible(true);
        fenster.add(b);
    } 
    public void baumm4()
    {
        BaumIcon bi = new BaumIcon();
        JLabel b = new JLabel(bi);
        b.setLocation(630,640);
        b.setSize(bi.getIconWidth(),bi.getIconHeight());
        b.setVisible(true);
        fenster.add(b);
    } 
    public void baumm5()
    {
        BaumIcon bi = new BaumIcon();
        JLabel b = new JLabel(bi);
        b.setLocation(800,640);
        b.setSize(bi.getIconWidth(),bi.getIconHeight());
        b.setVisible(true);
        fenster.add(b);
    } 
    public void wolkem(int f)
    {
        r=f;
        WolkeIcon wi = new WolkeIcon();
        lbl = new JLabel(wi);  
        // lbl.setBackground(Color.gray);
        lbl.setLocation(d,f);
        //.setLocation(200,200);
        lbl.setSize(wi.getIconWidth(),wi.getIconHeight());
        lbl.setVisible(true);
        fenster.add(lbl);
    }
    public void wolkem2(int f)
    {
        r2=f;
        WolkeIcon wi = new WolkeIcon();
        lbl2 = new JLabel(wi);  
        // lbl.setBackground(Color.gray);
        lbl2.setLocation(d2,f);
        //.setLocation(200,200);
        lbl2.setSize(wi.getIconWidth(),wi.getIconHeight());
        lbl2.setVisible(true);
        fenster.add(lbl2);
    }
    public void wolkebew()
    {
        lbl.setLocation(d= d-5,r);
        lbl2.setLocation(d2 = d2- 10,r2);
        if(d<=0)
        {
            d=10*100;
        }
        if(d2<=0)
        {
            d2=10*100;
        }
    }
    
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

    


