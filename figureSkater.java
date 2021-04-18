package Ssun;

public class figureSkater extends Athlete {
        public String fSTeam;
        public String fSName;
        private int deathSpiral,quadAxel,spin;
      

  public figureSkater(String fsName,String fsTeam,int spin ,int quadAxel,int deathSpiral){

      super(fsName,fsTeam,spin,quadAxel,deathSpiral);
      
  }
  
  public int getSpin() {
        return spin;
    }

    public void setSpin(int spin) {
        this.spin = spin;
    }
 
    public int getDeathSpiral() {
        return deathSpiral;
    }

    public void setDeathSpiral(int deathSpiral) {
        this.deathSpiral = deathSpiral;
    }

    public int getQuadAxel() {
        return quadAxel;
    }

    public void setQuadAxel(int quadAxel) {
        this.quadAxel = quadAxel;
    }

    @Override
    public void showAthleteScore() {
        
        System.out.println("Death Spiral :" + this.deathSpiral + "Quad Axel :" + this.quadAxel + "Scracth Spin :" + this.spin);
      
    }
    
 private boolean isCardUsed=false;

    public boolean getIsCardUsed() {
        return isCardUsed;
    }

    public void setIsCardUsed(boolean isCardUsed) {
        this.isCardUsed = isCardUsed;
    }
    
}
