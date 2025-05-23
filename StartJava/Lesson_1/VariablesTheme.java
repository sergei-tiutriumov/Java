import java.math.BigDecimal;
import java.math.RoundingMode;

public class VariablesTheme {
    public static void main(String[] args) {
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
        int[] ch = {1055, 1088, 1080, 1074, 1077, 1090};
        for (int i = 0; i < ch.length; i++) {
            System.out.printf(ch[i] + " ");
        }
        System.out.println();
        for (int j = 0; j < ch.length; j++) {
            System.out.printf("%-5s", (char) ch[j]);
        }
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
    }
}