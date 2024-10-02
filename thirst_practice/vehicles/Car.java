package thirst_practice.vehicles;

public class Car {
  private String ownerName;
  private int insuranceNumber;
  protected String engineType = "FUEL";

  public void setOwnerName(String name){
    this.ownerName = name;
  }

  public void setInsuranceNumber(int number){
    this.insuranceNumber = number;
  }

  public String getOwnerName(){
    return this.ownerName;
  }

  public int getInsuranceNumber(){
    return this.insuranceNumber;
  }

  public String getEngineType() {
    return this.engineType;
  }
}
