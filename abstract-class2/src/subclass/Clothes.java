package subclass;

import superclass.Product;

import java.util.Objects;

public class Clothes extends Product {

    private Double codeClothes;

    public Clothes() {
    }

    public Clothes(Double price, Integer quantity, Double codeClothes) {
        super(price);
        super.quantity = quantity;
        this.codeClothes = codeClothes;
    }

    public Double getCodeClothes() {
        return codeClothes;
    }

    public void setCodeClothes(Double codeClothes) {
        this.codeClothes = codeClothes;
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
        return Objects.hash(super.hashCode(), codeClothes, getPriceDisc());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Clothes that = (Clothes) obj;
        return !super.equals(obj) && codeClothes.equals(that.codeClothes);
    }

    @Override
    public String toString() {
        return String.format("Clothes { Codigo producto= %5.2f \n Precio= %5.2f \n Cantidad= %d }",
                this.codeClothes, super.priceDisc, quantity);
    }
}
