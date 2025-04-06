package Main;

import java.util.*;

import Ejercicio1.*;

public class Principal {
    public static void main(String[] args) {
        try {
            // Configuración inicial de fechas
            Date fecha = new Date();
            Calendar cal = Calendar.getInstance();

            cal.set(2020, Calendar.JANUARY, 15);
            Date fechaNacimientoAnimal1 = cal.getTime();

            cal.set(2019, Calendar.MARCH, 10);
            Date fechaNacimientoAnimal2 = cal.getTime();

            cal.set(2021, Calendar.JUNE, 5);
            Date fechaNacimientoAnimal3 = cal.getTime();

            // Crear refugios
            Refugio refugio1 = new Refugio(0);
            Refugio refugio2 = new Refugio(1);

            // Crear animales
            Animal animal1 = new Animal(fechaNacimientoAnimal1);
            Animal animal2 = new Animal(fechaNacimientoAnimal2);
            Animal animal3 = new Animal(fechaNacimientoAnimal3);

            // Crear voluntarios
            Voluntario voluntario1 = new Voluntario(fecha, refugio1);
            Voluntario voluntario2 = new Voluntario(fecha, refugio2);

            // Registrar animales
            voluntario1.registrar(animal1);
            voluntario1.registrar(animal2);
            voluntario2.registrar(animal3);

            // Mostrar animales registrados por refugio
            System.out.println("\nAnimales registrados en Refugio 1:");
            printEnumeration(refugio1.getAnimalesRegistrados());

            System.out.println("\nAnimales registrados en Refugio 2:");
            printEnumeration(refugio2.getAnimalesRegistrados());

            // Mostrar animales registrados por cada voluntario
            System.out.println("\nAnimales registrados por Voluntario 1:");
            printEnumeration(voluntario1.getAnimalesRegistradosPorVoluntario());

            System.out.println("\nAnimales registrados por Voluntario 2:");
            printEnumeration(voluntario2.getAnimalesRegistradosPorVoluntario());

            // Crear adoptante y realizar adopciones
            Date fechaRegistroAdoptante = new Date();
            Adoptante adoptante1 = new Adoptante(fechaRegistroAdoptante, refugio1);

            adoptante1.adoptar(animal1, voluntario1);
            adoptante1.adoptar(animal2, voluntario1);

            System.out.println("\nAnimales adoptados por el adoptante:");
            printAdopciones(adoptante1.getAdopciones());

            // Crear donante y realizar donación
            Donante donante1 = new Donante(fecha, refugio1);
            donante1.donar(10000);
            System.out.println("\nLa liquidez del refugio 1 es: " + refugio1.getLiquidez() + " €");

            // --- PRUEBAS DE ERROR COMENTADAS ---

            // 1. Intentar adoptar un animal ya adoptado
            // adoptante1.adoptar(animal1, voluntario1);

            // 2. Crear una adopción duplicada (mismo animal, adoptante y voluntario)
            //Adopcion adopcionDuplicada = new Adopcion(fecha, animal1, adoptante1, voluntario1);

            // 3. Intentar registrar un animal ya registrado en el refugio
            // voluntario1.registrar(animal1);

            // 4. Intentar donar una cantidad negativa
            //donante1.donar(-50);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    // Métodos auxiliares para imprimir información
    private static void printEnumeration(Enumeration<?> enumeration) {
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }

    private static void printAdopciones(Enumeration<Adopcion> adopcionesEnum) {
        for (Adopcion adopcion : Collections.list(adopcionesEnum)) {
            Animal animal = adopcion.getAnimal();
            System.out.println("Animal adoptado: " + animal + ", Fecha de adopción: " + adopcion.getFecha());
        }
    }
}
