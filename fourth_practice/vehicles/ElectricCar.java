package fourth_practice.vehicles;

public class ElectricCar extends Vehicle {
  private int batteryCapacity;

  public ElectricCar(String model, int batteryCapacity) {
    super(model);
    this.batteryCapacity = batteryCapacity;
    this.engineType = "Electric";
  }

  public void setBatteryCapacity(int batteryCapacity) {
    this.batteryCapacity = batteryCapacity;
  }

  public int getBatteryCapacity() {
    return this.batteryCapacity;
  }

  @Override
  public String vehicleType() {
    return "Elictric car";
  }

  @Override
  public String toString() {
    return model + "\n" + engineType + "\n" + batteryCapacity;
  }
}
