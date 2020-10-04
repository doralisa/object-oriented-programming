package ar.com.ada.online.second.abstractclass2;

import subclass.Clothes;
import subclass.Food;
import subclass.Tool;
import subclass.Toy;
import superclass.Product;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ShoppingCart {

    public static String dayOfWeek;
    public static Integer quantityOfToys = 0;
    public static Double partialPriceToys = 0.0;
    public static Integer paymentMethod;
    private ArrayList<Product> products = new ArrayList<>();

    public ShoppingCart() {
        DateFormat formatter = new SimpleDateFormat("EEEE", Locale.US);
        Date now = new Date();
        ShoppingCart.dayOfWeek = formatter.format(now);
    }

    public ArrayList<Product> getProducts () { return products;}

    public void addProduct(Product product) {
        if (product instanceof Toy) {
            quantityOfToys++;
            partialPriceToys = partialPriceToys + product.getUnitPrice();
        }
        this.products.add(product);
    }

    public static void calculatePrice(ArrayList<Product> products, Scanner keyboard) {

        System.out.println("Seleccione el medio de pago: ");
        System.out.println("[1] TDC [2] TDD [3] Efectivo [4] Mercado pago");
        paymentMethod = keyboard.nextInt();

        for (Product product : products) {

            switch (product.getClass().getSimpleName()) {
                case "Food":
                    Food food = (Food) product;
                    food.calculateDiscount();
                    break;
                case "Toy":
                    Toy toy = (Toy) product;
                    toy.calculateDiscount();
                    break;
                case "Clothes":
                    Clothes clothes = (Clothes) product;
                    clothes.calculateDiscount();
                    break;
                case "Tool":
                    Tool tool = (Tool) product;
                    tool.calculateDiscount();
                    break;
            }
        }

    }

    public static void showTicket(ArrayList<Product> products) {

        int quantityProducts = products.size();
        double finalPriceDisc = 0.0;
        double finalPriceNoDisc = 0.0;

        System.out.println("\n----DETALLE DE COMPRA POR PRODUCTO----\n");

        for (Product product : products) {

            finalPriceDisc += product.getPriceDisc();
            finalPriceNoDisc += product.getUnitPrice();

            switch (product.getClass().getSimpleName()) {
                case "Food":
                    Food food = (Food) product;
                    System.out.println("Codigo: " + food.getCode());
                    System.out.println("Producto: " + food.getProductName());
                    System.out.println("Precio real: " + food.getUnitPrice());
                    System.out.println("Precio con descuento: " + food.getPriceDisc());
                    break;
                case "Toy":
                    Toy toy = (Toy) product;
                    System.out.println("Codigo: " + toy.getCode());
                    System.out.println("Producto: " + toy.getProductName());
                    System.out.println("Precio real: " + toy.getUnitPrice());
                    System.out.println("Precio con descuento: " + toy.getPriceDisc());
                    break;
                case "Clothes":
                    Clothes clothes = (Clothes) product;
                    System.out.println("Codigo: " + clothes.getCode());
                    System.out.println("Producto: " + clothes.getProductName());
                    System.out.println("Precio real: " + clothes.getUnitPrice());
                    System.out.println("Precio con descuento: " + clothes.getPriceDisc());
                    break;
                case "Tool":
                    Tool tool = (Tool) product;
                    System.out.println(" Codigo: " + tool.getCode());
                    System.out.println("Producto: " + tool.getProductName());
                    System.out.println("Precio real: " + tool.getUnitPrice());
                    System.out.println("Precio con descuento: " + tool.getPriceDisc());
                    break;
            }
        }
        System.out.println("\n-----TOTAL DE LA COMPRA-----\n");
        System.out.println("Cantidad de Productos: " + quantityProducts);
        System.out.println("Total precio real: " + finalPriceNoDisc);
        System.out.println("Total precio con descuento: " + finalPriceDisc);

    }
}
