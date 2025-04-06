package Ejercicio_2;

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
        webRentals = new ArrayList<>();
        rentals = new ArrayList<>();
        cars = new ArrayList<>();
    }

    public String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    public Integer getFeeForDelivery() {
        return feeForDelivery;
    }

    private void setFeeForDelivery(Integer feeForDelivery) {
        this.feeForDelivery = feeForDelivery;
    }

    public Enumeration<WebRental> getWebRentals() {
        return Collections.enumeration(webRentals);
    }

    public Enumeration<Rental> getRentals() {
        return Collections.enumeration(rentals);
    }

    public Enumeration<Car> getCars() {
        return Collections.enumeration(cars);
    }

    public List<Car> getCarsList() {
        return cars;
    }

    public void addCar(Car c) {
        if (c != null) {
            this.getCarsList().add(c);
        }
    }
}