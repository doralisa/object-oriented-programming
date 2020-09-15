package ar.com.ada.online.second.parameters;

<<<<<<< HEAD
import java.util.Scanner;

=======
>>>>>>> 76ca9e80108add7b78c5961eec156988253ce1ed
public class Main {

    public static void main(String[] args) {

<<<<<<< HEAD
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
=======
        Result result = new Result();
        Arithmetic arithmetic = new Arithmetic();

        result.setResultSum(arithmetic.sum());
        result.getResultSum();
        System.out.println("El resultado de la suma es: " + result.getResultSum());

        result.setResultSubtraction(arithmetic.subtraction());
        result.getResultSubtraction();
        System.out.println("El resultado de la resta es: " + result.getResultSubtraction());

        result.setResultMultiplication(arithmetic.multiplication());
        result.getResultMultiplication();
        System.out.println("El resultado de la multiplicación es: " + result.getResultMultiplication());

        result.setResultDivision(arithmetic.division());
>>>>>>> 76ca9e80108add7b78c5961eec156988253ce1ed
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
