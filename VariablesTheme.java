import java.math.BigDecimal;
import java.math.RoundingMode;
public class VariablesTheme {
    public static void main(String[] args){
        System.out.println("1. ВЫВОД ASCII-ГРАФИКИ");
        System.out.println(
             "                     /\\ \n" +
             "   J    a  v     v  /  \\ \n" +
             "   J   a a  v   v  /_( )\\ \n" +
             "J  J  aaaaa  V V  /      \\ \n" +
             " JJ  a     a  V  /___/\\___\\ \n          \n ");
        String word = """
                                  /\\ 
                J    a  v     v  /  \\ 
                J   a a  v   v  /_( )\\ 
             J  J  aaaaa  V V  /      \\ 
              JJ  a     a  V  /___/\\___\\ 
              """;
        System.out.println(word);
        System.out.println("2. РАССЧЕТ СТОИМОСТИ ТОВАРА");
        float penPrice = 10.5f;
        float bookPrice = 235.23f;
        float discount = 11f;
        float priceTogether = (penPrice + bookPrice) * (1 - discount / 100);
        System.out.println("Стоимость товаров без скидки " + penPrice + " рублей за ручку и " + bookPrice + " рублей за книгу\n" + 
                           "сумма скидки " + discount + "%\n" + 
                           "стоимость товаров со скидкой " + priceTogether + " рублей\n\n");

        var penPriceBd = new BigDecimal("10.5");
        var bookPriceBd = new BigDecimal("235.23");
        var discountBd = new BigDecimal("11");
        var priceTogetherBd = penPriceBd
                            .add(bookPriceBd)
                            .multiply(BigDecimal.ONE.subtract(discountBd.movePointLeft(2)))
                            .setScale(2, RoundingMode.HALF_UP);
        System.out.println("Решение с использованием BigDecimal:\nСтоимость товаров без скидки " + penPriceBd + " рублей за ручку и " + bookPriceBd + " рублей за книгу\n" + 
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
        System.out.println("Метод: замена через третью переменную\nРезульльтат: A1 = " + a + ", B1 = " + b +"\n");
        a += b;
        b = a - b;
        a -= b;
        System.out.println("Метод: замена через арифметические операции\nРезультат: A1 = " + a + ", B1 = " + b + "\n");
        a ^= b;
        b = a ^ b;
        a = b ^ a;
        System.out.println("Метод: побитовый\nРезультат: A1 = " + a + ", B1 = " + b + "\n");
    }
}