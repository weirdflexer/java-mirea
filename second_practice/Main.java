public class Main {
  public static void main(String[] args) {
    Car car = new Car("Golf", "Т823ТК933", "Black", 1984);

    System.out.println(car.toString());

    car.setModel("s-class");
    System.out.println(car.getModel());
  }
}
