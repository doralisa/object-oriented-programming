package superclass;

public abstract class Product {

    protected Double unitPrice;
    protected Double priceDisc;
    protected Integer code;
    protected String productName;

    public Product() {
    }

    public Product(Double unitPrice, Double priceDisc, Integer code, String productName) {
        this.unitPrice = unitPrice;
        this.priceDisc = priceDisc;
        this.code = code;
        this.productName = productName;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getPriceDisc() {
        return priceDisc;
    }

    public Double setPriceDisc(Double priceDisc) {
        this.priceDisc = priceDisc;
        return priceDisc;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public abstract Double listPrice();

    public abstract void calculateDiscount();

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product that = (Product) obj;
        return unitPrice.equals(that.unitPrice) && priceDisc.equals(that.priceDisc);
    }

    @Override
    public String toString() {
        return String.format("Product { code= %d \n unitPrice= %5.2f \n " +
                        "priceDisc= %5.2f }", code, unitPrice, priceDisc);
    }
}

