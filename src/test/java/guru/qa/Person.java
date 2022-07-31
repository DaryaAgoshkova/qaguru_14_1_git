package guru.qa;

public class Person {
    int age;
    String name;

    void goToPension() {
        if (age > 65) {
            System.out.println("Я на пенсии :(");
        }
        else {
            System.out.println("Я еще молода!");
        }
    }

    public void sayName() {
        System.out.println("Мое имя: " + name);

    }
}
