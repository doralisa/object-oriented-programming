package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.superclass.Vehicle;

import java.util.Objects;

public class SportsVehicle extends Vehicle {

    private Integer rpm;

    public SportsVehicle() {
    }

    public SportsVehicle(Integer rpm) {
        this.rpm = rpm;
    }

    public SportsVehicle(String brand, String model, Integer year, Integer rpm) {
        super(brand, model, year);
        this.rpm = rpm;
    }

    public Integer getRpm() {
        return rpm;
    }

    public void setRpm(Integer rpm) {
        this.rpm = rpm;
    }

    @Override
    public String technicalSheet() {
        String sentence;
        if (rpm > 0 && rpm <= 50) {
            sentence = "El auto es muy bonito, pero solo sirve para salir a pasear";
        } else {
            if (rpm > 50 && rpm <= 300) {
                sentence = "Con este auto puedes desafiar a cualquiera en la pista";
            } else {
                if (rpm > 300 && rpm <= 600) {
                    sentence = "Si tienes este auto, debes considerar participar en NASCAR";
                } else {
                    sentence = "¿Eres parte del elenco de rápidos y furiosos?";
                }}}
                return String.format("Ficha técnica: marca= %s, modelo= %s, año= %d. %s",
                        getBrand(), getModel(), getYear(), sentence);
            }

            @Override
            public String toString () {
                return String.format(
                        "SportsVehicle { rpm= %d, brand= %s, " +
                                "model= %s, year= %d }",
                        this.rpm, getBrand(), getModel(), getYear());
            }

            @Override
            public boolean equals (Object o){
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                if (!super.equals(o)) return false;
                SportsVehicle that = (SportsVehicle) o;
                return rpm.equals(that.rpm);
            }

            @Override
            public int hashCode () {
                return Objects.hash(super.hashCode(), rpm);
            }
        }