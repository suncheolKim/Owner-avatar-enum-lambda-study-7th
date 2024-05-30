package sparta;

public class User {
    private final String name;
    private final int age;
    private final String gender;
    private final String nation;
    private final String burger;
    private final String mincho;

    public User(String name, int age, String gender, String nation, String burger, String mincho) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.nation = nation;
        this.burger = burger;
        this.mincho = mincho;
    }

    @Override
    public String toString() {
        return name;
    }





    // ------------- 이하 Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getNation() {
        return nation;
    }

    public String getBurger() {
        return burger;
    }

    public String getMincho() {
        return mincho;
    }
}
