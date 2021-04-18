package Ssun;
import javax.swing.ImageIcon;
public abstract class Athlete{
   private String athleteName;
   private String athleteTeam;
    public int prob1;
    public int prob2;
    public int prob3;
    public ImageIcon pic;

    
    public Athlete(String athleteName, String athleteTeam,int prob1,int prob2,int prob3)
    {
        this.athleteName=athleteName;
        this.athleteTeam=athleteTeam;
        this.prob1=prob1;
        this.prob2=prob2;
        this.prob3=prob3;
    }
     public Athlete(){
     
     
     
     }

    public String getAthleteName() {
        return athleteName;
    }

    public void setAthleteName(String athleteName) {
        this.athleteName = athleteName;
    }

    public String getAthleteTeam() {
        return athleteTeam;
    }

    public void setAthleteTeam(String athleteTeam) {
        this.athleteTeam = athleteTeam;
    }

    public ImageIcon getPic() {
        return pic;
    }
    

    public void showAthleteScore(){
        
        
    }
    

  
}
