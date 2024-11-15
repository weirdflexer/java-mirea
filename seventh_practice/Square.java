public class Square extends GeometricObject implements Colorable {
  private double side;

  public Square(double side) {
    this.side = side;
  }

  public Square() {
    this.side = 1;
  }

  public double getSide() {
    return this.side;
  }

  public void setSide(double side) {
    this.side = side;
  }

  @Override
  public double getArea() {
    return this.side*this.side;
  }

  @Override
  public double getPerimeter() {
    return this.side * 4;
  }

  @Override
  public void howToColor() {
    System.out.println("Раскрасьте все четыре стороны.");
  }

  @Override
  public String toString() {
    return "Квадрат со стороной: " + this.side
            + " +\nСоздан: " + getDateCreated() + "\n";
  }
}
