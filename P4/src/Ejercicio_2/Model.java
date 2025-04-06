package Ejercicio_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class Model {
    private String name;
    private Integer pricePerDay;
    private List<Car> cars;

    public Model(String name, Integer pricePerDay) {
        this.setName(name);
        this.setPricePerDay(pricePerDay);
        cars = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        assert (name != null) : "El nombre no es válido";
        this.name = name;
    }

    public Integer getPricePerDay() {
        return pricePerDay;
    }

    private void setPricePerDay(Integer pricePerDay) {
        assert (pricePerDay >= 0) : "El precio por día no puede ser negativo";
        this.pricePerDay = pricePerDay;
    }

    public Enumeration<Car> getCars() {
        return Collections.enumeration(cars);
    }
}