package Ejercicio_2;

import java.util.Date;

public class Rental {
    private Date startDate;
    private Date endDate;
    private Customer customer;
    private Car car;
    private RentalOffice rentalOffice;

    public Rental(Date startDate, Date endDate, Customer customer, Car car, RentalOffice rentalOffice) {
        this.setStartDate(startDate);
        this.setEndDate(endDate);
        this.setCustomer(customer);
        this.setCar(car);
        this.setRentalOffice(rentalOffice);
    }

    public Date getStartDate() {
        return startDate;
    }

    private void setStartDate(Date startDate) {
        assert (startDate != null) : "La fecha de inicio no es válida";
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    private void setEndDate(Date endDate) {
        assert (endDate != null) : "La fecha de fin no es válida";
        this.endDate = endDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    private void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Car getCar() {
        return car;
    }

    private void setCar(Car car) {
        this.car = car;
    }

    public RentalOffice getRentalOffice() {
        return rentalOffice;
    }

    private void setRentalOffice(RentalOffice rentalOffice) {
        this.rentalOffice = rentalOffice;
    }
}