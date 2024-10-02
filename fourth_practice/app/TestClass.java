package fourth_practice.app;

import fourth_practice.vehicles.*;

public class TestClass {
  public static void main(String[] args) {
    Vehicle myCar = new Car("Golf");
    Vehicle myECar = new ElectricCar("Tesla Model X", 100);

    myCar.setModel("Audi A5");
    myECar.setModel("Zeekr 001");

    System.out.println(myCar.toString());
    System.out.println(myECar.toString());
  }
}