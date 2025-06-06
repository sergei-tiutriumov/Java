import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class VariablesTheme {
    public static void main(String[] args) {
        final long start = System.nanoTime();
        final LocalTime startTime = LocalTime.now();

        System.out.println("\n1. ВЫВОД ASCII-ГРАФИКИ");
        System.out.println(
                "                     /\\ \n" +
                "   J    a  v     v  /  \\ \n" +
                "   J   a a  v   v  /_( )\\ \n" +
                "J  J  aaaaa  V V  /      \\ \n" +
                " JJ  a     a  V  /___/\\___\\ \n");
        System.out.println("""
                         /\\            
                   J    /  \\  v     v  a
                   J   /_( )\\  v   v  a a
                J  J  /      \\  V V  aaaaa
                 JJ  /___/\\___\\  V  a     a
                """);

        System.out.println("2. РАСЧЕТ СТОИМОСТИ ТОВАРА");
        float penPrice = 10.5f;
        float bookPrice = 235.23f;
        float discount = 11f;
        float priceTogether = (penPrice + bookPrice) * (1 - discount / 100);
        System.out.println("Стоимость товаров без скидки " + 
                penPrice + " рублей за ручку и " + 
                bookPrice + " рублей за книгу\n" + 
                "сумма скидки " + discount + "%\n" + 
                "стоимость товаров со скидкой " + priceTogether + " рублей\n\n");
        var penPriceBd = new BigDecimal("10.5");
        var bookPriceBd = new BigDecimal("235.23");
        var discountBd = new BigDecimal("11");
        var priceTogetherBd = penPriceBd
                .add(bookPriceBd)
                .multiply(BigDecimal
                .ONE
                .subtract(discountBd.movePointLeft(2)))
                .setScale(2, RoundingMode.HALF_UP);
        System.out.println("Решение с использованием BigDecimal:\n" +
                "Стоимость товаров без скидки " + 
                penPriceBd + " рублей за ручку и " + bookPriceBd + " рублей за книгу\n" + 
                "сумма скидки " + discountBd + "%\n" + 
                "стоимость товаров со скидкой " + priceTogetherBd + " рублей");

        System.out.println("\n3. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ЯЧЕЕК В ТАБЛИЦЕ");
        int a = 3;
        int b = 8;
        int temp;
        System.out.println("Исходные значения A1 = " + a + ", B1 = " + b + "\n");
        temp = a;
        a = b;
        b = temp;
        System.out.println("Метод: замена через третью переменную\n" +
                "Результат: A1 = " + a + ", B1 = " + b + "\n");
        a += b;
        b = a - b;
        a -= b;
        System.out.println("Метод: замена через арифметические операции\n" +
                "Результат: A1 = " + a + ", B1 = " + b + "\n");
        a ^= b;
        b = a ^ b;
        a = b ^ a;
        System.out.println("Метод: побитовый\nРезультат: A1 = " + a + ", B1 = " + b + "\n");

        System.out.println("4. ДЕКОДИРОВАНИЕ СООБЩЕНИЯ");
        int ch1 = 1055;
        int ch2 = 1088;
        int ch3 = 1080;
        int ch4 = 1074;
        int ch5 = 1077;
        int ch6 = 1090;
        System.out.printf("%d %d %d %d %d %d %n", ch1, ch2, ch3, ch4, ch5, ch6);
        System.out.printf("%-4c %-4c %-4c %-4c %-4c %-4c ", ch1, ch2, ch3, ch4, ch5, ch6);
        
        System.out.println("\n\n5. АНАЛИЗ КОДА");
        int itemCode = 184;
        int category = itemCode / 100;
        int subCategory = itemCode % 100 / 10;
        int wrapType = itemCode % 10;
        int checkSum = category + subCategory + wrapType;
        int checkCode = category * subCategory * wrapType;
        System.out.printf("""
                Товар %d
                Категория %d 
                Подкатегория %d 
                Тип упаковки %d
                Контрольная сумма %d
                Проверочный код %d
                """, itemCode, category, subCategory, wrapType, checkSum, checkCode);
        
        System.out.println("\n 6. ТЕСТИРОВАНИЕ ДАТЧИКОВ ПЕРЕД ЗАПУСКОМ РАКЕТЫ");
        byte temperature = Byte.MAX_VALUE;
        System.out.printf("""
                [Температура, \u00B0C]: 
                  Исходное: %d
                  +1: %d
                  -1: %d
                """, temperature, ++temperature, --temperature);
        short pressure = Short.MAX_VALUE;
        System.out.printf("""
                [Давление, Па]: 
                  Исходное: %d 
                  +1: %d
                  -1: %d
                """, pressure, ++pressure, --pressure);
        char statementCode = '?';
        System.out.printf("""
                [Состояния системы]:
                  Исходное: %d
                  +1: %c  
                  -1: %c
                """, (int) statementCode, ++statementCode, --statementCode);
        int track = Integer.MAX_VALUE;
        System.out.printf("""
                [Пройденное расстояние]:  
                  Исходное: %d 
                  +1: %d
                  -1: %d
                """, track, ++track, --track);
        long time = Long.MAX_VALUE;
        System.out.printf("""
                [Общее время полета]:
                  Исходное: %d 
                  +1: %d
                  -1: %d
                """, time, ++time, --time);
        
        System.out.println("\n7. ВЫВОД ПАРАМЕТРОВ JVM И ОС");
        int availableCpus = Runtime.getRuntime().availableProcessors();
        double totalMemory = Runtime.getRuntime().totalMemory() / 1048576;
        double freeMemory = Runtime.getRuntime().freeMemory() / 1048576;
        double usedMemory = totalMemory - freeMemory;
        double maxMemory = Runtime.getRuntime().maxMemory() / 1048576;
        String homeDirectory = System.getProperty("user.home");
        String osVersion = System.getProperty("os.version");
        String javaVersion = System.getProperty("java.version");
        String fileSeparator = System.getProperty("file.separator");
        System.out.printf("""
            Параметры JVM:
            1. Доступное число ядер: %d
            2. Выделенная память: %.1f Мб
            3. Свободная память: %.1f Мб
            4. Используемая память: %.1f Мб
            5. Максимально доступная память: %.1f Мб
                """, availableCpus, totalMemory, freeMemory, usedMemory, maxMemory);
        long finish = System.nanoTime();
        double timeElapsed = (finish - start) * 1.0 / 1000000000;
        var timeElapsedRounded = Math.round(timeElapsed * 1000) / 1000.0;
        LocalTime finishTime = LocalTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        System.out.println("\nСтарт проверки:\n" + dtf.format(startTime) + 
                            "\nФиниш проверки:\n" + dtf.format(finishTime) +
                            "\nВремя работы: " + timeElapsedRounded + " сек");
    }
}