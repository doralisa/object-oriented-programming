package ar.com.ada.online.second.parameters;

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
        int result = a + b;
        calculateSum.setResultSum(result);
    }

    public static void sum(Result calculateSum, Integer a, Integer b) {
        Integer result = a + b;
        calculateSum.setResultSum(result);

    public static void sum(Result calculateSum, double a, double b) {
        double result = a + b;
        calculateSum.setResultSum(result);

    }
     */
}
