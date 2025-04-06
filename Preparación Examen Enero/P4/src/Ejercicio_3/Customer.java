package Ejercicio_3;

import java.util.*;

public class Customer {
    private String dni;
    private String name;
    private List<Rental> rentals;

    public Customer(String dni, String name) {
        this.setDni(dni);
        this.setName(name);
        rentals = new ArrayList<>();
    }

    public String getDni() {
        return dni;
    }

    private void setDni(String dni) {
        assert (dni != null) : "El DNI no es válido";
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        assert (name != null) : "El nombre no es válido";
        this.name = name;
    }

    public Enumeration<Rental> getRentals() {
        return Collections.enumeration(rentals);
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }
}
