package Ssun;

import java.util.ArrayList;
import javax.swing.*;
import java.util.Random;


public  class Computer extends Gamer {
    private int cScore;
    private String computerName;
     
    public Computer(int cScore, String computerName) {
        super(cScore, computerName);
    }

    Computer() {
       
        
    }
    
    
   @Override
    public int pickCard(JButton card1, JButton card2, JButton card3, JButton card4, JButton card5, JButton card6, JButton card7, JButton card8, ArrayList dnmf, ArrayList dnmv, int p2SecilenKartIndis) {
        try {
            Thread.sleep(1250);
        } catch (java.lang.InterruptedException e) {
            System.out.println("Hata");
        }
        Random rand = new Random();
        int indis = 0;
        if (p2SecilenKartIndis < 4) {
            indis = rand.nextInt(dnmf.size());
            
        } else if (p2SecilenKartIndis >= 4) {       
           
           indis = rand.nextInt(dnmv.size());
      
        }

        return indis;
    }
    
    
}
