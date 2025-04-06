package Main;

import java.util.*;

import Ejercicio2.*;

public class Principal2 {
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

            // Crear socios con múltiples roles
            Socio socio1 = new Socio(fecha, refugio1);
            Socio socio2 = new Socio(fecha, refugio2);

            // Añadir roles
            socio1.addRolVoluntario();
            socio1.addRolAdoptante();
            socio1.addRolDonante();
            socio2.addRolVoluntario();
            socio2.addRolAdoptante();

            // Registrar animales usando socio como voluntario
            socio1.getRolVoluntario().registrar(animal1);
            socio1.getRolVoluntario().registrar(animal2);
            socio2.getRolVoluntario().registrar(animal3);

            // Mostrar animales registrados por refugio
            System.out.println("\nAnimales registrados en Refugio 1:");
            printEnumeration(refugio1.getAnimalesRegistrados());

            System.out.println("\nAnimales registrados en Refugio 2:");
            printEnumeration(refugio2.getAnimalesRegistrados());

            // Mostrar animales registrados por cada socio
            System.out.println("\nAnimales registrados por Socio 1:");
            printEnumeration(socio1.getRolVoluntario().getAnimalesRegistradosPorVoluntario());

            System.out.println("\nAnimales registrados por Socio 2:");
            printEnumeration(socio2.getRolVoluntario().getAnimalesRegistradosPorVoluntario());

            // Realizar adopciones usando socio como adoptante
            socio1.getRolAdoptante().adoptar(animal1, socio1.getRolVoluntario());
            socio1.getRolAdoptante().adoptar(animal2, socio1.getRolVoluntario());

            System.out.println("\nAnimales adoptados por Socio 1:");
            printAdopciones(socio1.getRolAdoptante().getAdopciones());

            // Realizar donación usando socio como donante
            socio1.getRolDonante().donar(10000);
            System.out.println("\nLa liquidez del refugio 1 es: " + refugio1.getLiquidez() + " €");

            // --- PRUEBAS DE ERROR COMENTADAS ---

            // 1. Intentar adoptar un animal ya adoptado
            // socio1.adoptar(animal1, socio1);

            // 2. Crear una adopción duplicada (mismo animal, adoptante y voluntario)
            // Adopcion adopcionDuplicada = new Adopcion(fecha, animal1, socio1, socio1);

            // 3. Intentar registrar un animal ya registrado en el refugio
            // socio1.registrar(animal1);

            // 4. Intentar donar una cantidad negativa
            // socio1.donar(-50);

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
