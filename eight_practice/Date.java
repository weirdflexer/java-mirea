import java.util.Scanner;

public class Date {
  public static void main(String[] args) {
    String[] months = {"январь", "февраль", "март", "апрель", "май",
                       "июнь", "июль", "август", "сентябрь",
                       "октябрь", "ноябрь", "декабрь"};
    int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    Scanner input = new Scanner(System.in);
    System.out.println("Введите номер месяца: ");
    int choice = input.nextInt() - 1;

    try {
      if (choice == 1) {
        System.out.println("Введите год: ");
        int choiceYear = input.nextInt();
        if (choiceYear % 4 == 0) {
          System.out.println("Месяц: " + months[choice] +
                         "\nДней в месяце: " + (dom[choice] + 1));
        } else {
          System.out.println("Месяц: " + months[choice] +
          "\nДней в месяце: " + dom[choice]);
        }
      } else {
        System.out.println("Месяц: " + months[choice] +
                         "\nДней в месяце: " + dom[choice]);
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}