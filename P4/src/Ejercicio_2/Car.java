package Ejercicio_2;

import java.util.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class Car {
    private String licensePlate;
    private Model model;
    private RentalOffice rentalOffice;
    private List<Rental> rentals;
    private CarState state;
    private Date backToServiceDate;
    private Car carSustituto;

    public Car(String licensePlate, Model model, RentalOffice rentalOffice) {
        this.setLicensePlate(licensePlate);
        this.setModel(model);
        this.setRentalOffice(rentalOffice);
        this.rentals = new ArrayList<>();
        this.state = new InService();
        this.getRentalOffice().addCar(this);
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
        this.model = model;
    }

    public Enumeration<Rental> getRentals() {
        return Collections.enumeration(rentals);
    }

    public RentalOffice getRentalOffice() {
        return rentalOffice;
    }

    private void setRentalOffice(RentalOffice rentalOffice) {
        this.rentalOffice = rentalOffice;
    }

    public void setState(CarState state) {
        this.state = state;
    }

    public CarState getState() {
        return state;
    }

    public void takeOutOfService(Date backToService) {
        if (backToService == null || backToService.before(new Date(System.currentTimeMillis()))) {
            throw new IllegalArgumentException("La fecha no es válida");
        }
        if (this.state.isAvailableToRent()) {
            this.state.updateStatus(this, backToService);
        }
    }

    public void setBackToServiceDate(Date date) {
        this.backToServiceDate = date;
    }

    public Date getBackToServiceDate() {
        return this.backToServiceDate;
    }


    public Car getCarSustituto() {
        return this.carSustituto;
    }

    public void setCarSustituto(Car car) {
        this.carSustituto = car;
    }

    @Override
    public String toString() {
        String sustituto = (carSustituto != null) ? carSustituto.getLicensePlate() : "No hay coche sustituto";
        return  "Matrícula='" + licensePlate + '\'' +
                ", Modelo=" + model.getName() +  // Asumimos que la clase Model tiene el método getName()
                ", Estado=" + state.toString() +  // El estado del coche (incluso si es un coche sustituto)
                ", Coche Sustituto=" + sustituto;// Información sobre el coche sustituto
    }

}