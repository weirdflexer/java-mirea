import java.util.Scanner;

public class MyStackTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyStack stack = new MyStack();

        // Ввод 5 строк
        System.out.println("Введите пять строк:");
        for (int i = 0; i < 5; i++) {
            stack.push(scanner.nextLine());
        }

        // Вывод строк в обратном порядке
        System.out.println("Строки в обратном порядке:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        scanner.close();
    }
}