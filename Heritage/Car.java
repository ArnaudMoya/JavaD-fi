class Car extends Vehicule{

public Car(String name,int km){
  super(name,km);
}


 @Override
    public String doStuff() {
        return "je suis " + getbrand() +" et je fais vroum vroum !";
    }


}
