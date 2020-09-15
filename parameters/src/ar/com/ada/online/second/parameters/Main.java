package ar.com.ada.online.second.parameters;

public class Main {

    public static void main(String[] args) {

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
