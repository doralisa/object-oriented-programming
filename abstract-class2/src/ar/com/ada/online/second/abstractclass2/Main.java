package ar.com.ada.online.second.abstractclass2;

import subclass.*;
import superclass.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Tienda: TE SACAMOS UN OJO");

        Scanner keyboard = new Scanner(System.in);

        ShoppingCart shoppingCart = new ShoppingCart();

        ArrayList<Product> products = shoppingCart.getProducts();

        optionProducts(products, shoppingCart, keyboard);

        ShoppingCart.showTicket(products);
    }

    public static void optionProducts(ArrayList<Product> products, ShoppingCart shoppingCart, Scanner keyboard) {

        int option;

        System.out.println("----INVENTARIO DE PRODUCTOS-----");

        do {

            System.out.println("De las siguientes categorias:");

            System.out.println("1. Alimentos");

            System.out.println("2. Juguetes");

            System.out.println("3. Ropa");

            System.out.println("4. Herramientas");

            System.out.println("5. Para finalizar");

            System.out.print("Elija una opción: ");

            option = keyboard.nextInt();

            switch (option) {
                case 1:
                    Food food = foodItems(keyboard);
                    if (food != null) {
                    shoppingCart.addProduct(food);}
                    break;
                case 2:
                    Toy toy = toysItems(keyboard);
                    if (toy != null) {
                    shoppingCart.addProduct(toy);}
                    break;
                case 3:
                    Clothes clothes = clothesItems(keyboard);
                    if (clothes != null) {
                    shoppingCart.addProduct(clothes);}
                    break;
                case 4:
                    Tool tool = toolItems(keyboard);
                    if (tool != null) {
                    shoppingCart.addProduct(tool);}
                    break;
                case 5:
                    ShoppingCart.calculatePrice(products, keyboard);
                    break;
                default:
                    System.out.println("Categoria invalida");
                    break;
            }
        }

        while (!(option == 5));

    }

    public static Food foodItems(Scanner keyboard) {
        Food food = new Food();
        System.out.print("Seleccione el codigo del alimento: ");
        System.out.println("[1] Arroz [2] Fideos [3] Harina");
        int codeFood = keyboard.nextInt();
        food.setCode(codeFood);
        double priceFood = food.listPrice();
        food.setUnitPrice(priceFood);
        switch (codeFood) {
            case 1:
                food.setProductName("Arroz");
                break;
            case 2:
                food.setProductName("Fideos");
                break;
            case 3:
                food.setProductName("Harina");
                break;
            default:
                System.out.println("Opcion invalida");
                food = null;
                break;
        }
        return food;
    }

    public static Toy toysItems(Scanner keyboard) {
        Toy toy = new Toy();
        System.out.print("Seleccione el codigo del juguete: ");
        System.out.println("[4] Oso de peluche [5] Barbie [6] Set de cocina");
        int codeToy = keyboard.nextInt();
        toy.setCode(codeToy);
        double priceToy = toy.listPrice();
        toy.setUnitPrice(priceToy);
        switch (codeToy) {
            case 4:
                toy.setProductName("Oso de peluche");
                break;
            case 5:
                toy.setProductName("Barbie");
                break;
            case 6:
                toy.setProductName("Set de cocina");
                break;
            default:
                System.out.println("Opcion invalida");
                toy = null;
                break;
        }
        return toy;
    }

    public static Clothes clothesItems(Scanner keyboard) {
        Clothes clothes = new Clothes();
        System.out.print("Seleccione el codigo de la preda de ropa: ");
        System.out.println("[7] Remera niño [8] Jeans [9] Remera mujer");
        int codeClothes = keyboard.nextInt();
        clothes.setCode(codeClothes);
        double priceClothes = clothes.listPrice();
        clothes.setUnitPrice(priceClothes);
        switch (codeClothes) {
            case 7:
                clothes.setProductName("Remera niño");
                break;
            case 8:
                clothes.setProductName("Jeans");
                break;
            case 9:
                clothes.setProductName("Remera mujer");
                break;
            default:
                System.out.println("Opcion invalida");
                clothes = null;
                break;
        }
        return clothes;
    }

    public static Tool toolItems(Scanner keyboard) {
        Tool tool = new Tool();
        System.out.print("Ingrese el codigo de la herramienta: ");
        System.out.println("[10] Martillo [11] Set destornilladores [12] Taladro");
        int codeTools = keyboard.nextInt();
        tool.setCode(codeTools);
        double priceTools = tool.listPrice();
        tool.setUnitPrice(priceTools);
        switch (codeTools) {
            case 10:
                tool.setProductName("Martillo");
                break;
            case 11:
                tool.setProductName("Set destornilladores");
                break;
            case 12:
                tool.setProductName("Taladro");
                break;
            default:
                System.out.println("Opcion invalida");
                tool = null;
                break;
        }
        return tool;
    }


}