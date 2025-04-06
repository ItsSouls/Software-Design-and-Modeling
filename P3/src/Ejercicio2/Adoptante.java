package Ejercicio2;

import java.util.Enumeration;

public interface Adoptante {
    void adoptar(Animal animal, Voluntario voluntario);

    Enumeration<Adopcion> getAdopciones();

    void addAdopcion(Adopcion adopcion);
}
