public abstract class Vehicule {

  private String brand;
  private int km;

public Vehicule(String brand,int km){
  this.brand = brand;
  this.km = km;



}

public String getbrand(){
  return this.brand;
}

public int getkm(){
  return this.km;
}

public void setbrand(String brand){
  this.brand = brand;
}

public void setkm(int km){
  this.km = km;
}

 public abstract String doStuff();



}
