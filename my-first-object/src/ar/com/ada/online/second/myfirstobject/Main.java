package ar.com.ada.online.second.myfirstobject;

public class Main {

    public static void main(String[] args) {
        // se crean los objetos a partir de la plantilla de clase Person
        Person doralys = new Person();
        Person daniel = new Person();
        Person david = new Person();

        // settear los atributos = dar valores a los atributos
        doralys.name = "Doralys";
        doralys.lastname = "Contreras";

        daniel.name = "Daniel";
        daniel.lastname = "Blanco";

        david.name = "David";
        david.lastname = "Blanco";

        //ejecutar el metodo
        doralys.showAttributeValues();
        daniel.showAttributeValues();
        david.showAttributeValues();

        // ejemplo 2
        // se crean los objetos a partir de clase calculator

        Calculator myCalculator = new Calculator();

        // setter los atributos

        myCalculator.numberA = 10;
        myCalculator.numberB = 2;

        // ejecutar los metodos

        Integer resultSum = myCalculator.sumAttributes();
        Integer resultMultiply = myCalculator.mutiplyAttributes();

        System.out.println("EL resultado de la suma es: " + resultSum + " y de la multiplicación: " + resultMultiply);

    }
}
