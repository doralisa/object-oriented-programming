package ar.com.ada.oop;

import zoo.Dog;
import zoo.Horse;

public class Main {

    public static void main(String[] args) {

        Dog candy = new Dog("Daschund", 4, 4);
        Dog buster = new Dog("Daschund", 4, 4);
        Horse million = new Horse("Pure blood", "Million", 60);
        Horse minnie = new Horse("Pure blood", "Minnie", 80);

        System.out.println("candy.toString()= " + candy.toString());
        System.out.println("buster.toString()= " + buster.toString());
        System.out.println("million.toString()= " + million.toString());
        System.out.println("minnie.toString()= " + minnie.toString());

        System.out.println("candy.hashCode()= " + candy.hashCode());
        System.out.println("buster.hashCode()= " + buster.hashCode());
        System.out.println("million.hashCode()= " + million.hashCode());
        System.out.println("minnie.hashCode()= " + minnie.hashCode());

        System.out.println(candy.equals(buster));
        System.out.println(candy.equals(million));
        System.out.println(candy.equals(minnie));
        System.out.println(buster.equals(million));
        System.out.println(buster.equals(minnie));
        System.out.println(million.equals(minnie));
    }
}
