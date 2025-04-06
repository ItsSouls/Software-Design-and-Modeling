package Ejercicio_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class Car {
    private String licensePlate;
    private Model model;
    private RentalOffice pickupOffice;
    private List<Rental> rentals;

    public Car(String licensePlate, Model model, RentalOffice pickupOffice) {
        this.setLicensePlate(licensePlate);
        this.setModel(model);
        this.setPickupOffice(pickupOffice);
        this.rentals = new ArrayList<>();

        model.addCar(this);
        pickupOffice.addCar(this);
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    private void setLicensePlate(String licensePlate) {
        assert (licensePlate != null) : "La licencia no es válida";
        this.licensePlate = licensePlate;
    }

    public Model getModel() {
        return model;
    }

    private void setModel(Model model) {
        assert (model != null) : "El modelo no es válido";
        this.model = model;
    }

    public Enumeration<Rental> getRentals() {
        return Collections.enumeration(rentals);
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public RentalOffice getPickupOffice() {
        return pickupOffice;
    }

    private void setPickupOffice(RentalOffice pickupOffice) {
        assert (pickupOffice != null) : "La oficina de alquiler no es válida";
        this.pickupOffice = pickupOffice;
    }
}
