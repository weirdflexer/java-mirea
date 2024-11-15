public class TestCircleRectangle {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        System.out.println("Круг " + circle.toString());
        System.out.println("Радиус равен " + circle.getRadius());
        System.out.println("Площадь равна " + circle.getArea());
        System.out.println("Диаметр равен " + circle.getDiameter());

        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println("\nПрямоугольник " + rectangle.toString());
        System.out.println("Площадь равна " + rectangle.getArea());
        System.out.println("Периметр равен " + rectangle.getPerimeter());

        try {
          Triangle triangle = new Triangle(100, 4, 5);
        } catch (IllegalTriangleException e) {
          System.out.println(e.getMessage());
        }

        Rectangle rectangle1 = new Rectangle(2, 4);
        Rectangle rectangle2 = new Rectangle(3, 6);

        Circle circle1 = new Circle(2);
        Circle circle2 = new Circle(3);

        GeometricObject circleMax = GeometricObject.max(circle1, circle2);
        GeometricObject rectangleMax = GeometricObject.max(rectangle1, rectangle2);
        System.out.print("\n" + circleMax.toString() + "\n");
        System.out.print(rectangleMax.toString() + "\n");

        GeometricObject[] arrOfGeometry = new GeometricObject[5];
        arrOfGeometry[0] = circle1;
        arrOfGeometry[1] = circle2;
        arrOfGeometry[2] = rectangle1;
        arrOfGeometry[3] = rectangle2;
        arrOfGeometry[4] = new Square(3);

        for (int i = 0; i < 5; i++) {
          System.out.println("Площадь фигуры: " + arrOfGeometry[i].getArea());
          arrOfGeometry[i].howToColor();
        }
  }
}