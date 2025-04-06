package Ejercicio2;

import java.util.Enumeration;

public interface Voluntario {
    void registrar(Animal animal);

    void tramitarAdopcion(Animal animal, Adoptante adoptante);

    Enumeration<Animal> getAnimalesRegistradosPorVoluntario();

    void addAdopcion(Adopcion adopcion);

}
