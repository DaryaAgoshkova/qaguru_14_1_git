package guru.qa;

import org.junit.jupiter.api.Test;

public class FirstTest {

    @Test
    public static void main(String[] args) {

        Person student = new Person();
        student.age = 34;
        student.name = "Dasha";
        student.goToPension();
        student.sayName();
    }

    @Test
    void second() {

        Person student = new Person();
        student.age = 33;
        student.name = "Sasha";
        student.goToPension();
        student.sayName();
    }
}
