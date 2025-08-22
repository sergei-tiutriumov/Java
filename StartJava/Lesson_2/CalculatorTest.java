public class Calculator {
    public boolean checkOperation(char operation) {
        this.operation = operation;
        String allowedOperations = "+ - * / ^ %";
        boolean result = allowedOperations.contains(operation);
        return result;
    }
    public float calcutate(CalculatorTest task) {
        float result = 0;
        switch(task.operation) {
            case '+':
                result = task.firstNumber + task.secondNumber;
                break;
            case '-':
                result = task.firstNumber - task.secondNumber;
                break;
            case '*':
                result = task.firstNumber * task.secondNumber;
                break;
            case '/':
                result = task.firstNumber / task.secondNumber;
                break;
            case '^':
                result = task.firstNumber ^ task.secondNumber;
                break;
            case '%':
                result = task.firstNumber % task.secondNumber;
                break;
            default:
                result = -99999999999999.9999;
        }
        return result;
    }


}
public class CalculatorTest {
    public static void main(Strig[] args) {
        public CalculatorTest(int firstNumber, char operation, int secondNumber) {
            this.firstNumber = firstNumber;
            this.operation = operation;
            this.secondNumber = secondNumber;
        }
        public int getNumber() {

        }
        public char getOperation() {

        }
        public boolean isContinue() {

        }
    }
}