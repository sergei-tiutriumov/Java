import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random r = new Random();
        int magicNumber = r.nextInt(1, 101);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Угадай число от 1 до 100! ");
        while (!scanner.hasNextInt()) {
            System.out.println("Это не число!!!");
            scanner.nextLine();
            System.out.printf("Попробуй еще раз: введи число от 1 до 100 ");
        }
        int guessNumber = scanner.nextInt();
        String znak = guessNumber > magicNumber ? "больше" : "меньше";
        if (magicNumber == guessNumber) {
            System.out.println("Угадал!!!!!");
        } else {
            System.out.printf("%d %s того, что загадал компьютер %n", guessNumber, znak);
        }
    }
}