package ar.com.ada.online.second.myfirstobject;

/**
 * Plantilla para crear objetos de tipo de Person
 */
public class Person {
    String name;
    String lastname;

    void showAttributeValues() {
        System.out.println("Name: " + name);
        System.out.println("Last name: " + this.lastname);
    }
}
