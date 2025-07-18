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
            System.out.println("Нет такого арифметического действия!");
            System.out.printf("Введите арифметическое действие? ");
            operation = scanner.nextLine();
        }
        int result = -999999999;
        if (operation.equals("^")) {
            result = pow(firstNumber, secondNumber);
        }
        if (operation.equals("+")) {
            result = firstNumber + secondNumber;
        }
        if (operation.equals("-")) {
            result = firstNumber - secondNumber;
        }
        if (operation.equals("*")) {
            result = firstNumber * secondNumber;
        }
        if (operation.equals("/")) {
            result = firstNumber / secondNumber;
        }
        if (operation.equals("%")) {
            result = firstNumber % secondNumber;
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