package web.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car {
    private String model;
    private String build;
    private int series;

    public Car(String model, String build, int series) {
        this.model = model;
        this.build = build;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String color) {
        this.build = color;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + build + '\'' +
                ", series=" + series +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return series == car.series && Objects.equals(model, car.model) && Objects.equals(build, car.build);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, build, series);
    }
}
