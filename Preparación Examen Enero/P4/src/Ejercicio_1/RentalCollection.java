package Ejercicio_1;

import java.util.List;

public class RentalCollection implements IterableCollection {
    private List<Rental> rentals;

    public RentalCollection(List<Rental> rentals) {
        this.rentals = rentals;
    }

    @Override
    public Iterator createIterator() {
        return new RentalIterator(rentals);
    }
}
