package fourth_practice.app;

import fourth_practice.vehicles.*;

public class TestClass {
  public static void main(String[] args) {
    Vehicle myCar = new Car("Golf", "123YYY", "white", 2012, 1234, "Sasha");
    Vehicle myECar = new ElectricCar("Tesla Model X", "123YYY", "black", 2020, 1234, "Sasha", 100);

    myCar.setModel("Audi A5");
    myECar.setModel("Zeekr 001");

    System.out.println(myCar.toString());
    System.out.println("---------------------");
    System.out.println(myECar.toString());
  }
}