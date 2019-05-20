class Classroom {

  public static void main(String[] args) {

    Wilder[] example = {
      new Wilder("arnaud",true),
      new Wilder("theo",true),
      new Wilder("Benoit",false),
      new Wilder("Seb the king",true)
    };


    for(Wilder titi: example){
        System.out.println(titi.whoAmI(titi.getboolean()));
         
    }
  }
}
