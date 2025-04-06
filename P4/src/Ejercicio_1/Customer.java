package Ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String dni;
    private String name;
    private RentalCollection rentalCollection;

    public Customer(String dni, String name, List<Rental> rentals) {
        this.setDni(dni);
        this.setName(name);
        this.setRentalCollection(new RentalCollection(rentals));
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

    public RentalCollection getRentalCollection() {
        return rentalCollection;
    }

    public void setRentalCollection(RentalCollection rentalCollection) {
        assert (rentalCollection != null) : "La colección de alquileres no es válida";
        this.rentalCollection = rentalCollection;
    }

    public Integer numberOfRentalsWithDifferentOffices() {
        int count = 0;
        Iterator iterator = rentalCollection.createIterator();

        while (iterator.hasNext()) {
            Rental rental = iterator.getNext();
            if (rental instanceof WebRental web && !web.getDeliveryOffice().equals(web.getPickupOffice())) {
                count++;
            }
        }

        return count;
    }
}
