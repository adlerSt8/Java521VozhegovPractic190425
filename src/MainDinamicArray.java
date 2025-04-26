import java.util.Scanner;

public class MainDinamicArray {
    public static void main(String[] args) {
        DynamicArray stack = new DynamicArray();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Меню ---");
            System.out.println("1. Поместить число в стек");
            System.out.println("2. Удалить число из стека");
            System.out.println("3. Показать верхнее значение");
            System.out.println("4. Проверить, пуст ли стек");
            System.out.println("5. Очистить стек");
            System.out.println("6. Показать количество элементов");
            System.out.println("7. Показать стек");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Введите число: ");
                    int value = scanner.nextInt();
                    stack.addInStack(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    int top = stack.peek();
                    if (top != -1) {
                        System.out.println("Верхнее значение: " + top);
                    }
                    break;
                case 4:
                    System.out.println(stack.isEmpty() ? "Стек пуст." : "Стек не пуст.");
                    break;
                case 5:
                    stack.clearStack();
                    System.out.println("Стек очищен.");
                    break;
                case 6:
                    System.out.println("Количество элементов: " + stack.quantityStack());
                    break;
                case 7:
                    System.out.println(stack.toString());
                    break;
                case 0:
                    System.out.println("Выход из программы...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }
}
