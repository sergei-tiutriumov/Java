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
        System.out.println("");
    }
}