package subclass;

import superclass.Product;

import java.util.Objects;

public class Food extends Product {

    private Integer codeFood;

    public Food() {
    }

    public Food(Double unitPrice, Double totalUnitPrice, Double priceDisc, Double totalPriceDisc, Integer quantity, Integer codeFood) {
        super(unitPrice, totalUnitPrice, priceDisc, totalPriceDisc, quantity);
        this.codeFood = codeFood;
    }

    public Integer getCodeFood() {
        return codeFood;
    }

    public void setCodeFood(Integer codeFood) {
        this.codeFood = codeFood;
    }

    @Override
    public Double listPrice() {
        double unitPrice;
        if (this.codeFood == 1) {
            unitPrice = 190.0;
            setUnitPrice(unitPrice);
        } else {
            if (this.codeFood == 2) {
                unitPrice = 150.0;
                setUnitPrice(unitPrice);
            } else {
                if (this.codeFood == 3) {
                    unitPrice = 150.0;
                    setUnitPrice(unitPrice);
                } else {
                    System.out.println("No existe el producto");
                }}}
                return getUnitPrice();
            }

            @Override
            public String toString () {
                return String.format(
                        "Food { codeFood= %d \n unitPrice= %5.2f \n totalUnitPrice= %5.2f \n " +
                                "priceDisc= %5.2f \n totalPriceDisc= %5.2f \n quantityFood= %d }",
                        this.codeFood, super.unitPrice, super.totalUnitPrice, super.priceDisc, super.totalPriceDisc, super.quantity);
            }

            @Override
            public int hashCode () {
                return Objects.hash(super.hashCode(), codeFood);
            }

            @Override
            public boolean equals (Object obj){
                if (this == obj) return true;
                if (obj == null || getClass() != obj.getClass()) return false;
                Food that = (Food) obj;
                return !super.equals(obj) && codeFood.equals(that.codeFood);
            }
        }
