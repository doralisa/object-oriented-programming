package ar.com.ada.online.second;

import ar.com.ada.online.second.subclass.ElectricalVehicle;
import ar.com.ada.online.second.subclass.SportsVehicle;
import ar.com.ada.online.second.subclass.Truck;
import ar.com.ada.online.second.superclass.Vehicle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[3];
        for (int i = 0; i < vehicles.length; i++) {
            Scanner keyboard = new Scanner(System.in);

            System.out.println("Vehiculos simples \n");

            System.out.println("Ingrese la marca: ");
            String brand = keyboard.next();

            System.out.println("Ingrese el modelo: ");
            String model = keyboard.next();

            System.out.println("Ingrese el año: ");
            Integer year = keyboard.nextInt();

            vehicles[i] = new Vehicle(brand, model, year);
        }

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.technicalSheet());
        }

        ElectricalVehicle [] electricalVehicles = new ElectricalVehicle[3];
        for (int i = 0; i < electricalVehicles.length; i++) {
            Scanner keyboard = new Scanner(System.in);

            System.out.println("\n Vehiculos electricos \n");

            System.out.println("Ingrese la marca: ");
            String brand = keyboard.next();

            System.out.println("Ingrese el modelo: ");
            String model = keyboard.next();

            System.out.println("Ingrese el año: ");
            Integer year = keyboard.nextInt();

            System.out.println("Ingrese la potencia: ");
            Integer potency = keyboard.nextInt();

            electricalVehicles[i] = new ElectricalVehicle(brand, model, year,potency);
        }

        for (ElectricalVehicle electricalVehicle : electricalVehicles) {
            System.out.println(electricalVehicle.technicalSheet());
        }

        SportsVehicle [] sportsVehicles = new SportsVehicle[3];
        for (int i = 0; i < sportsVehicles.length; i++) {
            Scanner keyboard = new Scanner(System.in);

            System.out.println("\n Vehiculos deportivos \n");

            System.out.println("Ingrese la marca: ");
            String brand = keyboard.next();

            System.out.println("Ingrese el modelo: ");
            String model = keyboard.next();

            System.out.println("Ingrese el año: ");
            Integer year = keyboard.nextInt();

            System.out.println("Ingrese la rpm: ");
            Integer rpm = keyboard.nextInt();

            sportsVehicles[i] = new SportsVehicle(brand, model, year,rpm);
        }

        for (SportsVehicle sportsVehicle : sportsVehicles) {
            System.out.println(sportsVehicle.technicalSheet());
        }

        Truck [] trucks = new Truck[3];
        for (int i = 0; i < trucks.length; i++) {
            Scanner keyboard = new Scanner(System.in);

            System.out.println("\n Vehiculos camiones \n");

            System.out.println("Ingrese la marca: ");
            String brand = keyboard.next();

            System.out.println("Ingrese el modelo: ");
            String model = keyboard.next();

            System.out.println("Ingrese el año: ");
            Integer year = keyboard.nextInt();

            System.out.println("Ingrese la carga maxima: ");
            Integer maxLoad = keyboard.nextInt();

            trucks[i] = new Truck(brand, model, year, maxLoad);
        }

        for (Truck truck : trucks) {
            System.out.println(truck.technicalSheet());
        }

    }
}
