package subclass;

import ar.com.ada.online.second.abstractclass2.ShoppingCart;
import superclass.Product;

import java.util.Objects;
import java.util.Scanner;

public class Tool extends Product {

    public Tool() {
    }

    public Tool(Double unitPrice, Double priceDisc, Integer code, String productName) {
        super(unitPrice, priceDisc, code, productName);
    }

    @Override
    public Double listPrice() {
        double unitPrice;
        if (super.code == 10) {
            unitPrice = 2950.0;
            setUnitPrice(unitPrice);
        } else {
            if (super.code == 11) {
                unitPrice = 5700.0;
                setUnitPrice(unitPrice);
            } else {
                if (super.code == 12) {
                    unitPrice = 7450.0;
                    setUnitPrice(unitPrice);
                } else {
                    System.out.println("No existe el producto");
                }
            }
        }
        return getUnitPrice();
    }

    @Override
    public void calculateDiscount() {
        if (!(ShoppingCart.paymentMethod == 1)) {
            double price = 0.0;
            setPriceDisc(price);
        } else {
            double discount = getUnitPrice() * 0.5;
            double discountPrice = getUnitPrice() - discount;
            setPriceDisc(discountPrice);
        }
    }

    @Override
    public String toString() {
        return String.format(
                "Tool { code= %d \n name= %s \n unitPrice= %5.2f \n " +
                        "priceDisc= %5.2f }",
                super.code, super.productName, super.unitPrice, super.priceDisc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Tool that = (Tool) obj;
        return !super.equals(obj);
    }
}
