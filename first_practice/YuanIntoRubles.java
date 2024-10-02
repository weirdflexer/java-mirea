import java.util.Scanner;

class YuanIntoRubles {
  public static void main(String[] args) {
    final double ROUBLES_PER_YUAN = 11.91;
    int yuan;
    double rubles;

    Scanner sc = new Scanner(System.in);
    System.out.println("Введите кол-во юаней:");

    yuan = sc.nextInt();
    sc.close();
    rubles = yuan * ROUBLES_PER_YUAN;

    System.out.println("в Рублях: " + Math.ceil(rubles));
  }
}