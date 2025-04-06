package Principal;

import Ejercicio_3.*;
import Ejercicio_3.PercentagePromotion;

import java.util.Date;

public class Principal3 {
    public static void main(String[] args) {
// Crear oficinas de alquiler
        RentalOffice pickUpOffice1 = new RentalOffice("Calle 1, Madrid", 10);
        RentalOffice deliveryOffice1 = new RentalOffice("Calle 2, Barcelona", 15);

        RentalOffice pickUpOffice2 = new RentalOffice("Calle 3, Valencia", 8);
        RentalOffice deliveryOffice2 = new RentalOffice("Calle 4, Sevilla", 12);

        // Crear modelos y coches
        Model model1 = new Model("Ford Fiesta", 50);
        Model model2 = new Model("Toyota Corolla", 60);

        Car car1 = new Car("1234-ABC", model1, pickUpOffice1);
        Car car2 = new Car("5678-DEF", model2, pickUpOffice2);

        // Crear cliente
        Customer customer = new Customer("12345678A", "Juan Pérez");

        // Fechas para los alquileres
        Date startDate1 = new Date(2024 - 1900, 11, 1); // 1 de diciembre de 2024
        Date endDate1 = new Date(2024 - 1900, 11, 5);   // 5 de diciembre de 2024

        Date startDate2 = new Date(2024 - 1900, 11, 10); // 10 de diciembre de 2024
        Date endDate2 = new Date(2024 - 1900, 11, 15);   // 15 de diciembre de 2024

        // Crear alquileres web con oficinas diferentes
        WebRental webRental1 = new WebRental(startDate1, endDate1, customer, car1, deliveryOffice1, 3, new AmountPromotion(10));
        WebRental webRental2 = new WebRental(startDate2, endDate2, customer, car2, deliveryOffice2, 5, null);

        int price1 = webRental1.getPrice();
        System.out.println("El precio del alquiler1 es: " + price1);

        int price2 = webRental2.getPrice();
        System.out.println("El precio del alquiler2 es: " + price2);

  }
}
