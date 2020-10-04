package subclass;

import ar.com.ada.online.second.abstractclass2.ShoppingCart;
import superclass.Product;

import java.util.Objects;

public class Food extends Product {

    public Food() {
    }

    public Food(Double unitPrice, Double priceDisc, Integer code, String productName) {
        super(unitPrice, priceDisc, code, productName);
    }

    @Override
    public Double listPrice() {
        double unitPrice;
        if (super.code == 1) {
            unitPrice = 190.0;
            setUnitPrice(unitPrice);
        } else {
            if (super.code == 2) {
                unitPrice = 150.0;
                setUnitPrice(unitPrice);
            } else {
                if (super.code == 3) {
                    unitPrice = 150.0;
                    setUnitPrice(unitPrice);
                } else {
                    System.out.println("No existe el producto");
                }}}
                return getUnitPrice();
            }

    @Override
    public void calculateDiscount() {
        if (ShoppingCart.dayOfWeek.equals("Wednesday") || ShoppingCart.dayOfWeek.equals("Friday")) {
            double discount = getUnitPrice() * 0.10;
            double discountPrice = getUnitPrice() - discount;
            setPriceDisc(discountPrice);
        } else {
            double price = 0.0;
            setPriceDisc(price);
        }
    }

    @Override
            public String toString () {
                return String.format(
                        "Food { code= %d \n name= %s \n unitPrice= %5.2f \n " +
                                "priceDisc= %5.2f }",
                        super.code, super.productName, super.unitPrice, super.priceDisc);
            }

            @Override
            public int hashCode () {
                return Objects.hash(super.hashCode());
            }

            @Override
            public boolean equals (Object obj){
                if (this == obj) return true;
                if (obj == null || getClass() != obj.getClass()) return false;
                Food that = (Food) obj;
                return !super.equals(obj);
            }
        }
