class Boat extends Vehicule{

public Boat(String name,int km){
  super(name,km);
}


 @Override
    public String doStuff() {
        return "je suis " + getbrand() +" et je fais glou glou !";
    }


}
