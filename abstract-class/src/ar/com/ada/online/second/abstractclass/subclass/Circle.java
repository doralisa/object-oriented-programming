package ar.com.ada.online.second.abstractclass.subclass;

import ar.com.ada.online.second.abstractclass.superclass.Figure;

import java.util.Objects;

public class Circle extends Figure {

    private Double radio;

    public Circle() {

    }

    public Circle(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double areaCalculation() {
        Double area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    @Override
    public String figureDescription() {
        return String.format("Tipo de figura: Circulo \n" +
                "Radio: %5.2f \n" +
                "Area: %5.2f", radio, areaCalculation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radio);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle that = (Circle) obj;
        return !super.equals(obj) && radio.equals(that.radio);
    }

    @Override
    public String toString() {
        return String.format(
                "Circle { Area= %5.2f, Radio= %5.2f }",
                this.area, this.radio);
    }

}
