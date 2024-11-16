public class StackOnQueueTest {
    public static void main(String[] args) {
        StackOnQueue stack = new StackOnQueue();

        // Добавляем два элемента
        stack.push(1);
        stack.push(3);

        // Выводим объект, находящийся на вершине стека (без удаления)
        System.out.println("Текущий верхний элемент стека (top): " + stack.top());

        // Удаляем и выводим объект на вершине стека
        System.out.println("Удаленный верхний элемент стека (pop): " + stack.pop());

        // Проверяем стек на пустоту
        System.out.println("Стек пуст? " + stack.empty());

        // Выводим оставшиеся элементы стека
        System.out.println("Элементы стека: " + stack.toString());
    }
}
