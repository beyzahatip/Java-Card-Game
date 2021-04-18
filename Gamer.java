package Ssun;

import javax.swing.*;
import java.util.List;
import java.util.ArrayList;

public abstract  class Gamer {

    public String gamerName;
    public int score;
    public List<Athlete>cards=new ArrayList<>();
    
    
    
    
    public Gamer(int score, String gamerName){
        this.score=score;
        this.gamerName=gamerName;
       
    
    } 
    
    public Gamer(){
      this.score = 0;
    }

    public void addPoint() {
        this.score += 10;
    }
   
    public int showScore(){
        
       return score;
    }
    
    public abstract int pickCard(JButton card1, JButton card2, JButton card3,JButton card4,JButton card5, JButton card6, JButton card7,JButton card8,ArrayList dnmf,ArrayList dnmv,int p2si);
}