package Ejercicio_1;

import java.util.List;

public class RentalIterator implements Iterator {
    private List<Rental> rentals;
    private int position;

    public RentalIterator(List<Rental> rentals) {
        this.rentals = rentals;
        this.position = 0;
    }

    @Override
    public Rental getNext() {
        if (!hasNext()) {
            return null;
        }
        return rentals.get(position++);
    }

    @Override
    public boolean hasNext() {
        return position < rentals.size();
    }
}
