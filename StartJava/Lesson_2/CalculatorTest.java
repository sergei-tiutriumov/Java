import java.util.Scanner;

public class CalculatorTest {
    public static class Calculator {
        public static float calcutate(CalculatorTest task) {
            float result = 0;
            switch(task.operation) {
                case "+":
                    result = task.firstNumber + task.secondNumber;
                    break;
                case "-":
                    result = task.firstNumber - task.secondNumber;
                    break;
                case "*":
                    result = task.firstNumber * task.secondNumber;
                    break;
                case "/":
                    result = task.firstNumber / task.secondNumber;
                    break;
                case "^":
                    result = (float) Math.pow(task.firstNumber, task.secondNumber);
                    break;
                case "%":
                    result = task.firstNumber % task.secondNumber;
                    break;
                default:
                    result = -99999999999999.9999f;
            }
            return result;
        }
    }

     int firstNumber;
     int secondNumber;
     String operation;
        public CalculatorTest() {
            this.firstNumber = 0;
            this.operation = null;
            this.secondNumber = 0;
        }
        public  CalculatorTest(int firstNumber, String operation, int secondNumber) {
            this.firstNumber = firstNumber;
            this.operation = operation;
            this.secondNumber = secondNumber;
        }
        public CalculatorTest getTask() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Это не число!!!");
                scanner.nextLine();
                System.out.printf("Введите первое число ");
            }
            firstNumber = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Введите знак операции (+, -, *, /, ^, %): ");
            operation = scanner.nextLine();
            String allowedOperations = "+ - * / ^ %";
            while(!allowedOperations.contains(operation) || operation == "" || operation == " ") {
                System.out.printf("Ошибка: операция %s не поддерживается \n", operation); 
                System.out.println("Попробуйте еще раз ");
                operation = scanner.nextLine();
            }
            System.out.println("Введите второе число: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Это не число!!!");
                scanner.nextLine();
                System.out.printf("Введите второе число ");
            }
            secondNumber = scanner.nextInt();
            return new CalculatorTest(firstNumber, operation, secondNumber);
        }     
        public static boolean isContinue() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            String answer = scanner.nextLine().toLowerCase().trim();
            return answer.equals("yes") ? true : false;
        }
    public static void main(String[] args) {
        CalculatorTest calc = new CalculatorTest();
        boolean continueCalculation = true;
        while(continueCalculation) {
            calc.getTask();
            if (calc.operation.equals("/") && calc.secondNumber == 0) {
                System.out.println("Ошибка: деление на ноль запрещено!");
                break;
            }
            float answer = Calculator.calcutate(calc);
            System.out.printf("\n %d %s %d = %2f ", calc.firstNumber, calc.operation, calc.secondNumber, answer);
            continueCalculation = isContinue();
        }
        System.out.println("Это конец");
    }
}