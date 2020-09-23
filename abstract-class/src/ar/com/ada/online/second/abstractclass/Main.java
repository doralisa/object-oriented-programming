package ar.com.ada.online.second.abstractclass;

import ar.com.ada.online.second.abstractclass.subclass.Circle;
import ar.com.ada.online.second.abstractclass.subclass.Rectangle;
import ar.com.ada.online.second.abstractclass.subclass.Triangle;
import ar.com.ada.online.second.abstractclass.superclass.Figure;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Figure> figures = new ArrayList<>();

        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            System.out.println("De la siguientes figuras: ");

            System.out.println("1. Circulo");

            System.out.println("2. Triangulo");

            System.out.println("3. Rectangulo");

            System.out.println("Elija una opción: ");

            int option = keyboard.nextInt();

            switch (option) {
                case 1:
                    Circle circle = createCircle(keyboard);
                    figures.add(circle);
                    break;
                case 2:
                    Triangle triangle = createTriangle(keyboard);
                    figures.add(triangle);
                    break;
                case 3:
                    Rectangle rectangle = createRectangle(keyboard);
                    figures.add(rectangle);
                default:
                    System.out.println("............");
                    ;
            }
        }
        showResults(figures);
        equalsFigure(figures);
    }

    public static Circle createCircle(Scanner keyboard) {
        Circle circle = new Circle();
        System.out.println("Ingrese los datos de la figura");
        System.out.print("Radio: ");
        Double radio = keyboard.nextDouble();
        circle.setRadio(radio);
        return circle;
    }

    public static Triangle createTriangle(Scanner keyboard) {
        Triangle triangle = new Triangle();
        System.out.println("Ingrese los datos de la figura");
        System.out.print("Base: ");
        Double baseTriangle = keyboard.nextDouble();
        System.out.print("Altura: ");
        Double heightTriangle = keyboard.nextDouble();
        triangle.setBase(baseTriangle);
        triangle.setHeight(heightTriangle);
        return triangle;
    }

    public static Rectangle createRectangle(Scanner keyboard) {
        Rectangle rectangle = new Rectangle();
        System.out.println("Ingrese los datos de la figura");
        System.out.print("Base: ");
        Double baseRectangle = keyboard.nextDouble();
        System.out.print("Altura: ");
        Double heightRectangle = keyboard.nextDouble();
        rectangle.setBase(baseRectangle);
        rectangle.setHeight(heightRectangle);
        return rectangle;
    }

    public static void showResults(ArrayList<Figure> figures) {

        for (Figure figure : figures) {
            figure.areaCalculation();

            switch (figure.getClass().getSimpleName()) {
                case "Circle":
                    Circle circle = (Circle) figure;
                    System.out.println("\n" + circle.figureDescription());
                    break;

                case "Triangle":
                    Triangle triangle = (Triangle) figure;
                    System.out.println("\n" + triangle.figureDescription() + triangle.areaCalculation());
                    break;

                case "Rectangle":
                    Rectangle rectangle = (Rectangle) figure;
                    System.out.println("\n" + rectangle.figureDescription() + rectangle.areaCalculation());
                    break;
            }
            figure.getArea();
        }
        if (equalsFigure(figures)) {
            System.out.println("Existen figuras iguales");
        } else {
            System.out.println("No existen figuras iguales");
        }
    }

    public static Boolean equalsFigure(ArrayList<Figure> figures) {
        Boolean equals = null;
        for (int i = 0; i < figures.size(); i++) {
            Figure figure = figures.get(i);
            for (int j = i + 1; j < figures.size(); j++) {
                equals = figure.equals(figures.get(j));
                if (equals) return equals;
            }
        }
        return equals;
    }
}


