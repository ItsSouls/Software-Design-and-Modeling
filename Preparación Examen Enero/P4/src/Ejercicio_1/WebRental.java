package Ejercicio_1;

import java.time.LocalDate;
import java.util.Date;

public class WebRental extends Rental {
    private Integer deliveryTime;
    private RentalOffice deliveryOffice;

    public WebRental(LocalDate startDate, LocalDate endDate, Customer customer, Car car, RentalOffice deliveryOffice, Integer deliveryTime) {
        super(startDate, endDate, customer, car, car.getPickupOffice());
        this.setDeliveryTime(deliveryTime);
        this.setDeliveryOffice(deliveryOffice);
    }

    public Integer getDeliveryTime() {
        return deliveryTime;
    }

    private void setDeliveryTime(Integer deliveryTime) {
        assert (deliveryTime > 0) : "El tiempo de entrega debe ser mayor que 0";
        this.deliveryTime = deliveryTime;
    }

    public RentalOffice getDeliveryOffice() { // Cambiar el método para reflejar el atributo correcto
        return deliveryOffice;
    }

    private void setDeliveryOffice(RentalOffice deliveryOffice) {
        assert (deliveryOffice != null) : "La oficina de entrega no es válida";
        this.deliveryOffice = deliveryOffice;
    }
}
