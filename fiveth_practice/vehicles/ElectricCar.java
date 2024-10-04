package fiveth_practice.vehicles;

public class ElectricCar extends Vehicle implements ElectricVehicle {
  private int batteryCapacity;

  public ElectricCar(String model, String license,
             String color, int year,
             int insuranceNumber, String ownerName, int batteryCapacity) {
    super(model, license, color, year, insuranceNumber, ownerName);
    this.engineType = "Electric";
    this.batteryCapacity = batteryCapacity;
  }

  @Override
  public void setBatteryCapacity(int batteryCapacity) {
    this.batteryCapacity = batteryCapacity;
  }

  @Override
  public int getBatteryCapacity() {
    return this.batteryCapacity;
  }

  @Override
  public String vehicleType() {
    return "Elictric car";
  }

  @Override
  public String toString() {
    return this.model + "\n" + this.license + "\n"
           + this.color + "\n" + this.year + "\n"
           + this.insuranceNumber + "\n" + this.ownerName
           + "\n" + this.engineType + "\n" + this.batteryCapacity;
  }
}
