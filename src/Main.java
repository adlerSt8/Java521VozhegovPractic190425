import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayInt numbers = new ArrayInt(10);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Меню ---");
            System.out.println("1. Поместить число в стек");
            System.out.println("2. Удалить число из стека");
            System.out.println("3. Показать верхнее значение");
            System.out.println("4. Проверить, пуст ли стек");
            System.out.println("5. Проверить, полон ли стек");
            System.out.println("6. Очистить стек");
            System.out.println("7. Показать количество элементов");
            System.out.println("8. Показать стек");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Введите число: ");
                    int value = scanner.nextInt();
                    numbers.addInStack(value);
                    break;
                case 2:
                    numbers.pop();
                    break;
                case 3:
                    int top = numbers.peek();
                    if (top != -1) {
                        System.out.println("Верхнее значение: " + top);
                    }
                    break;
                case 4:
                    System.out.println(numbers.isEmpty() ? "Стек пуст." : "Стек не пуст.");
                    break;
                case 5:
                    System.out.println(numbers.isFull() ? "Стек полон." : "Стек не полон.");
                    break;
                case 6:
                    numbers.clearStack();
                    break;
                case 7:
                    System.out.println("Количество элементов: " + numbers.quantityStack());
                    break;
                case 8:
                    System.out.println(numbers.toString());
                    break;
                case 0:
                    System.out.println("Выход из программы...");
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }
}