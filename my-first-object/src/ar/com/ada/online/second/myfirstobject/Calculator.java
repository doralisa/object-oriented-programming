package ar.com.ada.online.second.myfirstobject;

public class Calculator {
    Integer numberA;
    Integer numberB;

    Integer sumAttributes() {
        Integer result = this.numberA + this.numberB;
        return result;
    }

    Integer mutiplyAttributes() {
        Integer result = numberA * numberB;
        return result;
    }

}
