public class WolfTest {
    public static class Wolf {
        String sex;
        String nickname;
        double weight;
        double age;
        String hue;

        public void walk() {
            System.out.println("Крадется....");
        }

        public void seat() {
            System.out.println("Сидит.");
        }

        public void haul() {
            System.out.println("Ouuuuuu.....");
        }

        public void run() {
            System.out.println("Тыгыдык-тыгыдыг-тыгыдык");
        }

        public void hunt() {
            System.out.println("Hunting.");
        }

        public void parameters() {
            System.out.printf("\nПол - %s\nКличка - %s\nВес - %.1f кг\nВозраст - %.1f год(а)\nЦвет - %s\n", 
                    sex, nickname, weight, age, hue);
        }
    }

    public static void main(String[] args) {
        Wolf wolfy = new Wolf();
        wolfy.sex = "male";
        wolfy.nickname = "Rex";
        wolfy.weight = 10;
        wolfy.age = 2;
        wolfy.hue = "gray";
        wolfy.parameters();
    }
}