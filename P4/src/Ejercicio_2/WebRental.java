package Ejercicio_2;

import java.util.Date;

public class WebRental extends Rental {
    private Integer deliveryTime;
    private RentalOffice rentalOffice;

    public WebRental(Date startDate, Date endDate, Customer customer, Car car, RentalOffice rentalOffice, Integer deliveryTime) {
        super(startDate, endDate, customer, car, rentalOffice);
        this.setDeliveryTime(deliveryTime);
    }

    public Integer getDeliveryTime() {
        return deliveryTime;
    }

    private void setDeliveryTime(Integer deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public RentalOffice getRentalOffice() {
        return rentalOffice;
    }

    private void setRentalOffice(RentalOffice rentalOffice) {
        this.rentalOffice = rentalOffice;
    }
}