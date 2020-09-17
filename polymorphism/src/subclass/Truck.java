package subclass;

import superclass.Vehicle;

import java.util.Objects;

public class Truck extends Vehicle {

    private Integer maxLoad;

    public Truck () {}

    public Truck (Integer maxLoad) {
        this.maxLoad = maxLoad;
    }

    public Truck (String brand, String model, Integer year, Integer maxLoad) {
        super(brand, model, year);
        this.maxLoad = maxLoad;
    }

    public Integer getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(Integer maxLoad) {
        this.maxLoad = maxLoad;
    }

    @Override
    public String technicalSheet() {
        String sentence;
        if (maxLoad <= 100) {
            sentence = "Para iniciar un negocio de flete, está muy bien este auto";
        } else {
            sentence = "Tienes que usar este auto en el campo, es una maquina de trabajo";
        }
        return String.format("Ficha técnica: marca= %s, modelo= %s, año= %d. %sa",
                getBrand(), getModel(), getYear(), sentence);
    }

    @Override
    public String toString() {
        return String.format(
                "Truck { maxLoad= %d, brand= %s, " +
                        "model= %s, year= %d }",
                this.maxLoad, getBrand(), getModel(), getYear());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck that = (Truck) o;
        return maxLoad.equals(that.maxLoad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxLoad);
    }
}
