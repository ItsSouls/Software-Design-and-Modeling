package Ejercicio_3;

import java.util.Date;

public class Rental {
    private Date startDate;
    private Date endDate;
    private Customer customer;
    private Car car;
    private RentalOffice pickupOffice;
    private Promotion promotion;

    public Rental(Date startDate, Date endDate, Customer customer, Car car, RentalOffice pickupOffice, Promotion promotion) {
        this.setStartDate(startDate);
        this.setEndDate(endDate);
        this.setCustomer(customer);
        this.setCar(car);
        this.setPickupOffice(pickupOffice);
        this.setPromotion(promotion);

        customer.addRental(this);
        car.addRental(this);
        pickupOffice.addRental(this);
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

    public Promotion getPromotion() {
        return promotion;
    }

    private void setPromotion(Promotion promotion) {
        this.promotion = promotion; // Puede ser null si no hay promoción
    }

    public int getPrice() {
        long days = (endDate.getTime() - startDate.getTime()) / (1000 * 60 * 60 * 24);
        int basePrice = (int) (car.getModel().getPricePerDay() * days);

        if (promotion != null) {
            return promotion.applyDiscount(basePrice);
        }

        return basePrice;
    }
}
