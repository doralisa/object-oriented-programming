package ar.com.ada.online.second.exerciseone;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal();

        dog.breed = "Pastor aleman";
        dog.color = "Marron y negro";
        dog.name = "Draco";

        dog.move();
        dog.sleep();
        dog.eat();

        Vehicle car = new Vehicle();

        car.brand = "Chevrolet";
        car.color = "Blanco";
        car.maxSpeed = "200 km/h";

        car.moveOn();
        car.brake();

        Person david = new Person();

        david.name = "David";
        david.lastName = "Blanco";
        david.age = 2;

        david.sing();
        david.talk();
        david.play();
    }
}
