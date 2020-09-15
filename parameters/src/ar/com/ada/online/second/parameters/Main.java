package ar.com.ada.online.second.parameters;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el valor de A: ");
        int a = keyboard.nextInt();
        System.out.print("Ingrese el valor de B: ");
        int b = keyboard.nextInt();

        Result result = new Result();
        Arithmetic arithmetic = new Arithmetic();

        arithmetic.sum(result, a, b);
        result.getResultSum();
        System.out.println("El resultado de la suma es: " + result.getResultSum());

        arithmetic.subtraction(result, a, b);
        result.getResultSubtraction();
        System.out.println("El resultado de la resta es: " + result.getResultSubtraction());

        arithmetic.multiplication(result, a, b);
        result.getResultMultiplication();
        System.out.println("El resultado de la multiplicación es: " + result.getResultMultiplication());

        arithmetic.division(result, a, b);
        result.getResultDivision();
        System.out.println("El resultado de la divisón es: " + result.getResultDivision());



      /*  arithmetic.sum();
        System.out.println("El resultado de la suma es: " + arithmetic.sum());

        arithmetic.subtraction();
        System.out.println("El resultado de la resta es: " + arithmetic.subtraction());

        arithmetic.multiplication();
        System.out.println("El resultado de la multiplicación es: " + arithmetic.multiplication());

        arithmetic.division();
        System.out.println("El resultado de la divisón es: " + arithmetic.division());
*/
    }
}
