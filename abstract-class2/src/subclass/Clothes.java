package subclass;

import superclass.Product;

import java.util.Objects;
import java.util.Scanner;

public class Clothes extends Product {

    public Clothes() {
    }

    public Clothes(Double unitPrice, Double priceDisc, Integer code, String productName) {
        super(unitPrice, priceDisc, code, productName);
    }

    @Override
    public Double listPrice() {
        double unitPrice;
        if (super.code == 7) {
            unitPrice = 2190.0;
            setUnitPrice(unitPrice);
        } else {
            if (super.code == 8) {
                unitPrice = 2500.0;
                setUnitPrice(unitPrice);
            } else {
                if (super.code == 9) {
                    unitPrice = 1250.0;
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
        if (super.code == 7 || super.code == 9) {
            double discount = getUnitPrice() * 0.15;
            double discountPrice = getUnitPrice() - discount;
            setPriceDisc(discountPrice);
        } else {
            double price = 0.0;
            setPriceDisc(price);
        }
    }

    @Override
    public String toString() {
        return String.format(
                "Clothes { code= %d \n name= %s \n unitPrice= %5.2f \n " +
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
        Clothes that = (Clothes) obj;
        return !super.equals(obj);
    }
}
