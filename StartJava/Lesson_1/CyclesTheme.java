import java.util.Random;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n\n1. ВЫВОД ASCII-СИМВОЛОВ");
        System.out.println("DECIMAL    CHARACTER    DESCRIPTION");
        for (int i = 33; i < 48; i++) {
            if (i % 2 == 1) {
                System.out.printf("%4d %11c  %10s %-20s %n", i, i, "", Character.getName(i));
            }
        }
        for (int i = 97; i < 123; i++) {
            if (i % 2 == 0) {
                System.out.printf("%4d %11c  %10s %-20s %n", i, i, "", Character.getName(i));
            }
        }

        System.out.println("\n\n2. ВЫВОД ГЕОМЕТРИЧЕСКИХ ФИГУР");
        for (int j = 0; j < 5; j++) {
            System.out.print("__________ ");
            for (int i = 5 - j; i > 0; i--) {
                System.out.print("*");
            }
            System.out.print(" ");
            for (int i = 0; i < j * 2 + 1; i++) {
                System.out.print("^");
            }
            System.out.println();
        }

        System.out.println("\n\n3. ВЫВОД ТАБЛИЦЫ УМНОЖЕНИЯ");
        System.out.println("  | 2  3  4  5  6  7  8  9\n--+-----------------------");
        for (int i = 2; i <= 9; i++) {
            System.out.printf("%d |", i);
            for (int j = 2; j <= 9; j++) {
                int result = i * j;
                System.out.printf("%2d ", result);
            }
            System.out.println();
        }

        System.out.println("\n\n4. ВЫВОД ЧИСЕЛ В НЕСКОЛЬКО СТРОК");
        int limitNumber = 30;
        int maxValue = 24;
        for (int i = 1; i < limitNumber; i += 2) {
            if (((i - 9) % 10 == 0) && (i < 24)) {
                System.out.printf("%2d\n", i);
            } else if (i < maxValue) {
                System.out.printf("%2d ", i);
            } else {
                System.out.printf("%2d ", 0);
            }
        }
        System.out.println();
    
        System.out.println("\n\n5. ВЫВОД ЧИСЕЛ МЕЖДУ MIN И MAX");
        int[] numbers = {10, 5, -1};
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int swap = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = swap;
                }
            }
        } 
        for (int item : numbers) {
            System.out.printf("%d ", item);
        }
        System.out.println();

        System.out.println("\n\nРАЗНЫЕ ОПЕРАЦИИ НАД ЧИСЛОМ");
        int originNumber = 2234321;
        String stringNumber = "" + originNumber;
        char[] arrayNumber = stringNumber.toCharArray();
        for (int i = 0; i < (arrayNumber.length - 1) / 2 - 1; i++) {
            char swap = arrayNumber[i];
            arrayNumber[i] = arrayNumber[(arrayNumber.length - i) - 1];
            arrayNumber[(arrayNumber.length - i) - 1] = swap;
        }
        String reversedNumber = String.valueOf(arrayNumber);
        int sameDigitCounter = 0;
        for (char i : arrayNumber) {
            if (i == '2') {
                sameDigitCounter++;
            }   
        }
        String isEven = (sameDigitCounter % 2) == 0 ? "четным" : "нечетным";
        int palindromeCounter = 0;
        for (int i = 0; i < (arrayNumber.length - 1) / 2 - 1; i++) {
            if (arrayNumber[i] != arrayNumber[(arrayNumber.length - i) - 1]) {
                palindromeCounter++;
            }
        }
        String isPalindrome = palindromeCounter > 0 ? "не палиндром" : "палиндром";
        System.out.printf("%d - %s c %s (%d) количеством двоек %n", 
                originNumber, isPalindrome, isEven, sameDigitCounter);

        System.out.println("\n\n7. ПРОВЕРКА СЧАСТЛИВОГО ЧИСЛА");
        int luckyNumber = 101002;
        int firstThreeDigits = luckyNumber / 1000;
        String lastTreeDigits = String.valueOf(luckyNumber)
                .replace(String.valueOf(firstThreeDigits), "")
                .trim();
        int firstSum = firstThreeDigits / 100 + firstThreeDigits % 100 / 10 + firstThreeDigits % 10;
        int lastSum = Integer.parseInt(lastTreeDigits) / 100 +
                      Integer.parseInt(lastTreeDigits) % 100 / 10 +
                      Integer.parseInt(lastTreeDigits) % 10;
        System.out.printf("""
            %d - счастливое число
            Сумма цифр %d = %d
            Сумма цифр %s = %d
                """, luckyNumber, firstThreeDigits, firstSum, lastTreeDigits, lastSum);

        System.out.println("\n\n8. ГЕНЕРАТОР ПАРОЛЯ");
        Random r = new Random();
        int ch;
        String password = "";
        for (int i = 1; i < 9; i++) {
            ch = r.nextInt(32, 127);
            password += (char) ch;
        }
        boolean hasSmallLetter = false;
        boolean hasCapitalLetter = false;
        boolean hasSpecSymbol = false;
        boolean hasDigit = false;
        boolean isMoreSeven = password.length() >= 8 ? true : false; 
        for (char symbol : password.toCharArray()) {
            if (Character.isUpperCase(symbol)) {
                hasCapitalLetter = true;
                continue;
            }
            if (Character.isLowerCase(symbol)) {
                hasSmallLetter = true;
                continue;
            }
            if (!Character.isLetterOrDigit(symbol)) {
                hasSpecSymbol = true;
                continue;
            }
            if (Character.isDigit(symbol)) {
                hasDigit = true;
            }
        }
        String security = "";
        if (isMoreSeven && hasSmallLetter && hasCapitalLetter && hasSpecSymbol) {
            security = "Надежный";
        } else if (isMoreSeven && (hasCapitalLetter || hasDigit)) {
            security = "Средний";
        } else {
            security = "Слабый";
        }
        System.out.printf("""
                Пароль: %s
                Надежность: %s
                """, password, security);
    }
}