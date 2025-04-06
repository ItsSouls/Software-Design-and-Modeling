package Ejercicio_1;

import java.time.LocalDate;

public class Rental {
    private LocalDate startDate;
    private LocalDate endDate;
    private Customer customer;
    private Car car;
    private RentalOffice pickupOffice;

    public Rental(LocalDate startDate, LocalDate endDate, Customer customer, Car car, RentalOffice pickupOffice) {
        this.setStartDate(startDate);
        this.setEndDate(endDate);
        this.setCustomer(customer);
        this.setCar(car);
        this.setPickupOffice(pickupOffice);

        car.addRental(this);
        pickupOffice.addRental(this);
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    private void setStartDate(LocalDate startDate) {
        assert (startDate != null) : "La fecha de inicio no es válida";
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    private void setEndDate(LocalDate endDate) {
        assert (endDate != null) : "La fecha de fin no es válida";
        this.endDate = endDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    private void setCustomer(Customer customer) {
        assert (customer != null) : "El cliente no es válido";
        this.customer = customer;
    }

    public Car getCar() {
        return car;
    }

    private void setCar(Car car) {
        assert (car != null) : "El coche no es válido";
        this.car = car;
    }

    public RentalOffice getPickupOffice() {
        return pickupOffice;
    }

    private void setPickupOffice(RentalOffice pickupOffice) {
        assert (pickupOffice != null) : "La oficina de alquiler no es válida";
        this.pickupOffice = pickupOffice;
    }
}
