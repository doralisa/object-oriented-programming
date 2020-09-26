package subclass;

import superclass.Product;

import java.util.Objects;

public class Tool extends Product {

    private Integer codeTool;

    public Tool() {
    }

    public Tool(Double unitPrice, Double totalUnitPrice, Double priceDisc, Double totalPriceDisc, Integer quantity, Integer codeTool) {
        super(unitPrice, totalUnitPrice, priceDisc, totalPriceDisc, quantity);
        this.codeTool = codeTool;
    }

    public Integer getCodeTool() {
        return codeTool;
    }

    public void setCodeTool(Integer codeTool) {
        this.codeTool = codeTool;
    }

    @Override
    public Double listPrice() {
        double unitPrice;
        if (this.codeTool == 10) {
            unitPrice = 2950.0;
            setUnitPrice(unitPrice);
        } else {
            if (this.codeTool == 11) {
                unitPrice = 5700.0;
                setUnitPrice(unitPrice);
            } else {
                if (this.codeTool == 12) {
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
    public String toString() {
        return String.format(
                "Tool { codeTool= %d \n unitPrice= %5.2f \n totalUnitPrice= %5.2f \n " +
                        "priceDisc= %5.2f \n totalPriceDisc= %5.2f \n quantityTool= %d }",
                this.codeTool, super.unitPrice, super.totalUnitPrice, super.priceDisc, super.totalPriceDisc, super.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), codeTool);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Tool that = (Tool) obj;
        return !super.equals(obj) && codeTool.equals(that.codeTool);
    }
}
