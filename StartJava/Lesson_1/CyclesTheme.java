
public class CyclesTheme {
    public static void main (String[] args) {
        System.out.println("\n1. ВЫВОД ASCII-СИМВОЛОВ");
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
        System.out.println("2. ВЫВОД ГЕОМЕТРИЧЕСКИХ ФИГУР");
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 10; i++) {
                System.out.print("_");
            }
            for (int i = 5-j; i > 0; i--) {
                System.out.print("*");
            }
            System.out.print(" ");
            for (int i = 0; i < j * 2 + 1; i++) {
                System.out.print("^");
            }
            System.out.println();
        }
    }
}