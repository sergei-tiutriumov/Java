import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите первое число ");
        while (!scanner.hasNextInt()) {
            System.out.println("Это не число!!!");
            scanner.nextLine();
            System.out.printf("Введите первое число ");
        }

        int firstNumber = scanner.nextInt();
        System.out.printf("%nВведите второе число ");
        while (!scanner.hasNextInt()) {
            System.out.println("Это не число!!!");
            scanner.nextLine();
            System.out.printf("Введите второе число ");
        }

        int secondNumber = scanner.nextInt(); 
        scanner.nextLine();
        System.out.printf("%nВведите арифметическое действие ");
        String operation = scanner.nextLine();
        while (!(operation.equals("+") ||
            operation.equals("-") ||
            operation.equals("*") ||
            operation.equals("/") ||
            operation.equals("^") ||
            operation.equals("%"))) {
            System.out.println("Ошибка: неизвестная арифметическая операция");
            System.out.printf("Введите арифметическую операцию ");
            operation = scanner.nextLine();
        }

        int result = 0;
        if (operation.equals("^")) {
            result = pow(firstNumber, secondNumber);
        } else if (operation.equals("-")) {
            result = firstNumber - secondNumber;
        } else if (operation.equals("*")) {
            result = firstNumber * secondNumber;
        } else if (operation.equals("/")) {
            result = firstNumber / secondNumber;
        } else if (operation.equals("%")) {
            result = firstNumber % secondNumber;
        } else {
            result = firstNumber + secondNumber;
        }
        System.out.printf("%n%d %s %d = %d %n", firstNumber, operation, secondNumber, result); 
    } 

    private static int pow(int number, int power) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= number;
        }
        return result;
    }
}