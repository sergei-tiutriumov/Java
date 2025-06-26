
public class CyclesTheme {
    public static void main (String[] args) {
        System.out.println("1. ВЫВОД ASCII-СИМВОЛОВ");
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
    }
}