package subclass;

import ar.com.ada.online.second.abstractclass2.ShoppingCart;
import superclass.Product;

import java.util.Objects;

public class Toy extends Product {

    public Toy() {
    }

    public Toy(Double unitPrice, Double priceDisc, Integer code, String productName) {
        super(unitPrice, priceDisc, code, productName);
    }

    @Override
    public Double listPrice() {
        double unitPrice;
        if (super.code == 4) {
            unitPrice = 1190.0;
            setUnitPrice(unitPrice);
        } else {
            if (super.code == 5) {
                unitPrice = 1250.0;
                setUnitPrice(unitPrice);
            } else {
                if (super.code == 6) {
                    unitPrice = 3150.0;
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
        if (ShoppingCart.quantityOfToys > 3 || ShoppingCart.partialPriceToys > 3000.00) {
            double discount = getUnitPrice() * 0.25;
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
                "Toy { code= %d \n name= %s \n unitPrice= %5.2f \n " +
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
        Toy that = (Toy) obj;
        return !super.equals(obj);
    }
}
