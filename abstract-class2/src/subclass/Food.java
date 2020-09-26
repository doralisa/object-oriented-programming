package subclass;

import superclass.Product;

import java.util.Objects;

public class Food extends Product {

    private Double codeFood;

    public Food() {
    }

    public Food(Double price, Integer quantity, Double codeFood) {
        super.priceDisc = price;
        super.quantity = quantity;
        this.codeFood = codeFood;
    }

    public Double getCodeFood() {
        return codeFood;
    }

    public void setCodeFood(Double codeFood) {
        this.codeFood = codeFood;
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
        return Objects.hash(super.hashCode(), codeFood, super.priceDisc);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Food that = (Food) obj;
        return !super.equals(obj) && codeFood.equals(that.codeFood);
    }

    @Override
    public String toString() {
        return String.format(
                "Food { Codigo producto= %5.2f \n Precio= %5.2f \n Cantidad= %d }",
                this.codeFood, super.priceDisc, quantity);
    }
}
