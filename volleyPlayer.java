package Ssun;

  public class volleyPlayer extends Athlete {
  public String vPTeam;
  public String vPName;
  private int dunk,serve,leadPass;
  private boolean isCardUsed=false;

   public volleyPlayer(String vPName,String vPTeam,int dunk ,int serve,int leadPass){
    super(vPName,vPTeam,dunk,serve,leadPass);

   }


  public int getDunk() {
   return dunk;
  }

  public void setDunk(int dunk) {
   this.dunk = dunk;
  }

  public int getServe() {
   return serve;
  }

  public void setServe(int serve) {
   this.serve = serve;
  }

  public int getLeadPass() {
   return leadPass;
  }

  public void setLeadPass(int leadPass) {
   this.leadPass = leadPass;
  }


    public void setIsCardUsed(boolean isCardUsed) {
        this.isCardUsed = isCardUsed;
    }

       public boolean getIsCardUsed() {
        return isCardUsed;
    } 
       @Override
      public void showAthleteScore() {
        System.out.println("Dunk :" + this.dunk + "Serve :" + this.serve + "Lead Pass :" + this.leadPass);
      }
       
       
  }

