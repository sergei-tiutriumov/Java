import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfElseStatementTheme {
    public static int grade(int percentage) {
        if (percentage <= 60) {
            return 2;
        } else if (percentage < 73) {
            return 3;
        } else if (percentage < 91) {
            return 4;
        } else {
            return 5;
        }
    }

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

        System.out.println("\n\n2. ПОИСК БОЛЬШЕГО ЧИСЛА ШАГОВ");
        int stepsYesterdayAmount = 6503;
        int stepsTodayAmount = 7804;
        var stepsAverageAmount = (float) (stepsTodayAmount + stepsYesterdayAmount) / 2;
        System.out.printf("Вчера было пройдено %d шагов, а сегодня %d шагов.%n", 
                stepsYesterdayAmount, stepsTodayAmount);
        if (stepsYesterdayAmount == stepsTodayAmount) {
            System.out.println("За последние два дня было пройдено равное количество шагов");
        } else if (stepsTodayAmount > stepsYesterdayAmount) {
            System.out.println("Сегодня было пройдено больше, чем вчера");
        } else {
            System.out.println("Вчера было пройдено больше, чем сегодня");
        }
        System.out.printf("В среднем за день было пройдено %.2f шагов", stepsAverageAmount);

        System.out.println("\n\n\n3. ПРОВЕРКА КОЛИЧЕСТВА ГОСТЕЙ");
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
        
        System.out.println("\n\n\n4. ОПРЕДЕЛЕНИЕ ПЕРВОГО СИМВОЛА НИКНЕЙМА");
        System.out.println(" через вхождение в диапазон ASCII кодов");
        String nickname = "$John";
        String character = "";
        char firstSymbol = nickname.charAt(0);
        if (firstSymbol > 'a' && firstSymbol < 'z') {
            System.out.printf("Имя %s начинается с маленькой буквы %s%n", nickname, firstSymbol);
        } else if ((firstSymbol >= 'A' && firstSymbol <= 'Z')) {
            System.out.printf("Имя %s начинается с большой буквы %s%n", nickname, firstSymbol);
        } else if ((firstSymbol >= '0') && (firstSymbol <= '9')) {
            System.out.printf("Имя %s начинается с цифры %s%n", nickname, firstSymbol);
        } else {
            System.out.printf("Имя %s начинается с символа %s%n", nickname, firstSymbol);
        }
        System.out.println("\n через Class Character");
        if (Character.isLetter(firstSymbol) && Character.isLowerCase(firstSymbol)) {
            character = "маленькой буквы";
        } else if (Character.isLetter(firstSymbol) && Character.isUpperCase(firstSymbol)) {
            character = "большой буквы";
        } else if (Character.isDigit(firstSymbol)) {
            character = "цифры";
        } else {
            character = "символа"; 
        }
        System.out.printf("Имя %s начинается с %s %s%n ", nickname, character, firstSymbol);
        
        System.out.println("\n\n5. ИНВЕНТАРИЗАЦИЯ");
        int databaseNumber = 123;
        int pcNumber = 173;
        if (databaseNumber == pcNumber) {
            System.out.printf("[№%d]: компьютер на 3-м этаже в кабинете 2 \n", pcNumber);
        /* }  else {
            char hundreds = (databaseNumber / 100) == (pcNumber / 100) ?
                    (char) (databaseNumber / 100 + '0') : '_';
            char tens = (databaseNumber % 100 / 10) == (pcNumber % 100 / 10) ?
                    (char) (pcNumber % 100 / 10 + '0') : '_';
            char units = (databaseNumber % 10) == (pcNumber % 10) ?
                    (char) (databaseNumber % 10 + '0') : '_';
            if (hundreds == '_' || tens == '_' || units == '_') {
                System.out.printf("""
                        Нет полного совпадения:
                        База данных: [№%d]
                        Фактический: [№%c%c%c]
                        """, databaseNumber, hundreds, tens, units);
            } else {
                System.out.printf("[№%d]: оборудование не идентифицированно\n", pcNumber);
            }
        } */
        } else {
            boolean isEqualHundreds = (databaseNumber / 100) == (pcNumber / 100);
            boolean isEqualTens = (databaseNumber % 100 / 10) == (pcNumber % 100 / 10);
            boolean isEqualUnits = (databaseNumber % 10) == (pcNumber % 10);
            System.out.printf("""
                    Нет полного совпадения:
                    База данных: [№%d]
                    Фактический: [№%c%c%c]
                    """, databaseNumber, 
                    isEqualHundreds ? (char) (databaseNumber / 100 + '0') : '_',
                    isEqualTens ? (char) (pcNumber % 100 / 10 + '0') : '_',
                    isEqualUnits ? (char) (databaseNumber % 10 + '0') : '_');
        }

        System.out.println("\n\n6. ПОДСЧЕТ НАЧИСЛЕННЫХ БАНКОМ %");
        System.out.println("Первый способ, числа float без округления");
        float deposit = 321123.79f;
        float interestRate = 0.05f;
        if (deposit >= 100000 && deposit <= 300000) {
            interestRate = 0.07f;
        } else if (deposit > 300000) {
            interestRate = 0.1f;
        }
        float interest = deposit * interestRate;
        float finalMoney = deposit + interest;
        System.out.printf("""
                Ставка %f
                Сумма вклада %f
                Сумма начисленного %f
                Итоговая сумма  с %% %f
                %n""", interestRate, deposit, interest, finalMoney);

        System.out.println("Второй способ, через BigDecimal c округлением");
        var depositBd = new BigDecimal("321123.79");
        var interestsBd = depositBd
                .multiply(BigDecimal.valueOf(interestRate));
        var finalMoneyBd = depositBd.add(interestsBd).setScale(2, RoundingMode.HALF_UP);
        System.out.printf("""
                Сумма вклада %.2f
                Сумма начисленного %.2f
                Итоговая сумма  с %% %.2f
                """, depositBd, interest, finalMoneyBd);

        System.out.println("\n\n7. ОПРЕДЕЛЕНИЕ ОЦЕНКИ ПО ПРЕДМЕТАМ");
        int historyPercentage = 59;
        int programmingPercentage = 92;
        int historyGrade = grade(historyPercentage);
        int programmingGrade = grade(programmingPercentage);
        float everagePercentage = (historyPercentage + programmingPercentage) / 2f;
        float everageGrade = (historyGrade + programmingGrade) / 2f;
        System.out.printf("""
                История %d
                Программирование %d
                Средний бал оценок по предметам %.1f
                Средний %% по предметам %.1f
                """, historyGrade, programmingGrade, everageGrade, everagePercentage);

        System.out.println("\n\n8. РАСЧЕТ ГОДОВОЙ ПРИБЫЛИ");
        var monthlyIncome = new BigDecimal("13025.233");
        var rentFee = new BigDecimal("5123.018");
        var primeCost = new BigDecimal("9001.729");
        var yearRevenue = monthlyIncome
                .subtract(rentFee)
                .subtract(primeCost)
                .multiply(new BigDecimal("12"))
                .setScale(2, RoundingMode.HALF_UP);
        if (yearRevenue.compareTo(BigDecimal.ZERO) == 1) {
            System.out.printf("Прибыль за год: +%.2f \n", yearRevenue);
        } else {
            System.out.printf("Прибыль за год: %.2f \n", yearRevenue);
        }
    }
}
