import java.util.List;
import java.util.Scanner;

public class MainGeneric {
    public static void main(String[] args) {
        GenericArray<Integer> intArray = new GenericArray<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Меню ---");
            System.out.println("1. Поместить число в стек");
            System.out.println("2. Удалить число из стека");
            System.out.println("3. Показать верхнее значение");
            System.out.println("4. Проверить, пуст ли стек");
            System.out.println("5. Очистить стек");
            System.out.println("6. Показать стек");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Введите число: ");
                    int value = scanner.nextInt();
                    intArray.push(value);
                    break;
                case 2:
                    intArray.pop();
                    break;
                case 3:
                    int top = intArray.peek();
                    if (top != -1) {
                        System.out.println("Верхнее значение: " + top);
                    }
                    break;
                case 4:
                    System.out.println(intArray.isEmpty() ? "Стек пуст." : "Стек не пуст.");
                    break;
                case 5:
                    intArray.clear();
                    break;
                case 6:
                    System.out.println(intArray.toString());
                    break;
                case 0:
                    System.out.println("Выход из программы...");
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");

            }
        }
    }
}