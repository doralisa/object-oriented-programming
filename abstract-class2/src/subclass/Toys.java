package subclass;

import superclass.Product;

import java.util.Objects;

public class Toys extends Product {

    private Double codeToys;

    public Toys() {
    }

    public Toys(Double price, Integer quantity, Double codeToys) {
        super(price);
        super.quantity = quantity;
        this.codeToys = codeToys;
    }

    public Double getCodeToys() {
        return codeToys;
    }

    public void setCodeToys(Double codeToys) {
        this.codeToys = codeToys;
    }

    @Override
    public Double productDiscount() {
        double discount;
        double discountPrice;
        discount = super.unitPrice * 0.10;
        discountPrice = super.unitPrice - discount;
        return setPriceDisc(discountPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), codeToys, getPriceDisc());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Toys that = (Toys) obj;
        return !super.equals(obj) && codeToys.equals(that.codeToys);
    }

    @Override
    public String toString() {
        return String.format(
                "Toys { Codigo producto= %5.2f \n Precio= %5.2f \n Cantidad= %d }",
                this.codeToys, super.priceDisc, quantity);
    }
}
