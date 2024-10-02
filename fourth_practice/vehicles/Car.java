package fourth_practice.vehicles;


public class Car extends Vehicle {
  public Car(String model) {
    super(model);
    this.engineType = "Fuel";
  }

  @Override
  public String vehicleType() {
    return "Car";
  }

  @Override
  public String toString() {
    return model + "\n" + engineType;
  }
}