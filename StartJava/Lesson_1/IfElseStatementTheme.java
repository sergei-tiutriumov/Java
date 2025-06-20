import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n\n1. ПЕРЕВОД ПСЕВДОКОДА НА ЯЗЫК JAVA");
        boolean isMan = true;
        if (!isMan) {
            System.out.println("Это женщина");
        } else {
            System.out.println("Это мужик");
        }
        int age = 25;
        if (age > 18) {
            System.out.println("Уже взрослый");
        } else {
            System.out.println("Еще совсем мелкий");
        }
        double height = 1.9;
        if (height < 1.8) {
            System.out.println("Приземистый");
        } else {
            System.out.println("Довольно высокий");
        }

        System.out.println("\n2. ПОИСК БОЛЬШЕГО ЧИСЛА ШАГОВ");
        double yesterday = 6503.0;
        double today = 7804.0;
        double average = (yesterday + today) / 2;
        System.out.printf("Вчера было пройдено %.0f шагов, а сегодня %.0f шагов.%n", yesterday, today);
        if (yesterday == today) {
            System.out.println("За последние два дня было пройдено равное количество шагов");
        } else if (yesterday < today) {
            System.out.println("Сегодня было пройдено больше, чем вчера");
        } else {
            System.out.println("Вчера было пройдено больше, чем сегодня");
        }
        System.out.printf("В среднем за день было пройдено %.2f шагов", average);

        System.out.println("\n\n3. ПРОВЕРКА КОЛИЧЕСТВА ГОСТЕЙ");
        int visitors = 2;
        if (visitors == 0) {
            System.out.println("Пока никто не записался на мероприятие!");
        } else if (visitors < 0) {
            System.out.println("Ошибка! только натуральные числа");
        } else if (visitors % 2 == 0) {
            System.out.printf("Записалось %d гостей. Можно формировать пары для конкурсов.", visitors);
        } else {
            System.out.printf("Записалось %d гостей. Нужны индивидуальные задания.", visitors);
        }
        
        System.out.println("\n\n4. ОПРЕДЕЛЕНИЕ ПЕРВОГО СИМВОЛА НИКНЕЙМА");
        System.out.println("\n через вхождение в диапазон ASCII кодов");
        String nickname = "John";
        char firstSymbol = nickname.charAt(0);
        if ((int) firstSymbol > 96 && (int) firstSymbol < 123) {
            System.out.printf("Имя %s начинается с маленькой буквы %s%n", nickname, firstSymbol);
        } else if (((int) firstSymbol >= 65 && (int) firstSymbol <= 90)) {
            System.out.printf("Имя %s начинается с большой буквы %s%n", nickname, firstSymbol);
        } else if (((int) firstSymbol >= 48 && (int) firstSymbol <= 57)) {
            System.out.printf("Имя %s начинается с цифры %s%n", nickname, firstSymbol);
        } else if (((int) firstSymbol >= 0 && (int) firstSymbol <= 47) || 
                ((int) firstSymbol >= 58 && (int) firstSymbol <= 64) || 
                ((int) firstSymbol >= 91 && (int) firstSymbol <= 96) || 
                ((int) firstSymbol >= 123 && (int) firstSymbol <= 127)) {
            System.out.printf("Имя %s начинается с символа %s%n", nickname, firstSymbol);
        }
        System.out.println("\n через Class Character");
        if (Character.isLetter(firstSymbol) && Character.isLowerCase(firstSymbol)) {
            System.out.printf("Имя %s начинается с маленькой буквы %s%n ", nickname, firstSymbol);
        } else if (Character.isLetter(firstSymbol) && Character.isUpperCase(firstSymbol)) {
            System.out.printf("Имя %s начинается с большой буквы %s%n ", nickname, firstSymbol);
        } 

        System.out.println("\n\n5. ИНВЕНТАРИЗАЦИЯ");
        int databaseNumber = 123;
        int pcNumber = 923;
        if (databaseNumber == pcNumber) {
            System.out.printf("[№%d]: компьютер на 3-м этаже в кабинете 2 \n", pcNumber);
        } else {
            char hundreds = (databaseNumber / 100) == (pcNumber / 100) ?
                    (char) (databaseNumber / 100 + '0') : '_';
            char tens = (databaseNumber % 100 / 10) == (pcNumber % 100 / 10) ?
                    (char) (pcNumber % 100 / 10 + '0') : '_';
            char units = (databaseNumber % 10) == (pcNumber % 10) ?
                    (char) (databaseNumber % 10 + '0') : '_';
            String fact = "" + hundreds + tens + units;
            if (!fact.equals("___")) {
                System.out.printf("""
                        Нет полного совпадения:
                        База данных: [№%d]
                        Фактический: [№%c%c%c]
                        """, databaseNumber, hundreds, tens, units);
            } else {
                System.out.printf("[№%d]: оборудование не идентифицированно\n", pcNumber);
            }
        }

        System.out.println("\n\n 6. ПОДСЧЕТ НАЧИСЛЕННЫХ БАНКОМ %");
        System.out.println("Первый способ, числа float без округления");
        float deposit = 321123.79f;
        float time = 1.0f;
        float interestRate;
        if (deposit < 100000) {
            interestRate = 0.05f;
        } else if (deposit >= 100000 && deposit <= 300000) {
            interestRate = 0.07f;
        } else {
            interestRate = 0.1f;
        }
        float interests = deposit * time * interestRate;
        float finalMoney = deposit + interests;
        System.out.printf("""
                Сумма вклада %f
                Сумма начисленного %f
                Итоговая сумма  с %% %f
                \n""", deposit, interests, finalMoney);

        System.out.println("Второй способ, через BigDecimal c округлением");
        var depositBd = new BigDecimal("321123.79");
        var interestsBd = depositBd
                .multiply(BigDecimal.valueOf(time))
                .multiply(BigDecimal.valueOf(interestRate));
        var finalMoneyBd = depositBd.add(interestsBd).setScale(2, RoundingMode.HALF_UP);
        System.out.printf("""
                Сумма вклада %.2f
                Сумма начисленного %.2f
                Итоговая сумма  с %% %.2f
                \n""", depositBd, interests, finalMoneyBd);
    }
}
