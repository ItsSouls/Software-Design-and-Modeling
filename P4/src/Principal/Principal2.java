package Principal;

import Ejercicio_2.Car;
import Ejercicio_2.Customer;
import Ejercicio_2.Model;
import Ejercicio_2.RentalOffice;

import java.util.Date;

public class Principal2 {
    public static void main(String[] args) {
        RentalOffice pickUpOffice1 = new RentalOffice("Calle 1, Madrid", 10);

        Model model1 = new Model("Ford Fiesta", 50);
        Car car1 = new Car("1234-ABC", model1, pickUpOffice1);
        Car car2 = new Car("5678-DEF", model1, pickUpOffice1);

        System.out.println("Estado inicial de car1: " + car1.getState().toString());
        System.out.println("Estado inicial de car2: " + car2.getState().toString() + "\n"); // Verifica el estado inicial

        Date date = new Date(System.currentTimeMillis() + 1000000000);
        car1.takeOutOfService(date);

        System.out.println("El coche car1 ha salido de servicio");
        System.out.println("Estado actual de car1: " + car1.getState().toString() + "\n");

        car1.setCarSustituto(car2);
        System.out.println("El coche car2 será el sustituo del coche car1" + "\n");

        car2.takeOutOfService(date);
        System.out.println("El coche car2 ha salido de servicio");
        System.out.println("Estado actual de car2: " + car2.getState().toString() + "\n");

        if (car1.getCarSustituto() != null) {
            System.out.println("Coche sustituto de car1: " + car1.getCarSustituto().getLicensePlate() + "\n");
        } else {
            System.out.println("No hay coche sustituto asignado para car1.");
        }

        System.out.println("Estado actualizado de car1: " + car1);
        System.out.println("Estado actualizado de car2: " + car2); // Verifica nuevamente
    }
}
