public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfy = new Wolf();
        wolfy.setSex("male");
        wolfy.setNickname("Rex");
        wolfy.setWeight(10);
        wolfy.setAge(6);
        wolfy.setHue("gray");
        System.out.printf("\nПол - %s\nКличка - %s\nВес - %.1f кг\nЦвет - %s\n", 
                    wolfy.getSex(), wolfy.getNickname(), wolfy.getWeight(), wolfy.getHue());
        System.out.println("Возраст - " + wolfy.getAge());
    }
}