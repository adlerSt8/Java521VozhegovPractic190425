import java.util.ArrayList;
import java.util.List;

public class DynamicArray {
    List<Integer> stack = new ArrayList<>();

    public DynamicArray() {
    }

    public void addInStack(int number) {
        stack.add(number);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Стек пуст");
            return -1;
        } else {
            return stack.remove(stack.size() - 1);
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Стек пуст!");
            return -1;
        } else {
            return stack.get(stack.size() - 1);
        }
    }

    public int quantityStack() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void clearStack() {
        stack.clear();
    }

    public String toString() {
        return stack.toString();
    }
}
