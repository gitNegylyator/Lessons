package lesson4;

public class Human {
    int age;
    String name;
    public Human (int ageHuman, String nameHuman) {
        this.age = ageHuman;
        this.name = nameHuman;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println(name + " с днем рождения!");
    }
}

//ctrl+alt+v
