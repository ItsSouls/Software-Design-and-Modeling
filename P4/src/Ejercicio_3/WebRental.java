package Ejercicio_3;

import java.util.Date;

public class WebRental extends Rental {
    private Integer deliveryTime;
    private RentalOffice deliveryOffice; // Cambiar el atributo

    public WebRental(Date startDate, Date endDate, Customer customer, Car car, RentalOffice deliveryOffice, Integer deliveryTime, Promotion promotion) {
        super(startDate, endDate, customer, car, car.getPickupOffice(), promotion); // Usar la oficina de recogida del coche
        this.setDeliveryTime(deliveryTime);
        this.setDeliveryOffice(deliveryOffice); // Asegurar que deliveryOffice se inicializa
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
