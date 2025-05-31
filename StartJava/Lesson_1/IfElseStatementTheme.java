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
        System.out.println("\n\n3. Проверка количества гостей");
        int visitors = 2;
        if (visitors == 0) {
            System.out.println("Пока никто не записался на мероприятие!");
        } else if (visitors < 0) {
            System.out.println("Ошибка! только натуральные числа");
        } else if (visitors % 2 == 0) {
            System.out.println("Записалось " + visitors + " гостей. Можно формировать пары для конкурсов");
        } else {
            System.out.println("Записалось " + visitors + " гостей. Нужны индивидуальные задания.");
        }
        System.out.println("\n4. ОПРЕДЕЛЕНИЕ ПЕРВОГО СИМВОЛА НИКНЕЙМА");
        System.out.println("\n через вхождение в диапазон ASCII кодов");
        String nickname = "John";
        char firstSymbol = nickname.charAt(0);
        if ((int)firstSymbol > 96 && (int)firstSymbol < 123) {
            System.out.printf("Имя %s начинается с маленькой буквы %s%n", nickname,firstSymbol);
        } else if (((int)firstSymbol >= 65 && (int)firstSymbol <= 90)) {
            System.out.printf("Имя %s начинается с большой буквы %s%n", nickname,firstSymbol);
        } else if (((int)firstSymbol >= 48 && (int)firstSymbol <= 57)) {
            System.out.printf("Имя %s начинается с цифры %s%n", nickname,firstSymbol);
        } else if (((int)firstSymbol >= 0 && (int)firstSymbol <= 47) || 
                ((int)firstSymbol >= 58 && (int)firstSymbol <= 64) || 
                ((int)firstSymbol >= 91 && (int)firstSymbol <= 96) || 
                ((int)firstSymbol >= 123 && (int)firstSymbol <= 127)) {
            System.out.printf("Имя %s начинается с символа %s%n", nickname,firstSymbol);
        }
        System.out.println("\n через Class Character");
        if (Character.isLetter(firstSymbol) && Character.isLowerCase(firstSymbol)) {
           System.out.printf("Имя %s начинается с маленькой буквы %s%n ", nickname,firstSymbol);
        } else if (Character.isLetter(firstSymbol) && Character.isUpperCase(firstSymbol)) {
           System.out.printf("Имя %s начинается с большой буквы %s%n ", nickname,firstSymbol);
        } 

    }
}