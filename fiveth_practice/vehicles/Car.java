package fiveth_practice.vehicles;


public class Car extends Vehicle {
  public Car(String model, String license,
             String color, int year,
             int insuranceNumber, String ownerName) {
    super(model, license, color, year, insuranceNumber, ownerName);
    this.engineType = "Fuel";
  }

  @Override
  public String vehicleType() {
    return "Car";
  }

  @Override
  public String toString() {
    return this.model + "\n" + this.license + "\n"
           + this.color + "\n" + this.year + "\n"
           + this.insuranceNumber + "\n" + this.ownerName
           + "\n" + this.engineType;
  }
}