public class Wolf {
        private String sex;
        private String nickname;
        private double weight;
        private String age;
        private String hue;

        public void setSex(String sex) {
            this.sex = sex;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public void setHue(String hue) {
            this.hue = hue;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public void setAge(double age) {
            if (age > 8.0) {
                this.age = "Некорректный возраст";
            } else {
                this.age = String.valueOf(age) + " год(а)";
            }
        }

        public String getSex() {
            return sex;
        }

        public String getNickname() {
            return nickname;
        }

        public String getHue() {
            return hue;
        }

        public double getWeight() {
            return weight;
        } 

        public String getAge() {
            return age;
        }

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
            System.out.printf("\nПол - %s\nКличка - %s\nВес - %.1f кг\nВозраст - %.1f год(а)\nЦвет - %s\n~~~~~~~~~~~~~~\n\n", 
                    sex, nickname, weight, age, hue);
        }
    }
