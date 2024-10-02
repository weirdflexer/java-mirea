public class Car {
  private String model;
  private String license;
  private String color;
  private int year;

  public Car(String model, String license, String color, int year) {
    this.model = model;
    this.license = license;
    this.color = color;
    this.year = year;
  }

  public Car() {
    this.model = "golf";
    this.license = "E777КХ77";
    this.color = "white";
    this.year = 2014;
  }

  public Car(String model) {
    this.model = model;
    this.license = "E777КХ77";
    this.color = "white";
    this.year = 2014;
  }

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

  public String toString() {
    return this.model + " " + this.license + " " + this.color + " " + this.year;
  }

  public int getCurrentAge() {
    return 2024 - this.year;
  }
}