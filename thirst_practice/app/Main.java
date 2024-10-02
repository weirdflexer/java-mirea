package thirst_practice.app;

import thirst_practice.vehicles.*;

public class Main {
  public static void main(String[] args) {
    Car car = new Car();
    ElectricCar ecar = new ElectricCar(10000);

    System.out.println(car.getEngineType());
    System.out.println(ecar.getEngineType());

    car.setOwnerName("Sasha");
    System.out.println(car.getOwnerName());
  }
}