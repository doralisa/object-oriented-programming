package ar.com.ada.online.second.abstractclass.superclass;

import java.util.Objects;

public abstract class Figure {

    protected Double area;

    public Figure (Double area) {
        this.area = area;
    }

    protected Figure() {
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public abstract Double areaCalculation();

    public abstract String figureDescription ();

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
