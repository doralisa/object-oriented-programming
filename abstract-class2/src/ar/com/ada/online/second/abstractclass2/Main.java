package ar.com.ada.online.second.abstractclass2;

import subclass.Clothes;
import subclass.Food;
import subclass.Tools;
import subclass.Toys;
import superclass.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        ArrayList<Product> products = new ArrayList<>();

        optionProducts(products, keyboard);
        showResults(products);
    }

    public static void optionProducts(ArrayList<Product> products, Scanner keyboard) {

        int option;

        do {

            System.out.println("Seleccione el producto:");

            System.out.println("1. Alimentos");

            System.out.println("2. Juguetes");

            System.out.println("3. Ropa");

            System.out.println("4. Herramientas");

            System.out.println("5. Para finalizar");

            System.out.print("Elija una opción: \n" );

            option = keyboard.nextInt();

            switch (option) {
                case 1:
                    Food food = createFood(keyboard);
                    products.add(food);
                    break;
                case 2:
                    Toys toys = createToys(keyboard);
                    products.add(toys);
                    break;
                case 3:
                    Clothes clothes = createClothes(keyboard);
                    products.add(clothes);
                    break;
                case 4:
                    Tools tools = createTools(keyboard);
                    products.add(tools);
                case 5:
                    calculateTotalPrice(products, keyboard);
                    break;
                default:
                    System.out.println("No existe el producto seleccionado");
                    break;
            }
        }

        while (!(option == 5));

    }

    public static Food createFood(Scanner keyboard) {
        Food food = new Food();
        System.out.print("Ingrese el codigo del alimento: ");
        double codeFood = keyboard.nextDouble();
        food.setCodeFood(codeFood);
        System.out.print("Ingrese el precio del alimento: ");
        double priceFood = keyboard.nextDouble();
        food.setUnitPrice(priceFood);
        System.out.print("Ingrese la cantidad: ");
        int quantityFood = keyboard.nextInt();
        food.setQuantity(quantityFood);
        return food;
    }

    public static Toys createToys(Scanner keyboard) {
        Toys toys = new Toys();
        System.out.print("Ingrese el codigo del juguete: ");
        double codeToys = keyboard.nextDouble();
        toys.setCodeToys(codeToys);
        System.out.print("Ingrese el precio del juguete: ");
        double priceToys = keyboard.nextDouble();
        toys.setUnitPrice(priceToys);
        return toys;
    }

    public static Clothes createClothes(Scanner keyboard) {
        Clothes clothes = new Clothes();
        System.out.print("Ingrese el codigo de la preda de ropa: ");
        double codeClothes = keyboard.nextDouble();
        clothes.setCodeClothes(codeClothes);
        System.out.print("Ingrese el precio de la ropa: ");
        double priceClothes = keyboard.nextDouble();
        clothes.setUnitPrice(priceClothes);
        System.out.print("Ingrese la cantidad: ");
        int quantityClothes = keyboard.nextInt();
        clothes.setQuantity(quantityClothes);
        return clothes;
    }

    public static Tools createTools(Scanner keyboard) {
        Tools tools = new Tools();
        System.out.print("Ingrese el codigo de la herramienta: ");
        double codeTools = keyboard.nextDouble();
        tools.setCodeTools(codeTools);
        System.out.print("Ingrese el precio de la heramienta: ");
        double priceTools = keyboard.nextDouble();
        tools.setUnitPrice(priceTools);
        System.out.print("Ingrese la cantidad: ");
        int quantityTools = keyboard.nextInt();
        tools.setQuantity(quantityTools);
        return tools;
    }

    public static void calculateTotalPrice(ArrayList<Product> products, Scanner keyboard) {

        for (Product product : products) {

            switch (product.getClass().getSimpleName()) {
                case "Food":
                    Food food = (Food) product;
                    System.out.println("Producto: Alimentos");
                    System.out.println("¿Es martes o jueves? s/n: ");
                    String answer1 = keyboard.next();
                    if (answer1.equals("s")) {
                        food.productDiscount();
                        Double totalPrice = food.getPriceDisc() * food.getQuantity();
                        food.setTotalPriceDisc(totalPrice);
                    } else {
                        Double totalPrice = food.getUnitPrice() * food.getQuantity();
                        food.setTotalPrice(totalPrice);
                    }
                    break;
                case "Toys":
                    Toys toys = (Toys) product;
                    System.out.println("Producto: Juguetes");
                    System.out.print("Ingrese la cantidad de juguetes: ");
                    int quantityToys = keyboard.nextInt();
                    toys.setQuantity(quantityToys);
                    if (quantityToys > 3 || toys.getPriceDisc() > 3000.00) {
                        toys.productDiscount();
                        Double totalPrice = toys.getPriceDisc()* toys.getQuantity();
                        toys.setTotalPriceDisc(totalPrice);
                    } else {
                        Double totalPrice = toys.getUnitPrice() * toys.getQuantity();
                        toys.setTotalPrice(totalPrice);
                    }
                    break;
                case "Clothes":
                    Clothes clothes = (Clothes) product;
                    System.out.println("Producto: Ropa");
                    System.out.println("¿Es una prenda para mujer o niño? s/n: ");
                    String answer2 = keyboard.next();
                    if (answer2.equals("s")) {
                        clothes.productDiscount();
                        Double totalPrice = clothes.getPriceDisc() * clothes.getQuantity();
                        clothes.setTotalPriceDisc(totalPrice);
                    } else {
                        Double totalPrice = clothes.getUnitPrice() * clothes.getQuantity();
                        clothes.setTotalPrice(totalPrice);
                    }
                    break;
                case "Tools":
                    Tools tools = (Tools) product;
                    System.out.println("Producto: Herramientas");
                    System.out.println("¿Paga con TDC? s/n: ");
                    String paymentMethod = keyboard.next();
                    if (paymentMethod.equals("s")) {
                        Double totalPrice = tools.getPriceDisc() * tools.getQuantity();
                        tools.setTotalPriceDisc(totalPrice);
                    } else {
                        Double totalPrice = tools.getUnitPrice() * tools.getQuantity();
                        tools.setTotalPrice(totalPrice);
                    }
                    break;
            }
        }
    }

    public static void showResults(ArrayList<Product> products) {

        int quantityProducts = 0;
        double finalPriceDisc = 0.0;
        double finalPriceNoDisc = 0.0;

        for (Product product : products) {

            quantityProducts += product.getQuantity();
            finalPriceDisc += product.getPriceDisc();
            finalPriceNoDisc += product.getUnitPrice();

            switch (product.getClass().getSimpleName()) {
                case "Food":
                    Food food = (Food) product;
                    System.out.println("Codigo: " + food.getCodeFood());
                    System.out.println("Precio: " + food.getUnitPrice());
                    System.out.println("Precio con descuento: " + food.getPriceDisc());
                    System.out.println("Cantidad: " + food.getQuantity() + "\n");
                    break;
                case "Toys":
                    Toys toys = (Toys) product;
                    System.out.println("Codigo: " + toys.getCodeToys());
                    System.out.println("Precio: " + toys.getPriceDisc());
                    System.out.println("Precio con descuento: " + toys.getPriceDisc());
                    System.out.println("Cantidad: " + toys.getQuantity() + "\n");
                    break;
                case "Clothes":
                    Clothes clothes = (Clothes) product;
                    System.out.println("Codigo: " + clothes.getCodeClothes());
                    System.out.println("Precio: " + clothes.getPriceDisc());
                    System.out.println("Precio con descuento: " + clothes.getPriceDisc());
                    System.out.println("Cantidad: " + clothes.getQuantity() + "\n");
                    break;
                case "Tools":
                    Tools tools = (Tools) product;
                    System.out.println("Codigo: " + tools.getCodeTools());
                    System.out.println("Precio: " + tools.getPriceDisc());
                    System.out.println("Precio con descuento: " + tools.getPriceDisc());
                    System.out.println("Cantidad: " + tools.getQuantity() + "\n");
                    break;
            }
        }
        System.out.println("Precio total: %5.2f" + finalPriceNoDisc);
        System.out.println("Precio total con descuento: %5.2f" + finalPriceDisc);
        System.out.println("Cantidad de Productos: %d" + quantityProducts);
    }
}