import java.util.ArrayList;
import java.util.List;

public class GenericArray <T> {
    private List<T> stack = new ArrayList<>();

    public void push(T element) {
        stack.add(element);
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Стек пуст");
            return null;
        }
        return stack.remove(stack.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Стек пуст!");
            return null;
        }
        return stack.get(stack.size() - 1);
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void clear() {
        stack.clear();
        System.out.println("Стек очищен.");
    }

    @Override
    public String toString() {
        return stack.toString();
    }
}
