package fiveth_practice.vehicles;


public abstract class Vehicle {
  protected String model;
  protected String license;
  protected String color;
  protected int year;
  protected int insuranceNumber;
  protected String ownerName;
  protected String engineType;

  public Vehicle(String model, String license,
                 String color, int year,
                 int insuranceNumber, String ownerName) {
    this.model = model;
    this.license = license;
    this.color = color;
    this.year = year;
    this.insuranceNumber = insuranceNumber;
    this.ownerName = ownerName;
  }

  public abstract String vehicleType();
  public abstract String toString();

  public void setModel(String model) {
    this.model = model;
  }

  public String getModel() {
    return this.model;
  }

  public void setLicense(String license) {
    this.license = license;
  }

  public String getLicense() {
    return this.license;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getYear() {
    return this.year;
  }

  public void setInsuranceNumber(int insuranceNumber) {
    this.insuranceNumber = insuranceNumber;
  }

  public int getInsuranceNumber() {
    return this.insuranceNumber;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public String getOwnerName() {
    return this.ownerName;
  }
}