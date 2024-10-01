class Plane {
  void fly(){
System.out.printl("you are in plane class ");
  }
}
class CargoPlane extends Plane{
void fly(){
  System.out.println("you are in CargoPlane class ");
}
}
class FighterPlane extends Plane{
  void fly(){
    System.out.println("you are in Fighterplane class ");

  }
}



public class PolyEx {
  public static void main(String[] args) {
     CargoPlane CP =new CargoPlane();
     FighterPlane FP = new FighterPlane();
     Plane ref; // creating reference for parent class
     ref =CP;
     CP.fly();
     ref= FP;
     FP.fly();

  }
}
