public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. ПЕРЕВОД ПСЕВДОКОДА НА ЯЗЫК JAVA");
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
        System.out.println("       ");
        System.out.println("2. ПОИСК БОЛЬШЕГО ЧИСЛА ШАГОВ");
        int yesterday = 6503;
        int today = 7804;
        double average = ((double) yesterday + today) / 2;
        System.out.println("Вчера было пройдено " + yesterday + " шагов, а сегодня " + today + " шагов.");
        if (yesterday == today) {
            System.out.println("За последние два дня было пройдено равное количество шагов");
        } else if (yesterday < today) {
            System.out.println("Сегодня было пройдено больше, чем вчера");
        } else {
            System.out.println("Вчера было пройдено больше, чем сегодня");
        }
        System.out.println("В среднем за день было пройдено " + average);
        System.out.println("              ");
        System.out.println("3. Проверка количества гостей");
        int visitors = 3;
        if (visitors == 0) {
            System.out.println("Пока никто не записался на мероприятие!");
        } else if (visitors % 2 == 0) {
            System.out.println("Записалось " + visitors + " гостей. Можно формировать пары для конкурсов");
        } else {
            System.out.println("Записалось " + visitors + " гостей. Нужны индивидуальные задания.");
        }
    }
}