package Principal;

import Ejercicio_1.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Principal1 {
    public static void main(String[] args) {
        List<Rental> rentals = new ArrayList<>();

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
        Customer customer = new Customer("12345678A", "Juan Pérez", rentals);

        // Fechas para los alquileres
        LocalDate startDate1 = LocalDate.of(2024, 12, 1); // 1 de diciembre de 2024
        LocalDate endDate1 = LocalDate.of(2024, 12, 5);   // 5 de diciembre de 2024

        LocalDate startDate2 = LocalDate.of(2024, 12, 10); // 10 de diciembre de 2024
        LocalDate endDate2 = LocalDate.of(2024, 12, 15);   // 15 de diciembre de 2024

        // Crear alquileres web con oficinas diferentes
        WebRental webRental1 = new WebRental(startDate1, endDate1, customer, car1, deliveryOffice1, 3);
        rentals.add(webRental1);
        WebRental webRental2 = new WebRental(startDate2, endDate2, customer, car2, deliveryOffice2, 5);
        rentals.add(webRental2);

        // Llamar a la operación para contar alquileres con oficinas diferentes
        Integer rentalsWithDifferentOffices = customer.numberOfRentalsWithDifferentOffices();
        System.out.println("Alquileres web con oficinas diferentes: " + rentalsWithDifferentOffices);
    }
}
