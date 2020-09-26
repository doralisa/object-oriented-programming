package subclass;

import superclass.Product;

import java.util.Objects;

public class Tools extends Product {

    private Double codeTools;

    public Tools() {
    }

    public Tools(Double price, Integer quantity, Double codeTools) {
        super(price);
        super.quantity = quantity;
        this.codeTools = codeTools;
    }

    public Double getCodeTools() {
        return codeTools;
    }

    public void setCodeTools(Double codeTools) {
        this.codeTools = codeTools;
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
        return Objects.hash(super.hashCode(), codeTools, getPriceDisc());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Tools that = (Tools) obj;
        return !super.equals(obj) && codeTools.equals(that.codeTools);
    }

    @Override
    public String toString() {
        return String.format("Tools { Codigo producto= %5.2f \n Precio= %5.2f \n Cantidad= %d }",
                this.codeTools, super.priceDisc, quantity);
    }
}
