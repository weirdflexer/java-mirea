import java.util.LinkedList;
import java.util.Queue;

public class StackOnQueue {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public StackOnQueue() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();

    }

    // Добавляет элемент на вершину стека
    public void push(int x) {
        queue2.add(x); // Вначале добавляем элемент в пустую очередь queue2
        // Перемещаем все элементы из queue1 в queue2
        while (!queue1.isEmpty()) {
            queue2.add(queue1.poll());
        }
        // Меняем местами queue1 и queue2, чтобы queue1 всегда была основной очередью для pop и top
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    // Удаляет элемент на вершине стека и возвращает его
    public int pop() {
        if (queue1.isEmpty()) throw new RuntimeException("Стек пуст");
        return queue1.poll();
    }

    // Возвращает элемент на вершине стека, не удаляя его
    public int top() {
        if (queue1.isEmpty()) throw new RuntimeException("Стек пуст");
        return queue1.peek();
    }

    // Проверяет, пуст ли стек
    public boolean empty() {
        return queue1.isEmpty();
    }

    // Возвращает строковое представление всех элементов стека
    @Override
    public String toString() {
        return queue1.toString();
    }
}
