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
        for (int i = 0; i < 5; i++) {
            System.out.print("__________ ");
            for (int j = 5 - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.print(" ");
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("^");
            }
            System.out.println();
        }

        System.out.println("\n\n3. ВЫВОД ТАБЛИЦЫ УМНОЖЕНИЯ");
        System.out.println("  | 2  3  4  5  6  7  8  9\n--+-----------------------");
        for (int i = 2; i <= 9; i++) {
            System.out.printf("%d |", i);
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%2d ", i * j);
            }
            System.out.println();
        }

        System.out.println("\n\n4. ВЫВОД ЧИСЕЛ В НЕСКОЛЬКО СТРОК");
        int numbersPerString = 5;
        int maxValue = 24;
        int number = 1;
        while (number < maxValue) {
            for (int i = 0; i < numbersPerString; i++) {
                System.out.printf("%3d", number < maxValue ? number : 0);
                number += 2;
            }
            System.out.println();
        }

        System.out.println("\n\n\n5. ВЫВОД ЧИСЕЛ МЕЖДУ MIN И MAX");
        int a = 10;
        int b = 5;
        int c = -1;
        int max = a > b ? (a > c ? a : c) : (b > c ? b : c);
        int min = a < b ? (a < c ? a : c) : (b < c ? b : c);
        for (int i = max - 1; i > min; i--) {
            System.out.printf("%d ", i);
        }

        System.out.println("\n\n\n6. РАЗНЫЕ ОПЕРАЦИИ НАД ЧИСЛОМ");
        int originNumber = 2234321;
        int currNumber = originNumber;
        int twosCount = 0;
        int reversedNumber = 0;
        while (currNumber > 0) {
            int digit = currNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            currNumber /= 10;
            if (digit == 2) {
                twosCount++;
            }
        }
        String isEven = twosCount % 2 == 0 ? "четным" : "нечетным";
        String isPalindrome = originNumber == reversedNumber ? "палиндром" : "не палиндром";
        System.out.printf("%d - %s c %s (%d) количеством двоек %n", 
                originNumber, isPalindrome, isEven, twosCount);

        System.out.println("\n\n7. ПРОВЕРКА СЧАСТЛИВОГО ЧИСЛА");
        int luckyNumber = 101002;
        int firstThreeDigits = luckyNumber / 1000;
        int lastTreeDigits = luckyNumber % 1000;
        int firstSum = 0;
        int lastSum = 0;
        int first = firstThreeDigits;
        int second = lastTreeDigits;
        for (int i = 3; i > 0; i--) {
            int digit = first % 10;
            firstSum += digit;
            first /= 10;
            digit = second % 10;
            lastSum += digit;
            second /= 10;
        }
        System.out.printf("""
            %d - счастливое число
            Сумма цифр %d = %d
            Сумма цифр 00%d = %d
                """, luckyNumber, firstThreeDigits, firstSum, lastTreeDigits, lastSum);

        System.out.println("\n\n8. ГЕНЕРАТОР ПАРОЛЯ");
        Random r = new Random();
        String password = "";
        boolean hasSmallLetter = false;
        boolean hasCapitalLetter = false;
        boolean hasSpecSymbol = false;
        boolean hasDigit = false;
        for (int i = 1; i < 9; i++) {
            int ch = r.nextInt(33, 126);
            Character symbol = (char) ch;
            password += symbol;
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
        boolean isMoreSeven = password.length() >= 8 ? true : false; 
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