package thirst_practice.vehicles;

public class ElectricCar extends Car {
  public int batteryCapacity;

  public ElectricCar(int batteryCapacity) {
    this.engineType = "Electric";
    this.batteryCapacity = batteryCapacity;
  }

  public ElectricCar() {
    this.engineType = "Electric";
    this.batteryCapacity = 0;
  }
}
