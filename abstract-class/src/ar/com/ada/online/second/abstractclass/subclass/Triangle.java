package ar.com.ada.online.second.abstractclass.subclass;

import ar.com.ada.online.second.abstractclass.superclass.Figure;

import java.util.Objects;

public class Triangle extends Figure {

    private Double base;
    private Double height;

    public Triangle() {
    }

    public Triangle(Double base, Double height) {
        this.base = base;
        this. height = height;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public Double areaCalculation() {
        Double area = base * height / 2;
        return area;
    }

    @Override
    public String figureDescription() {
        return String.format("Tipo de figura: Triangulo \n" +
                "Base: %5.2f \n" +
                "Altura: %5.2f \n" +
                "Area: %5.2f", base, height, areaCalculation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), base, height);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Triangle that = (Triangle) obj;
        return !super.equals(obj) && base.equals(that.base) && height.equals(that.height);
    }

    @Override
    public String toString() {
        return String.format(
                "Figure { Area= %5.2f, Base= %5.2f, Altura= %5.2f }",
                this.area, this.base, this.height);
    }
}
