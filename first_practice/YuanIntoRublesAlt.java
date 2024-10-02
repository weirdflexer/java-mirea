import java.util.Scanner;
import java.lang.Math;

class YuanIntoRublesAlt {
  public static void main(String[] args) {
    final double ROUBLES_PER_YUAN = 11.91;
    int yuan, digit;
    double rubles;
    String end = " китайских юаней ";

    Scanner sc = new Scanner(System.in);
    System.out.println("Введите кол-во юаней:");

    yuan = sc.nextInt();
    sc.close();

    digit = yuan % 10;
    if (digit == 1 && yuan != 11 && yuan != 12) {
      end = " китайский юань ";
    } else if (digit == 2 && yuan != 11 && yuan != 12) {
      end = " китайских юаня ";
    }

    rubles = yuan * ROUBLES_PER_YUAN;

    System.out.println(yuan + end + "в Рублях: " + Math.ceil(rubles));
  }
}