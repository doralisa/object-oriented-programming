package subclass;

import superclass.Product;

import java.util.Objects;

public class Clothes extends Product {

    private Integer codeClothes;

    public Clothes() {
    }

    public Clothes(Double unitPrice, Double totalUnitPrice, Double priceDisc, Double totalPriceDisc, Integer quantity, Integer codeClothes) {
        super(unitPrice, totalUnitPrice, priceDisc, totalPriceDisc, quantity);
        this.codeClothes = codeClothes;
    }

    public Integer getCodeClothes() {
        return codeClothes;
    }

    public void setCodeClothes(Integer codeClothes) {
        this.codeClothes = codeClothes;
    }

    @Override
    public Double listPrice() {
        double unitPrice;
        if (this.codeClothes == 7) {
            unitPrice = 2190.0;
            setUnitPrice(unitPrice);
        } else {
            if (this.codeClothes == 8) {
                unitPrice = 2500.0;
                setUnitPrice(unitPrice);
            } else {
                if (this.codeClothes == 9) {
                    unitPrice = 750.0;
                    setUnitPrice(unitPrice);
                } else {
                    System.out.println("No existe el producto");
                }
            }
        }
        return getUnitPrice();
    }

    @Override
    public String toString() {
        return String.format(
                "Clothes { codeClothes= %d \n unitPrice= %5.2f \n totalUnitPrice= %5.2f \n " +
                        "priceDisc= %5.2f \n totalPriceDisc= %5.2f \n quantityClothes= %d }",
                this.codeClothes, super.unitPrice, super.totalUnitPrice, super.priceDisc, super.totalPriceDisc, super.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), codeClothes);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Clothes that = (Clothes) obj;
        return !super.equals(obj) && codeClothes.equals(that.codeClothes);
    }
}
