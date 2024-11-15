import java.util.ArrayList;

public class Test {

  public static <T> ArrayList<T> deleteDuplicates(ArrayList<T> array) {
    ArrayList<T> result = new ArrayList<>();

    for (int i = 0; i < array.size(); i++) {
      T element = array.get(i);

      if(!result.contains(element)) {
        result.add(element);
      }
    }

    return result;
  }

  public static <T> int find(ArrayList<T> array, T target) {

    for (int i = 0; i < array.size(); i++) {
      if(array.get(i) == target) {
        return i;
      }
    }

    return -1;
  }

  public static <T extends Comparable<T>> T max(T[] array) {
    T result = array[0];

    for (int i = 0; i < array.length - 1; i++) {
      if(array[i].compareTo(result) == 1) {
        result = array[i];
      }
    }

    return result;
  }

  public static <T extends Comparable<T>> T maxDouble(T[][] array) {
    T result = array[0][0];

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++){
        if(array[i][j].compareTo(result) == 1) {
          result = array[i][j];
        }
      }
    }

    return result;
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    list.add(1);
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(3);
    list.add(4);

    System.out.println(list);
    System.out.println(deleteDuplicates(list));

    System.out.println(find(list, 4));

    Circle listCircle [] = new Circle[5];

    listCircle[0] = new Circle(2);
    listCircle[1] = new Circle(3);
    listCircle[2] = new Circle(5);
    listCircle[3] = new Circle(10);
    listCircle[4] = new Circle(6);

    System.out.println(max(listCircle).radius);

    Integer listInt [][] = {{1, 10, 3}, {20, 40, 3}};

    System.out.println(maxDouble(listInt));

    GenericStack<String> stack = new GenericStack<>();

    stack.push("1");
    stack.push("2");
    stack.push("3");
    stack.push("4");
    stack.push("5");
    stack.push("1");
    stack.push("2");
    stack.push("3");
    stack.push("4");
    stack.push("5");
    stack.push("1");
    stack.push("2");
    stack.push("3");
    stack.push("4");
    stack.push("5");

    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
  }
}
