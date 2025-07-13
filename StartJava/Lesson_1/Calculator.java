import java.util.Scanner;

public class Calculator {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите первое число ");
        int firstNumber = 0;
        int secondNumber = 0;
        String operation = "";
        if (scanner.hasNextInt()) {
            firstNumber = scanner.nextInt();
            scanner.nextLine();
        } else {
            while (!scanner.hasNextInt()) {
                System.out.println("Это не число!!!");
                scanner.nextLine();
                System.out.printf("Введите первое число ");
            }
            firstNumber = scanner.nextInt();
        }
        System.out.printf("%nВведите второе число ");
        if (scanner.hasNextInt()) {
            secondNumber = scanner.nextInt();
            scanner.nextLine();
        } else {
            while (!scanner.hasNextInt()) {
                System.out.println("Это не число!!!");
                scanner.nextLine();
                System.out.printf("Введите второе число ");
            }
            secondNumber = scanner.nextInt();
        } 
        System.out.printf("%nКакое арифметическое действие? ");
        operation = scanner.nextLine();
        if (operation.equals("+") ||
            operation.equals("-") ||
            operation.equals("*") ||
            operation.equals("/") ||
            operation.equals("^") ||
            operation.equals("%")) {
            System.out.printf("%n%d %d %s%n", firstNumber, secondNumber, operation); 
        } else {
            while (!(operation.equals("+") ||
                operation.equals("-") ||
                operation.equals("*") ||
                operation.equals("/") ||
                operation.equals("^") ||
                operation.equals("%"))) {
                System.out.println ("Нет такого арифметического действия!");
                System.out.printf("Какое арифметическое действие? ");
                operation = scanner.nextLine();
            }
            System.out.printf("%n%d %d %s%n", firstNumber, secondNumber, operation); 
        }
} 
        
}