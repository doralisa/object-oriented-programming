package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.superclass.Vehicle;

import java.util.Objects;

public class ElectricalVehicle extends Vehicle {

    private Integer potency;

    public ElectricalVehicle () {}

    public ElectricalVehicle (Integer potency) {}

    public ElectricalVehicle (String brand, String model, Integer year, Integer potency) {
        super(brand, model, year);
        this.potency = potency;
    }

    public Integer getPotency() {
        return potency;
    }

    public void setPotency(Integer potency) {
        this.potency = potency;
    }

    @Override
    public String technicalSheet() {
        if (getYear()<2007) {
            return ("No existe modelo para este año");
        } else {
            return String.format("Ficha técnica: marca= %s, modelo= %s, año= %d. Es un auto de última tecnologia!",
                    getBrand(), getModel(), getYear());
        }
    }

    @Override
    public String toString() {
        return String.format(
                "ElectricalVehicle { potency= %d, brand= %s, " +
                        "model= %s, year= %d }",
                this.potency, getBrand(), getModel(), getYear());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ElectricalVehicle that = (ElectricalVehicle) o;
        return potency.equals(that.potency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), potency);
    }
}
