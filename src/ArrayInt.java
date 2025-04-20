import java.util.Arrays;

public class ArrayInt {
    private final int[] stack;
    private int indexLast;

    public ArrayInt(int quantity) {
        this.stack = new int[quantity];
        indexLast = -1;
    }

    public void addInStack(int number) {
        if (isFull()) {
            System.out.println("Стек переполнен");
        } else {
            indexLast++;
            stack[indexLast] = number;
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Стек пуст");
        } else {
            int value = stack[indexLast];
            indexLast--;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Стек пуст, нечего смотреть");
            return -1;
        } else {
            return stack[indexLast];
        }
    }

    public int quantityStack() {
        return indexLast + 1;
    }

    public boolean isEmpty() {
        return indexLast == -1;
    }

    public boolean isFull() {
        return indexLast == stack.length - 1;
    }

    public void clearStack() {
        Arrays.fill(stack, 0);
        indexLast = -1;
    }

    public String toString() {
        return Arrays.toString(stack);
    }


}
