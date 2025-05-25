import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class VariablesTheme {
    public static void main(String[] args) {
        final long start = System.nanoTime();
        final LocalTime startTime = LocalTime.now();
        System.out.println("1. ВЫВОД ASCII-ГРАФИКИ");
        System.out.println(
                            "                     /\\ \n" +
                            "   J    a  v     v  /  \\ \n" +
                            "   J   a a  v   v  /_( )\\ \n" +
                            "J  J  aaaaa  V V  /      \\ \n" +
                            " JJ  a     a  V  /___/\\___\\ \n          \n ");
        String word = """
                 /\\            
           J    /  \\  v     v  a
           J   /_( )\\  v   v  a a
        J  J  /      \\  V V  aaaaa
        JJ  /___/\\___\\  V  a     a
                        """;

        System.out.println(word);
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
        System.out.printf(ch1 + " " + ch2 + " " + ch3 + " " + ch4 + " " + ch5 + " " + ch6 + "%n");
        System.out.printf("%-4s %-4s %-4s %-4s %-4s %-4s ", (char) ch1, (char) ch2, (char) ch3, (char) ch4, (char) ch5, (char) ch6);
        System.out.println("\n\n5. Анализ кода товара");
        int itemCode = 184;
        int category = itemCode / 100;
        int subCategory = itemCode % 100 / 10;
        int wrapType = itemCode % 10;
        int checkSum = category + subCategory + wrapType;
        int checkCode = category * subCategory * wrapType;
        System.out.println("Товар " + itemCode + "\n" + "Категория " + category + 
                            "\n Подкатегория  " + subCategory + 
                            "\n Тип упаковки " + wrapType + 
                            "\nКонтрольная сумма = " + checkSum +
                            "\nПроверочный код = " + checkCode);
        System.out.println("\n 6. ТЕСТИРОВАНИЕ ДАТЧИКОВ ПЕРЕД ЗАПУСКОМ РАКЕТЫ");
        byte temperature = Byte.MAX_VALUE;
        System.out.println("[Температура, \u00B0C]:\n" + 
                            "  Исходное: 127\n  +1: " + --temperature + "\n  -1: " + --temperature);
        short pressure = Short.MAX_VALUE;
        System.out.println("[Давление, Па]:\n" + 
                            "  Исходное: = " + pressure + 
                            "\n  +1: " + ++pressure +
                            "\n  -1: " + --pressure);
        char statementCode = '?';
        System.out.println("[Состояния системы]: " + 
                            "\n  Исходное: " + ((int) statementCode) +
                            "\n   +1: " + (++statementCode) + 
                            "\n   -1: " + (--statementCode));
        int track = Integer.MAX_VALUE;
        System.out.println("[Пройденное расстояние]: " + 
                            "\n  Исходное: " + track + 
                            "\n  +1: " + (++track) + 
                            "\n  -1: " + (--track));
        long time = Long.MAX_VALUE;
        System.out.println("[Исходное: " + time + 
                            "\n  +1: " + (++time) + 
                            "\n  -1: " + (--time));
        System.out.println("\n7. ВЫВОД ПАРАМЕТРОВ JVM И ОС");
        int availableNumberOfCores = Runtime.getRuntime().availableProcessors();
        String availableNumberOfCoresDescription = """ 
                                                Доступное число ядер виртуальной машины""";
        System.out.println(availableNumberOfCoresDescription + " " + availableNumberOfCores);
        double fullAvailableMemory = Runtime.getRuntime().totalMemory() / 1048576;
        String fullAvailableMemoryDescription = """
                                            Общее количество памяти виртуальной машины Java""";
        System.out.printf(fullAvailableMemoryDescription + " %.1f Мб\n", fullAvailableMemory);
        double freeAvailableMemory = Runtime.getRuntime().freeMemory() / 1048576;
        String freeAvailableMemoryDescription = """
                                                Свободная память""";
        System.out.printf(freeAvailableMemoryDescription + " %.1f Мб\n", freeAvailableMemory);
        double usedMemory = fullAvailableMemory - freeAvailableMemory;
        String usedMemoryDescription = """
                                        Используемая в данный момент виртуальной машиной память""";
        System.out.printf(usedMemoryDescription + " %.1f Мб\n", usedMemory);
        double maxAvailableMemory = Runtime.getRuntime().maxMemory() / 1048576;
        String maxAvailableMemoryDescription = """
                                              Максимально доступная память""";
        System.out.printf(maxAvailableMemoryDescription + " %.1f Мб\n", maxAvailableMemory);
        String homeDirectory = System.getProperty("user.home");
        String homeDirectoryDescription = """
                                        Домашняя директория""";
        System.out.printf(homeDirectoryDescription + " %s\n", homeDirectory);
        String osVersion = System.getProperty("os.version");
        String osVersionDescription = """
                                    Версия операционной системы""";
        System.out.printf(osVersionDescription + " %s\n", osVersion);
        String javaVersion = System.getProperty("java.version");
        String javaVersionDescription = """
                                        Версия java""";
        System.out.printf(javaVersionDescription + " %s\n", javaVersion);
        String fileSeparator = System.getProperty("file.separator");
        String fileSeparatorDescription = """
                                        символ разделения пути""";
        System.out.printf(fileSeparatorDescription + " %s\n", fileSeparator);
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