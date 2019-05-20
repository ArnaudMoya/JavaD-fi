public class Wilder {
  
  private String firstname;
  private boolean aware;

  public Wilder(String firstname, boolean boli){
    this.firstname =firstname;
    this.aware = boli;
  }

  public String whoAmI(boolean test){
    if(test == true){
          return "Je m'appelle " + getname() + " et je suis aware";
    }else{
          return "Je m'appelle " + getname() + " et je ne suis pas aware";

    }
  }

  public String getname(){
    return this.firstname;
  }

  public boolean getboolean(){
    return this.aware;
  }

  public void setname(String name){
    this.firstname = name;
  }

  public void setboolean(boolean boli){
    this.aware = boli;
  }

}
