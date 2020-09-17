package superclass;

import java.util.Objects;

public class Vehicle {

    protected String brand;
    protected String model;
    protected Integer year;

    public Vehicle () {}

    public Vehicle (String brand, String model, Integer year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String technicalSheet() {
        return String.format("Ficha técnica: marca= %s, modelo= %s, año= %d. " +
                        "Este vehiculo no tiene categoria",
                this.brand, this.model, this.year);
    }

    @Override
    public String toString() {
        return String.format(
                "Vehicle { brand= %s, model= %s, year= %d }",
                this.brand, this.model, this.year);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle that = (Vehicle) o;
        return brand.equals(that.brand) &&
                model.equals(that.model) &&
                year.equals(that.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year);
    }

}
