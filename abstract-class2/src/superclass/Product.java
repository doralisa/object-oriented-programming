package superclass;

public abstract class Product {

    protected Double unitPrice;
    protected Double totalUnitPrice;
    protected Double priceDisc;
    protected Double totalPriceDisc;
    protected Integer quantity;

    public Product() {
    }

    public Product(Double unitPrice, Double totalUnitPrice, Double priceDisc, Double totalPriceDisc, Integer quantity) {
        this.unitPrice = unitPrice;
        this.totalUnitPrice = totalUnitPrice;
        this.priceDisc = priceDisc;
        this.totalPriceDisc = totalPriceDisc;
        this.quantity = quantity;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getTotalUnitPrice() {
        return totalUnitPrice;
    }

    public void setTotalUnitPrice(Double totalUnitPrice) {
        this.totalUnitPrice = totalUnitPrice;
    }

    public Double getPriceDisc() {
        return priceDisc;
    }

    public Double setPriceDisc(Double priceDisc) {
        this.priceDisc = priceDisc;
        return priceDisc;
    }

    public Double getTotalPriceDisc() {
        return totalPriceDisc;
    }

    public void setTotalPriceDisc(Double totalPriceDisc) {
        this.totalPriceDisc = totalPriceDisc;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public abstract Double listPrice();

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product that = (Product) obj;
        return unitPrice.equals(that.unitPrice) && totalUnitPrice.equals(that.totalUnitPrice)
                && priceDisc.equals(that.priceDisc) && totalPriceDisc.equals(that.totalPriceDisc);
    }

    @Override
    public String toString() {
        return String.format("Product {unitPrice= %5.2f \n totalUnitPrice= %5.2f \n " +
                        "priceDisc= %5.2f \n totalPriceDisc= %5.2f \n quantity= %d}",
                unitPrice, totalUnitPrice, priceDisc, totalPriceDisc, quantity);
    }
}

