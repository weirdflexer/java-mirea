public class Triangle extends GeometricObject {
  private double side1;
  private double side2;
  private double side3;
  private String color;
  private boolean filled;

  public Triangle() {
    this.side1 = 1.0;
    this.side2 = 1.0;
    this.side3 = 1.0;
    this.color = "Red";
    this.filled = true;
  }

  public Triangle(double side1, double side2, double side3) throws IllegalTriangleException, Error {
    try {
      if ((side1 + side2 < side3) | (side2 + side3 < side1) | (side1 + side3 < side2)) {
        throw new IllegalTriangleException("Incorrect sides");
      }

      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
    } catch (IllegalTriangleException e) {
      System.out.println(e.getMessage());
    }
  }

  public Triangle(double side1, double side2, double side3, String color) throws IllegalTriangleException, Error {
    try {
      if ((side1 + side2 > side3) | (side2 + side3 > side1) | (side1 + side3 > side2)) {
        throw new IllegalTriangleException("Incorrect sides");
      }

      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
      this.color = color;
      this.filled = true;
    } catch (IllegalTriangleException e) {
      System.out.println(e.getMessage());
    }
  }

  public double getSide1() {
    return this.side1;
  }

  public void setSide1(double side1) {
    this.side1 = side1;
  }

  public double getSide2() {
    return this.side2;
  }

  public void setSide2(double side2) {
    this.side2 = side2;
  }

  public double getSide3() {
    return this.side3;
  }

  public void setSide3(double side3) {
    this.side3 = side3;
  }

  public double getPerimeter() {
    return this.side1 + this.side2 + this.side3;
  }

  public double getArea() {
    double halfPerimeter = getPerimeter()/2;
    return Math.sqrt(halfPerimeter *
                    (halfPerimeter-this.side1) *
                    (halfPerimeter-this.side2) *
                    (halfPerimeter-this.side3));
  }

  @Override
  public void howToColor() {};

  @Override
  public String toString() {
    return "Треугольник: сторона1 = " +
            this.side1 + " сторона2 = " +
            this.side2 + " сторона3 = " +
            this.side3;
  }
}
