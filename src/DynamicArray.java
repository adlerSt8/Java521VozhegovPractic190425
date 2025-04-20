import java.util.ArrayList;
import java.util.List;

public class DynamicArray {
    List<Integer> stack = new ArrayList<>();
    int indexLast = -1;

    public DynamicArray() {
    }

    public void addInStack(int number) {
        stack.add(number);
        indexLast++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Стек пуст");
            return -1;
        } else {
            int value = stack.remove(indexLast);
            indexLast--;
            return value;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Стек пуст!");
            return -1;
        } else {
            return stack.get(indexLast);
        }
    }

    public int quantityStack() {
        return indexLast + 1;
    }

    public boolean isEmpty() {
        return indexLast == -1;
    }

    public boolean isFull() {
        return indexLast == stack.size();
    }

    public void clearStack() {
        stack.clear();
        indexLast = -1;
    }

    public String toString() {
        return stack.toString();
    }


}
