package subclass;

import superclass.Product;

import java.util.Objects;

public class Toy extends Product {

    private Integer codeToy;

    public Toy() {
    }

    public Toy(Double unitPrice, Double totalUnitPrice, Double priceDisc, Double totalPriceDisc, Integer quantity, Integer codeToy) {
        super(unitPrice, totalUnitPrice, priceDisc, totalPriceDisc, quantity);
        this.codeToy = codeToy;
    }

    public Integer getCodeToy() {
        return codeToy;
    }

    public void setCodeToy(Integer codeToy) {
        this.codeToy = codeToy;
    }

    @Override
    public Double listPrice() {
        double unitPrice;
        if (this.codeToy == 4) {
            unitPrice = 1190.0;
            setUnitPrice(unitPrice);
        } else {
            if (this.codeToy == 5) {
                unitPrice = 1250.0;
                setUnitPrice(unitPrice);
            } else {
                if (this.codeToy == 6) {
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
    public String toString() {
        return String.format(
                "Toy { codeToy= %d \n unitPrice= %5.2f \n totalUnitPrice= %5.2f \n " +
                        "priceDisc= %5.2f \n totalPriceDisc= %5.2f \n quantityToy= %d }",
                this.codeToy, super.unitPrice, super.totalUnitPrice, super.priceDisc, super.totalPriceDisc, super.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), codeToy);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Toy that = (Toy) obj;
        return !super.equals(obj) && codeToy.equals(that.codeToy);
    }
}
