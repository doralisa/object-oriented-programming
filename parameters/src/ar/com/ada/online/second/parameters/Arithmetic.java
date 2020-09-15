package ar.com.ada.online.second.parameters;

<<<<<<< HEAD
public class Arithmetic {

    public static void sum(Result calculateSum, int a, int b) {
        int result = a + b;
        calculateSum.setResultSum(result);
    }

    public static void subtraction(Result calculateSubtraction, int a, int b) {
        int result = a - b;
        calculateSubtraction.setResultSubtraction(result);
    }

    public static void multiplication(Result calculateMultiplication, int a, int b) {
        int result = a * b;
        calculateMultiplication.setResultMultiplication(result);
    }

    public static void division(Result calculateDivison, int a, int b) {
        int result = a / b;
        calculateDivison.setResultDivision(result);
    }

    /* Sobrecarga de los metodos
    public static void sum(Result calculateSum, int a, int b) {
        int result = this.a + this.b;
=======
import java.util.Scanner;

public class Arithmetic {

    Scanner keyboard = new Scanner(System.in);

    public Integer sum() {
        System.out.print("Ingrese el valor de a para la suma: ");
        int a = keyboard.nextInt();
        System.out.print("Ingrese el valor de b para la suma: ");
        int b = keyboard.nextInt();
        Integer result;
        result = a + b;
        return result;
    }

    public Integer subtraction() {
        System.out.print("Ingrese el valor de a para la resta: ");
        int a = keyboard.nextInt();
        System.out.print("Ingrese el valor de b para la resta: ");
        int b = keyboard.nextInt();
        Integer result;
        result = a - b;
        return result;
    }

    public Integer multiplication() {
        System.out.print("Ingrese el valor de a para la multiplicación: ");
        int a = keyboard.nextInt();
        System.out.print("Ingrese el valor de b para la multiplicación: ");
        int b = keyboard.nextInt();
        Integer result;
        result = a * b;
        return result;
    }

    public Integer division() {
        System.out.print("Ingrese el valor de a para la division: ");
        int a = keyboard.nextInt();
        System.out.print("Ingrese el valor de b para la division: ");
        int b = keyboard.nextInt();
        Integer result;
        result = a / b;
        return result;
    }

    /* Sobrecarga de los metodos
    public Integer sum(int a, int b) {
        Integer result;
        result = this.a + this.b;
>>>>>>> 76ca9e80108add7b78c5961eec156988253ce1ed
        return result;
    }

    public Integer sum(Integer a, Integer b) {
        Integer result;
        result = this.a + this.b;
        return result;
    }
     */
}
