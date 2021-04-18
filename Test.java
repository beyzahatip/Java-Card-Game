package Ssun;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Test extends Thread {
    private final Computer p1;
    private final Player p2;
    private final List<Athlete> cards;
    private final ImageIcon backCard;
    
    //cmp cards
    private final JButton pcard1;
    private final JButton pcard2;
    private final JButton pcard3;
    private final JButton pcard4;
    private final JButton pcard5;
    private final JButton pcard6;
    private final JButton pcard7;
    private final JButton pcard8;
    //plyr cards
    private final JButton p2card1;
    private final JButton p2card2;
    private final JButton p2card3;
    private final JButton p2card4;
    private final JButton p2card5;
    private final JButton p2card6;
    private final JButton p2card7;
    private final JButton p2card8;
    //secilince ortada duracak 2 card
    private final JButton ocard1;
    private final JButton ocard2;
    
    private final JLabel texts;
    private final JLabel texts1;
    private final JLabel p1texts;
    private final JLabel p2texts;
    private final JLabel endofgame;
    private final JTextField gameName;
    private final JTextField crtrName;
    private final JFrame frame;
    private final JButton start;
    
    public Test(JFrame aFrame) throws IOException  {
        
        frame = aFrame;
        p1 = new Computer(0,"Computer");
        p2=new Player(0,"Player");
        backCard = new ImageIcon(ImageIO.read(new File("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\Ssun\\vplayer\\backofcard.jpg")));
        start = new JButton("Start Game");
        gameName = new JTextField("SSun");
        crtrName=new JTextField("Made by  IDE'nin Sultanları"); 
        cards= new ArrayList<>();
        pcard1 = new JButton();
        pcard2 = new JButton();
        pcard3= new JButton();
        pcard4 = new JButton();
        pcard5 = new JButton();
        pcard6 = new JButton();
        pcard7 = new JButton();
        pcard8 = new JButton();
        
        
        p2card1 = new JButton();
        p2card2 = new JButton();
        p2card3 = new JButton();
        p2card4 = new JButton();
        p2card5 = new JButton();
        p2card6 = new JButton();
        p2card7 = new JButton();
        p2card8 = new JButton();
       
       
        ocard1 = new JButton();
        ocard2 = new JButton();
       
       
        texts = new JLabel();
        texts1 = new JLabel();
        p1texts = new JLabel();
        p2texts = new JLabel();
        endofgame = new JLabel();
    }
    
   
    //Koordinal alir ve o koordinatta bir buton dondurur, default olarak buton gorunmezdir
    public JButton createCardButton(JButton buton, int x, int y) {
        buton.setIcon(backCard);
        buton.setBounds(x, y, 130, 180);
        buton.setVisible(false);
        return buton;
    }
    
    
    public void createScreen() {
        
        texts.setBounds(100, 370, 430, 100);
        texts.setHorizontalAlignment(SwingConstants.CENTER);
        texts.setFont(new Font("Constantia", Font.BOLD, 25));
        texts.setForeground(new Color(186,80,150));
        
        texts1.setBounds(100, 340, 430, 100);
        texts1.setHorizontalAlignment(SwingConstants.CENTER);
        texts1.setFont(new Font("Constantia", Font.BOLD, 25));
        texts1.setForeground(new Color(116,53,116));
        
        p1texts.setBounds(1600, 100, 200, 50);
        p1texts.setHorizontalAlignment(SwingConstants.CENTER);
        p1texts.setFont(new Font("Constantia", Font.BOLD, 20));
        p1texts.setForeground(Color.ORANGE);
        
        p2texts.setBounds(1600, 700, 200, 50);
        p2texts.setHorizontalAlignment(SwingConstants.CENTER);
        p2texts.setFont(new Font("Constantia", Font.BOLD, 20));
        p2texts.setForeground(Color.ORANGE);

        endofgame.setBounds(300, 330, 1000, 200);
        endofgame.setHorizontalAlignment(SwingConstants.CENTER);
        endofgame.setFont(new Font("Constantia", Font.BOLD, 60));
        endofgame.setForeground(Color.ORANGE);
        
        gameName.setBounds(650,280,240,90);
        gameName.setHorizontalAlignment(SwingConstants.CENTER);
        gameName.setFont(new Font("Constantia", Font.BOLD, 60));
        gameName.setForeground(new Color(116,53,116));
        gameName.setBackground(Color.BLACK);
        gameName.setEditable(false);
        
        crtrName.setBounds(1500,960,400,70);
        crtrName.setHorizontalAlignment(SwingConstants.CENTER);
        crtrName.setFont(new Font("Constantia", Font.BOLD, 30));
        crtrName.setForeground(new Color(254,242,101));
        crtrName.setBackground(Color.BLACK);
        crtrName.setEditable(false);
        
        frame.add(crtrName);
        frame.add(gameName);
        frame.add(endofgame);
        frame.add(p1texts);
        frame.add(p2texts);
        frame.add(texts);
        frame.add(texts1);
        
        start.setBounds(660, 460, 220, 80);
        start.setBackground(Color.BLACK);
        start.setFont(new Font("Arial", Font.PLAIN, 30));
        start.setForeground(new Color(116,53,116));
        start.addActionListener((ActionEvent e) -> {
            //oyunu baslat
            startgame();
        });
        frame.add(start);
     
      
  
        frame.add(createCardButton(pcard1,160,30));
        frame.add(createCardButton(pcard2,350,30));
        frame.add(createCardButton(pcard3,530,30));
        frame.add(createCardButton(pcard4,710,30));
        frame.add(createCardButton(pcard5,900,30));
        frame.add(createCardButton(pcard6,1080,30));
        frame.add(createCardButton(pcard7,1270,30));
        frame.add(createCardButton(pcard8,1440,30));
        
        frame.add(createCardButton(p2card1,160,650));
        frame.add(createCardButton(p2card2,350,650));
        frame.add(createCardButton(p2card3,530,650));
        frame.add(createCardButton(p2card4,710,650));
        frame.add(createCardButton(p2card5,900,650));
        frame.add(createCardButton(p2card6,1080,650));
        frame.add(createCardButton(p2card7,1270,650));
        frame.add(createCardButton(p2card8,1440,650));
        
        frame.add(createCardButton(ocard1, 700, 330));
        frame.add(createCardButton(ocard2, 900, 330));

        frame.setSize(1965, 1080);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
 public void startgame() {
        start.setVisible(false);
        gameName.setVisible(false);
        crtrName.setVisible(false);
        defineCards();
        dealCards();
        start();
    }
    @Override
    public void run() {
        addPicsToCards();
         Random rand = new Random();
         int ctrl=0,tmp1=0,tmp2=0,tmp3=0;
        ArrayList<JButton> dnmf = new ArrayList<>();
        ArrayList<Integer> dnm1f = new ArrayList<>();
        ArrayList<JButton> dnmv = new ArrayList<>();
        ArrayList<Integer> dnm1v = new ArrayList<>();
        p2card1.setVisible(true);
        p2card2.setVisible(true);
        p2card3.setVisible(true);
        p2card4.setVisible(true);
        p2card5.setVisible(true);
        p2card6.setVisible(true);
        p2card7.setVisible(true);
        p2card8.setVisible(true);
        pcard1.setVisible(true);
        pcard2.setVisible(true);
        pcard3.setVisible(true);
        pcard4.setVisible(true);
        pcard5.setVisible(true);
        pcard6.setVisible(true);
        pcard7.setVisible(true);
        pcard8.setVisible(true);
        dnmf.add(pcard1);
        dnmf.add(pcard2);
        dnmf.add(pcard3);
        dnmf.add(pcard4);
        dnmv.add(pcard5);
        dnmv.add(pcard6);
        dnmv.add(pcard7);
        dnmv.add(pcard8);
        dnm1f.add(0);
        dnm1f.add(1);
        dnm1f.add(2);
        dnm1f.add(3);
        dnm1v.add(4);
        dnm1v.add(5);
        dnm1v.add(6);
        dnm1v.add(7);
        int test = 0;
             //Oyuncularin elinde kart oldugu surece oyun devam eder
        while (ctrl < 8) {
            ocard1.setVisible(false);
            ocard2.setVisible(false);
            p1texts.setText(p1.gamerName + " : " + p1.showScore());
            p2texts.setText(p2.gamerName + " : " + p2.showScore());
             if(ctrl==7)
                 test=0;
            //Oyuncu 2 kart secene kadar beklenir, sectigi kart one cikarilir
            int p2SecilenKartIndis = p2.pickCard(p2card1, p2card2, p2card3, p2card4, p2card5, p2card6, p2card7, p2card8, dnmf, dnmv, test);
            texts.setText("Choosen cards are opening.");
             if(test==0)
            {
                if(p2SecilenKartIndis>=4)
                {
                    test++;
                }
                
            }
                switch (p2SecilenKartIndis) {
                    case 0:
                        p2card1.setVisible(false);
                        ocard1.setIcon(p2.cards.get(0).getPic());
                        ocard1.setVisible(true);
                        break;
                    case 1:
                        p2card2.setVisible(false);
                        ocard1.setIcon(p2.cards.get(1).getPic());
                        ocard1.setVisible(true);
                        break;
                    case 2:
                        p2card3.setVisible(false);
                        ocard1.setIcon(p2.cards.get(2).getPic());
                        ocard1.setVisible(true);
                        break;
                    case 3:
                        p2card4.setVisible(false);
                        ocard1.setIcon(p2.cards.get(3).getPic());
                        ocard1.setVisible(true);
                        break;

                    case 4:
                        p2card5.setVisible(false);
                        ocard1.setIcon(p2.cards.get(4).getPic());
                        ocard1.setVisible(true);
                        break;
                    case 5:
                        p2card6.setVisible(false);
                        ocard1.setIcon(p2.cards.get(5).getPic());
                        ocard1.setVisible(true);
                        break;
                    case 6:
                        p2card7.setVisible(false);
                        ocard1.setIcon(p2.cards.get(6).getPic());
                        ocard1.setVisible(true);
                        break;
                    case 7:
                        p2card8.setVisible(false);
                        ocard1.setIcon(p2.cards.get(7).getPic());
                        ocard1.setVisible(true);
                        break;
                    default:
                        break;
                }
            test++;

            //Oyuncu 1 kart secene kadar beklenir, sectigi kart one cikarilir
           texts.setText(p1.gamerName + " is choosing card.");
            int secim;
            secim = rand.nextInt(3);
            int p1SecilenKartIndis = p1.pickCard(pcard1, pcard2, pcard3, pcard4, pcard5, pcard6, pcard7, pcard8, dnmf, dnmv, p2SecilenKartIndis);
            //yazilar.setText("Choosen cards are opening.");
            if (p2SecilenKartIndis < 4) {
                dnmf.get(p1SecilenKartIndis).setVisible(false);
                ocard2.setIcon(p1.cards.get(dnm1f.get(p1SecilenKartIndis)).getPic());
                ocard2.setVisible(true);
                
                if (secim == 0) {
                    texts1.setText("Comparing Properity Scratch Spin");
                    if (p1.cards.get(dnm1f.get(p1SecilenKartIndis)).prob1 > p2.cards.get(p2SecilenKartIndis).prob1) {

                        texts.setText(p1.gamerName + " gets 10 points.");
                        p1.addPoint();
                    } else if (p1.cards.get(dnm1f.get(p1SecilenKartIndis)).prob1 < p2.cards.get(p2SecilenKartIndis).prob1) {
                        texts.setText(p2.gamerName + " gets 10 points.");
                        p2.addPoint();
                    } else {
                          if(p2SecilenKartIndis==0){
                           p2card1.setVisible(true);}
                          if(p2SecilenKartIndis==1){
                           p2card2.setVisible(true);}       
                          if(p2SecilenKartIndis==2){
                           p2card3.setVisible(true);}       
                          if(p2SecilenKartIndis==3){
                           p2card4.setVisible(true);}       
                        dnmf.get(p1SecilenKartIndis).setVisible(true);
                        dnmf.add(dnmf.get(p1SecilenKartIndis));
                        dnm1f.add(dnm1f.get(p1SecilenKartIndis));
                          if(ctrl==7){
                            tmp1++;
                        }
                          ctrl--;
                        texts.setText("Draw!");
                    }
                    p1texts.setText(p1.gamerName + " : " + p1.showScore());
                    p2texts.setText(p2.gamerName + " : " + p2.showScore());
                }

                if (secim == 1) {
                    texts1.setText("Comparing Properity Quad Axel");
                    if (p1.cards.get(dnm1f.get(p1SecilenKartIndis)).prob2 > p2.cards.get(p2SecilenKartIndis).prob2) {

                        texts.setText(p1.gamerName + " gets 10 points.");
                        p1.addPoint();
                    } else if (p1.cards.get(dnm1f.get(p1SecilenKartIndis)).prob2 < p2.cards.get(p2SecilenKartIndis).prob2) {
                        texts.setText(p2.gamerName + " gets 10 points.");
                        p2.addPoint();
                    } else {
                        if(p2SecilenKartIndis==0){
                           p2card1.setVisible(true);}
                          if(p2SecilenKartIndis==1){
                           p2card2.setVisible(true);}       
                          if(p2SecilenKartIndis==2){
                           p2card3.setVisible(true);}       
                          if(p2SecilenKartIndis==3){
                           p2card4.setVisible(true);}       
                        dnmf.get(p1SecilenKartIndis).setVisible(true);
                        dnmf.add(dnmf.get(p1SecilenKartIndis));
                        dnm1f.add(dnm1f.get(p1SecilenKartIndis));
                        if(ctrl==7){
                        tmp2++;
                        }
                        ctrl--;
                        texts.setText("Draw!");
                        
                    }
                    p1texts.setText(p1.gamerName + " : " + p1.showScore());
                    p2texts.setText(p2.gamerName + " : " + p2.showScore());
                }
                if (secim == 2) {
                    texts1.setText("Comparing Properity Death Spiral");

                    if (p1.cards.get(dnm1f.get(p1SecilenKartIndis)).prob3 > p2.cards.get(p2SecilenKartIndis).prob3) {
                        texts.setText(p1.gamerName + " gets 10 points.");
                        p1.addPoint();
                    } else if (p1.cards.get(dnm1f.get(p1SecilenKartIndis)).prob3 < p2.cards.get(p2SecilenKartIndis).prob3) {
                        texts.setText(p2.gamerName + " gets 10 points.");
                        p2.addPoint();
                    } else {
                        if(p2SecilenKartIndis==0){
                           p2card1.setVisible(true);}
                          if(p2SecilenKartIndis==1){
                           p2card2.setVisible(true);}       
                          if(p2SecilenKartIndis==2){
                           p2card3.setVisible(true);}       
                          if(p2SecilenKartIndis==3){
                           p2card4.setVisible(true);}       
                        dnmf.get(p1SecilenKartIndis).setVisible(true);
                        dnmf.add(dnmf.get(p1SecilenKartIndis));
                        dnm1f.add(dnm1f.get(p1SecilenKartIndis));
                        if(ctrl==7){
                        tmp3++;
                        }
                        ctrl--;
                        texts.setText("Draw!");
                    }
                    p1texts.setText(p1.gamerName + " : " + p1.showScore());
                    p2texts.setText(p2.gamerName + " : " + p2.showScore());
                }
                try {
                    sleep(2000);
                } catch (java.lang.InterruptedException e) {
                    System.out.println("Hata");
                }
                
                     if(tmp1!=0 && tmp2!=0 && tmp3!=0){
                          if(p2SecilenKartIndis==0){
                           p2card1.setVisible(false);}
                          if(p2SecilenKartIndis==1){
                           p2card2.setVisible(false);}       
                          if(p2SecilenKartIndis==2){
                           p2card3.setVisible(false);}       
                          if(p2SecilenKartIndis==3){
                           p2card4.setVisible(false);}       
                        dnmf.get(p1SecilenKartIndis).setVisible(false);
                   break;
                }
                
                dnmf.remove(p1SecilenKartIndis);
                dnm1f.remove(p1SecilenKartIndis);

            } 
            else if (p2SecilenKartIndis >= 4) {
                dnmv.get(p1SecilenKartIndis).setVisible(false);
                ocard2.setIcon(p1.cards.get(dnm1v.get(p1SecilenKartIndis)).getPic());
                ocard2.setVisible(true);
                

                if (secim == 0) {
                    texts1.setText("Comparing Properity Dunk");
                    if (p1.cards.get(dnm1v.get(p1SecilenKartIndis)).prob1 > p2.cards.get(p2SecilenKartIndis).prob1) {
                        texts.setText(p1.gamerName + " gets 10 points.");
                        p1.addPoint();
                    } else if (p1.cards.get(dnm1v.get(p1SecilenKartIndis)).prob1 < p2.cards.get(p2SecilenKartIndis).prob1) {
                        texts.setText(p2.gamerName + " gets 10 points.");
                        p2.addPoint();
                    } else {
                        if(p2SecilenKartIndis==4){
                           p2card5.setVisible(true);}
                          if(p2SecilenKartIndis==5){
                           p2card6.setVisible(true);}       
                          if(p2SecilenKartIndis==6){
                           p2card7.setVisible(true);}       
                          if(p2SecilenKartIndis==7){
                           p2card8.setVisible(true);}       
                        dnmv.get(p1SecilenKartIndis).setVisible(true);
                        dnmv.add(dnmv.get(p1SecilenKartIndis));
                        dnm1v.add(dnm1v.get(p1SecilenKartIndis));
                         if(ctrl==7){
                        tmp1++;
                            } 
                         ctrl--;
                         texts.setText("Draw!");
                    }
                    p1texts.setText(p1.gamerName + " : " + p1.showScore());
                    p2texts.setText(p2.gamerName + " : " + p2.showScore());
                }

                if (secim == 1) {
                    texts1.setText("Comparing Properity Serve");
                    if (p1.cards.get(dnm1v.get(p1SecilenKartIndis)).prob2 > p2.cards.get(p2SecilenKartIndis).prob2) {

                        texts.setText(p1.gamerName + " gets 10 points.");
                        p1.addPoint();
                    } else if (p1.cards.get(dnm1v.get(p1SecilenKartIndis)).prob2 < p2.cards.get(p2SecilenKartIndis).prob2) {
                        texts.setText(p2.gamerName + " gets 10 points.");
                        p2.addPoint();
                    } else {
                        if(p2SecilenKartIndis==4){
                           p2card5.setVisible(true);}
                          if(p2SecilenKartIndis==5){
                           p2card6.setVisible(true);}       
                          if(p2SecilenKartIndis==6){
                           p2card7.setVisible(true);}       
                          if(p2SecilenKartIndis==7){
                           p2card8.setVisible(true);}       
                        dnmv.get(p1SecilenKartIndis).setVisible(true);
                        dnmv.add(dnmv.get(p1SecilenKartIndis));
                        dnm1v.add(dnm1v.get(p1SecilenKartIndis));
                        if(ctrl==7){
                        tmp2++;
                        } 
                        ctrl--;
                        
                        texts.setText("Draw!");
                    }
                    p1texts.setText(p1.gamerName + " : " + p1.showScore());
                    p2texts.setText(p2.gamerName + " : " + p2.showScore());
                }
                if (secim == 2) {
                    texts1.setText("Comparing Properity Lead Pass");

                    if (p1.cards.get(dnm1v.get(p1SecilenKartIndis)).prob3 > p2.cards.get(p2SecilenKartIndis).prob3) {
                        texts.setText(p1.gamerName + " gets 10 points.");
                        p1.addPoint();
                    } else if (p1.cards.get(dnm1v.get(p1SecilenKartIndis)).prob3 < p2.cards.get(p2SecilenKartIndis).prob3) {
                        texts.setText(p2.gamerName + " gets 10 points.");
                        p2.addPoint();
                    } else {
                        if(p2SecilenKartIndis==4){
                           p2card5.setVisible(true);}
                          if(p2SecilenKartIndis==5){
                           p2card6.setVisible(true);}       
                          if(p2SecilenKartIndis==6){
                           p2card7.setVisible(true);}       
                          if(p2SecilenKartIndis==7){
                           p2card8.setVisible(true);}       
                        dnmv.get(p1SecilenKartIndis).setVisible(true);
                        dnmv.add(dnmv.get(p1SecilenKartIndis));
                        dnm1v.add(dnm1v.get(p1SecilenKartIndis));
                        if(ctrl==7){
                        tmp3++;
                        } 
                        ctrl--;
                        texts.setText("Draw!");
                    }
                    p1texts.setText(p1.gamerName + " : " + p1.showScore());
                    p2texts.setText(p2.gamerName + " : " + p2.showScore());
                }
                try {
                    sleep(1500);
                } catch (java.lang.InterruptedException e) {
                    System.out.println("Hata");
                }
                   
                     if(tmp1!=0 && tmp2!=0 && tmp3!=0){
                          if(p2SecilenKartIndis==4){
                           p2card5.setVisible(false);}
                          if(p2SecilenKartIndis==5){
                           p2card6.setVisible(false);}       
                          if(p2SecilenKartIndis==6){
                           p2card7.setVisible(false);}       
                          if(p2SecilenKartIndis==7){
                           p2card8.setVisible(false);}       
                        dnmv.get(p1SecilenKartIndis).setVisible(false);
                   break;
                }
           
               
                dnmv.remove(p1SecilenKartIndis);
                dnm1v.remove(p1SecilenKartIndis);
 

               }
            ctrl++;

            
        }
        
       texts.setVisible(false);
       texts1.setVisible(false);
        //Sonucu yazdir
        if (p1.showScore()> p2.showScore()) {
            ocard1.setVisible(false);
            ocard2.setVisible(false);
            endofgame.setText(p1.gamerName + " wins!");
        } else if (p1.showScore()< p2.showScore()) {
            ocard1.setVisible(false);
            ocard2.setVisible(false);
            endofgame.setText(p2.gamerName + " wins!");
        } else {
            ocard1.setVisible(false);
            ocard2.setVisible(false);
            endofgame.setText("Draw!");
        }
    }

    public void addPicsToCards() {
      
       p2card1.setIcon(p2.cards.get(0).getPic());
       p2card2.setIcon(p2.cards.get(1).getPic());
       p2card3.setIcon(p2.cards.get(2).getPic());
       p2card4.setIcon(p2.cards.get(3).getPic());
       p2card5.setIcon(p2.cards.get(4).getPic());
       p2card6.setIcon(p2.cards.get(5).getPic());
       p2card7.setIcon(p2.cards.get(6).getPic());
       p2card8.setIcon(p2.cards.get(7).getPic());
            
      
        
         
    }
     public void defineCards() {
      
         figureSkater card1= new figureSkater("Yuzuru Hanyu","Japan",75,100,60);
        card1.setQuadAxel(100);
        card1.setDeathSpiral(60);
        card1.setSpin(75);
        card1.pic=new ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\Ssun\\fskater\\f1.png");
        
         figureSkater card2= new figureSkater("Kim Yuna","Korea",90,60,85);
         card2.setSpin(90);
         card2.setQuadAxel(60);
         card2.setDeathSpiral(85);
         card2.pic=new ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\Ssun\\fskater\\f2.png");
     

         figureSkater card3= new figureSkater("Mae-Berenice Meite","France",90,75,80);
        card3.setSpin(90); 
        card3.setQuadAxel(75);
        card3.setDeathSpiral(80);
        card3.pic=new ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\Ssun\\fskater\\f3.png");

         figureSkater card4= new figureSkater("Aljona Savchenko","Ukraine",72,64,100); 
        card4.setSpin(72);
        card4.setQuadAxel(64);
        card4.setDeathSpiral(100);
        card4.pic=new ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\Ssun\\fskater\\f4.png");
         
         figureSkater card5= new figureSkater("Cha Jun-Hwan","Korea",94,53,46);
        card5.setSpin(94);
        card5.setQuadAxel(53);
        card5.setDeathSpiral(46);
        card5.pic=new ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\Ssun\\fskater\\f5.png");
    

         figureSkater card6= new figureSkater("Adam Rippon","America",90,75,80);
        card6.setSpin(90);
        card6.setQuadAxel(75);
        card6.setDeathSpiral(80);
        card6.pic=new ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\Ssun\\fskater\\f6.png");
        
        
         figureSkater card7= new figureSkater("Kaetlyn Osmond","Canada",92,74,86); 
        card7.setSpin(92);
        card7.setQuadAxel(74);
        card7.setDeathSpiral(86);
        card7.pic=new ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\Ssun\\fskater\\f7.png");

         figureSkater card8= new figureSkater("Evgenia Medvedeva","Russia",92,86,94);
        card8.setSpin(92);
        card8.setQuadAxel(86);
        card8.setDeathSpiral(94);
        card8.pic=new ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\Ssun\\fskater\\f8.png");
        
        
         volleyPlayer card9= new volleyPlayer("Naz Aydemir","Turkey",58,78,100);
        card9.setDunk(58);
        card9.setServe(78);
        card9.setLeadPass(100);
        card9.pic=new ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\Ssun\\vplayer\\v1.png");
        
         volleyPlayer card10= new volleyPlayer("Saori Kimura","Japan",100,82,74);
        card10.setDunk(100);
        card10.setServe(82);
        card10.setLeadPass(74);
        card10.pic=new ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\Ssun\\vplayer\\v2.png");
        
         volleyPlayer card11= new volleyPlayer("Kim Yeon-Koung","Korea",100,84,54);
        card11.setDunk(100);
        card11.setServe(84);
        card11.setLeadPass(54);
        card11.pic=new ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\Ssun\\vplayer\\v3.png");
        
         volleyPlayer card12= new volleyPlayer("Bruno Rezende","Brazil",75,94,87);
        card12.setDunk(75);
        card12.setServe(94);
        card12.setLeadPass(87);
        card12.pic=new ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\Ssun\\vplayer\\v4.png");
        
         volleyPlayer card13= new volleyPlayer("Yuki Ishikawa","Japan",76,94,63);
        card13.setDunk(76);
        card13.setServe(94);
        card13.setLeadPass(63);
        card13.pic=new ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\Ssun\\vplayer\\v5.png");
        
         volleyPlayer card14= new volleyPlayer("Facundo Conte","Argentina",62,84,94);
        card14.setDunk(62);
        card14.setServe(84);
        card14.setLeadPass(94);
        card14.pic=new ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\Ssun\\vplayer\\v6.png");

         volleyPlayer card15= new volleyPlayer("Wilfredo Leon","Italy",75,94,87);
        card15.setDunk(75);
        card15.setServe(94);
        card15.setLeadPass(87);
        card15.pic=new ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\Ssun\\vplayer\\v7.png");
        
         volleyPlayer card16= new volleyPlayer("Francesca Piccinini","Italy",92,83,65);
        card16.setDunk(92);
        card16.setServe(83);
        card16.setLeadPass(65);
        card16.pic=new ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\Ssun\\vplayer\\v8.png");
         
      cards.add(card1);
      cards.add(card2);
      cards.add(card3);
      cards.add(card4);
      cards.add(card5);
      cards.add(card6);
      cards.add(card7);
      cards.add(card8);
      cards.add(card9);
      cards.add(card10);
      cards.add(card11);
      cards.add(card12);
      cards.add(card13);
      cards.add(card14);
      cards.add(card15);
      cards.add(card16);  
    }
    
    
      public void dealCards() {
        
          Random rand = new Random();
         Athlete card;
         
      int randomNum,min=0,max=7;
      int randomNum2,min2=4,max2=11;
      for(int i=0;i<4;i++){
          
          randomNum = rand.nextInt(max-min)+min;
          card=cards.get(randomNum);
          p2.cards.add(card);
          cards.remove(randomNum);
          max=max-1;
         
      }
      for(int i=0;i<4;i++){
          
           randomNum2 = rand.nextInt(max2-min2)+ min2;
           card=cards.get(randomNum2);
           p2.cards.add(card);
           cards.remove(randomNum2);
           max2=max2-1;
      
      
      }
      
      for(int i=0;i<8;i++){
          card=cards.get(i);
          p1.cards.add(card);
      }
      }
    
    public static void main(String[] args) throws java.io.IOException {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        JLabel arkaPlan = new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\Ssun\\fskater\\background.png"))));
        frame.setContentPane(arkaPlan);
        Test game = new Test(frame);
        game.createScreen();
    }

    
    
}