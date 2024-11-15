import java.util.ArrayList;

public class MyStack extends ArrayList<Object> {

    public boolean isEmpty() {
        return size() == 0;
    }

    public int getSize() {
        return size();
    }

    public Object peek() {
        return get(getSize() - 1);
    }

    public Object pop() {
        return remove(getSize() - 1);
    }

    public void push(Object o) {
        add(o);
    }
}
