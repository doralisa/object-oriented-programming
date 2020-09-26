package ar.com.ada.online.second.abstractclass2;

import subclass.Clothes;
import subclass.Food;
import subclass.Tool;
import subclass.Toy;
import superclass.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Tienda: TE SACAMOS UN OJO");

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

            System.out.print("Elija una opción: " );

            option = keyboard.nextInt();

            switch (option) {
                case 1:
                    Food food = createFood(keyboard);
                    products.add(food);
                    break;
                case 2:
                    Toy toy = createToys(keyboard);
                    products.add(toy);
                    break;
                case 3:
                    Clothes clothes = createClothes(keyboard);
                    products.add(clothes);
                    break;
                case 4:
                    Tool tool = createTools(keyboard);
                    products.add(tool);
                    break;
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
        System.out.print("Seleccione el codigo del alimento: ");
        System.out.println("[1] [2] [3]");
        int codeFood = keyboard.nextInt();
        food.setCodeFood(codeFood);
        double priceFood = food.listPrice();
        food.setUnitPrice(priceFood);
        return food;
    }

    public static Toy createToys(Scanner keyboard) {
        Toy toy = new Toy();
        System.out.print("Seleccione el codigo del juguete: ");
        System.out.println("[4] [5] [6]");
        int codeToy = keyboard.nextInt();
        toy.setCodeToy(codeToy);
        double priceToy = toy.listPrice();
        toy.setUnitPrice(priceToy);
        return toy;
    }

    public static Clothes createClothes(Scanner keyboard) {
        Clothes clothes = new Clothes();
        System.out.print("Seleccione el codigo de la preda de ropa: ");
        System.out.println("[7] [8] [9]");
        int codeClothes = keyboard.nextInt();
        clothes.setCodeClothes(codeClothes);
        double priceClothes = clothes.listPrice();
        clothes.setUnitPrice(priceClothes);
        return clothes;
    }

    public static Tool createTools(Scanner keyboard) {
        Tool tool = new Tool();
        System.out.print("Ingrese el codigo de la herramienta: ");
        System.out.println("[10] [11] [12]");
        int codeTools = keyboard.nextInt();
        tool.setCodeTool(codeTools);
        double priceTools = tool.listPrice();
        tool.setUnitPrice(priceTools);
        return tool;
    }

    public static void calculateTotalPrice(ArrayList<Product> products, Scanner keyboard) {

        for (Product product : products) {

            switch (product.getClass().getSimpleName()) {
                case "Food":
                    Food food = (Food) product;
                    System.out.println("\n Producto: Alimento \n");
                    System.out.println("¿Es martes o jueves? s/n: ");
                    String answer1 = keyboard.next();
                    System.out.println("Ingrese la cantidad: ");
                    int quantityFood = keyboard.nextInt();
                    food.setQuantity(quantityFood);
                    if (answer1.equals("s")) {
                        double discount = food.getUnitPrice() * 0.10;
                        double discountPrice = food.getUnitPrice() - discount;
                        food.setPriceDisc(discountPrice);
                        double totalPriceDisc = discountPrice * food.getQuantity();
                        food.setTotalPriceDisc(totalPriceDisc);
                        double totalUnitPrice = food.getUnitPrice() * food.getQuantity();
                        food.setTotalUnitPrice(totalUnitPrice);
                    } else {
                        double totalUnitPrice = food.getUnitPrice() * food.getQuantity();
                        food.setTotalUnitPrice(totalUnitPrice);
                        food.setTotalPriceDisc(food.getTotalUnitPrice());
                    }
                    break;
                case "Toy":
                    Toy toy = (Toy) product;
                    System.out.println("\n Producto: Juguete \n");
                    System.out.println("Ingrese la cantidad: ");
                    int quantityToy = keyboard.nextInt();
                    toy.setQuantity(quantityToy);
                    double totalUnitPriceToy = toy.getUnitPrice() * toy.getQuantity();
                    toy.setTotalUnitPrice(totalUnitPriceToy);
                    if (quantityToy > 3 || toy.getTotalUnitPrice() > 3000.00) {
                        double discount = toy.getUnitPrice() * 0.25;
                        double discountPrice = toy.getUnitPrice() - discount;
                        toy.setPriceDisc(discountPrice);
                        double totalPriceDisc = discountPrice * toy.getQuantity();
                        toy.setTotalPriceDisc(totalPriceDisc);
                    } else {
                        toy.getTotalUnitPrice();
                        toy.setTotalPriceDisc(toy.getTotalUnitPrice());
                    }
                    break;
                case "Clothes":
                    Clothes clothes = (Clothes) product;
                    System.out.println("\n Producto: Ropa \n");
                    System.out.println("¿Es una prenda para mujer o niño? s/n: ");
                    String answer2 = keyboard.next();
                    System.out.println("Ingrese la cantidad: ");
                    int quantityClothes = keyboard.nextInt();
                    clothes.setQuantity(quantityClothes);
                    if (answer2.equals("s")) {
                        double discount = clothes.getUnitPrice() * 0.15;
                        double discountPrice = clothes.getUnitPrice() - discount;
                        clothes.setPriceDisc(discountPrice);
                        double totalPriceDisc = discountPrice * clothes.getQuantity();
                        clothes.setTotalPriceDisc(totalPriceDisc);
                        double totalUnitPrice = clothes.getUnitPrice() * clothes.getQuantity();
                        clothes.setTotalUnitPrice(totalUnitPrice);
                    } else {
                        double totalUnitPrice = clothes.getUnitPrice() * clothes.getQuantity();
                        clothes.setTotalUnitPrice(totalUnitPrice);
                        clothes.setTotalPriceDisc(clothes.getTotalUnitPrice());
                    }
                    break;
                case "Tool":
                    Tool tool = (Tool) product;
                    System.out.println("\n Producto: Herramienta \n");
                    System.out.println("¿Paga con TDC? s/n: ");
                    String paymentMethod = keyboard.next();
                    System.out.println("Ingrese la cantidad: ");
                    int quantityTools = keyboard.nextInt();
                    tool.setQuantity(quantityTools);
                    if (paymentMethod.equals("s")) {
                        double discount = tool.getUnitPrice() * 0.5;
                        double discountPrice = tool.getUnitPrice() - discount;
                        tool.setPriceDisc(discountPrice);
                        double totalPriceDisc = discountPrice * tool.getQuantity();
                        tool.setTotalPriceDisc(totalPriceDisc);
                        double totalUnitPrice = tool.getUnitPrice() * tool.getQuantity();
                        tool.setTotalUnitPrice(totalUnitPrice);
                    } else {
                        double totalUnitPrice = tool.getUnitPrice() * tool.getQuantity();
                        tool.setTotalUnitPrice(totalUnitPrice);
                        tool.setTotalPriceDisc(tool.getTotalUnitPrice());
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
            finalPriceDisc += product.getTotalPriceDisc();
            finalPriceNoDisc += product.getTotalUnitPrice();

            switch (product.getClass().getSimpleName()) {
                case "Food":
                    Food food = (Food) product;
                    System.out.println("\n Codigo: " + food.getCodeFood());
                    System.out.println("Precio real: " + food.getUnitPrice());
                    System.out.println("Precio con descuento: " + food.getPriceDisc());
                    System.out.println("Cantidad: " + food.getQuantity());
                    System.out.println("Total precio sin descuento: " + food.getTotalUnitPrice());
                    System.out.println("Total precio con descuento: " + food.getTotalPriceDisc() + "\n");
                    break;
                case "Toy":
                    Toy toy = (Toy) product;
                    System.out.println("Codigo: " + toy.getCodeToy());
                    System.out.println("Precio real: " + toy.getUnitPrice());
                    System.out.println("Precio con descuento: " + toy.getPriceDisc());
                    System.out.println("Cantidad: " + toy.getQuantity());
                    System.out.println("Total precio sin descuento: " + toy.getTotalUnitPrice());
                    System.out.println("Total precio con descuento: " + toy.getTotalPriceDisc() + "\n");
                    break;
                case "Clothes":
                    Clothes clothes = (Clothes) product;
                    System.out.println("Codigo: " + clothes.getCodeClothes());
                    System.out.println("Precio real: " + clothes.getUnitPrice());
                    System.out.println("Precio con descuento: " + clothes.getPriceDisc());
                    System.out.println("Cantidad: " + clothes.getQuantity());
                    System.out.println("Total precio sin descuento: " + clothes.getTotalUnitPrice());
                    System.out.println("Total precio con descuento: " + clothes.getTotalPriceDisc() + "\n");
                    break;
                case "Tool":
                    Tool tool = (Tool) product;
                    System.out.println(" Codigo: " + tool.getCodeTool());
                    System.out.println("Precio real: " + tool.getUnitPrice());
                    System.out.println("Precio con descuento: " + tool.getPriceDisc());
                    System.out.println("Cantidad: " + tool.getQuantity());
                    System.out.println("Total precio sin descuento: " + tool.getTotalUnitPrice());
                    System.out.println("Total precio con descuento: " + tool.getTotalPriceDisc() + "\n");
                    System.out.println("Cantidad: " + tool.getQuantity() + "\n");
                    break;
            }
        }
        System.out.println("-----RECIBO FINAL-----");
        System.out.println("Precio real total: " + finalPriceNoDisc);
        System.out.println("Precio total con descuento: " + finalPriceDisc);
        System.out.println("Cantidad de Productos: " + quantityProducts);
    }
}