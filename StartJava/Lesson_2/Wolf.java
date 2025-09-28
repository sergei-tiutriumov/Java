public class Wolf {
    private String sex;
    private String nickname;
    private double weight;
    private String age;
    private String hue;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getAge() {
        return age;
    }

    public void setAge(double age) {
        if (age > 8.0) {
            this.age = "Некорректный возраст";
        } else {
            this.age = String.valueOf(age) + " год(а)";
        }
    }

    public String getHue() {
        return hue;
    }

    public void setHue(String hue) {
        this.hue = hue;
    }

    public void walk() {
        System.out.println("Крадется....");
    }

    public void seat() {
        System.out.println("Сидит.");
    }

    public void howl() {
        System.out.println("Ouuuuuu.....");
    }

    public void run() {
        System.out.println("Тыгыдык-тыгыдыг-тыгыдык");
    }

    public void hunt() {
        System.out.println("Hunting.");
    }
}    
