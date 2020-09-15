package ar.com.ada.online.second.obj;

import override.Person;

public class Main {

    public static void main(String[] args) {
        Person student = new Person("Fabio", "Lanzo");
        Person teacher = new Person("Pablo", "Rojas");
        Person director = new Person("Pedro", "Perez");
        Person secretary = new Person("Pablo", "Rojas");

        // Mostrando metodo toString:

        System.out.println("student.toString():" + student.toString());
        System.out.println("teacher.toString():" + teacher.toString());
        System.out.println("director.toString():" + director.toString());
        System.out.println("secretary.toString():" + secretary.toString());

        // Mostrando metodo hashCode:

        System.out.println("student.hashCode():" + student.hashCode());
        System.out.println("teacher.hashCode():" + teacher.hashCode());
        System.out.println("director.hashCode():" + director.hashCode());
        System.out.println("secretary.hashCode():" + secretary.hashCode());

        // Mostrando metodo equals:
        System.out.println(student.equals(teacher)
                || student.equals(director)
                || student.equals(secretary));
        System.out.println(teacher.equals(director)
                || teacher.equals(secretary));
        System.out.println(director.equals(secretary));

    }
}
