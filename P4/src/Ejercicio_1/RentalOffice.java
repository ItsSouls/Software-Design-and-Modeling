package Ejercicio_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class RentalOffice {
    private String address;
    private Integer feeForDelivery;
    private List<WebRental> webRentals;
    private List<Rental> rentals;
    private List<Car> cars;

    public RentalOffice(String address, Integer feeForDelivery) {
        this.setAddress(address);
        this.setFeeForDelivery(feeForDelivery);
        this.webRentals = new ArrayList<>();
        this.rentals = new ArrayList<>();
        this.cars = new ArrayList<>();
    }

    public String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        assert (address != null) : "La dirección no es válida";
        this.address = address;
    }

    public Integer getFeeForDelivery() {
        return feeForDelivery;
    }

    private void setFeeForDelivery(Integer feeForDelivery) {
        assert (feeForDelivery != null) : "La tasa por entrega no es válida";
        this.feeForDelivery = feeForDelivery;
    }

    public Enumeration<WebRental> getWebRentals() {
        return Collections.enumeration(webRentals);
    }

    public Enumeration<Rental> getRentals() {
        return Collections.enumeration(rentals);
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public Enumeration<Car> getCars() {
        return Collections.enumeration(cars);
    }

    public void addCar(Car car) {
        cars.add(car);
    }
}
