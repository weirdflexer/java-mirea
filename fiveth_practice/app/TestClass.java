package fiveth_practice.app;

import fiveth_practice.vehicles.*;

public class TestClass {
  public static void main(String[] args) {
    Car myCar = new Car("Golf", "123YYY", "white", 2012, 1234, "Sasha");
    ElectricCar myECar = new ElectricCar("Tesla Model X", "123YYY", "black", 2020, 1234, "Sasha", 100);

    myCar.setYear(2014);
    myCar.setOwnerName("Dima");
    myCar.setInsuranceNumber(1235);

    System.out.println("Емкость батареи: " + myECar.getBatteryCapacity());
    System.out.println("---------------------");
    System.out.println(myCar.toString());
    System.out.println("---------------------");
    System.out.println(myECar.toString());
  }
}