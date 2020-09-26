package superclass;

public abstract class Product {

    protected Double priceDisc;
    protected Double unitPrice;
    protected Double totalPrice;
    protected Double totalPriceDisc;
    protected Integer quantity;

    public Product() {
    }

    public Product(Double priceDisc) {
        this.priceDisc = priceDisc;
    }

    public Double getPriceDisc() {
        return priceDisc;
    }

    public Double setPriceDisc(Double price) {
        this.priceDisc = priceDisc;
        return priceDisc;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
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

    public abstract Double productDiscount();

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product that = (Product) obj;
        return priceDisc.equals(that.priceDisc);
    }

    @Override
    public String toString() {
        return String.format("Product {Price= %5.2f, Quantity= %5.2f}",
                priceDisc, quantity);
    }
}

