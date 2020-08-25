package ar.com.ada.online.second.exerciseone;

public class Person {

    String name;
    String lastName;
    Integer age;

    void sing() {
        System.out.printf("Soy %s %s tengo %d años y estoy cantando\n", name, lastName, age);
    }

    void talk() {
        System.out.printf("Soy %s %s tengo %d años y estoy hablando\n", name, lastName, age);
    }

    void play() {
        System.out.printf("Soy %s %s tengo %d años y estoy jugando\n", name, lastName, age);
    }
}
