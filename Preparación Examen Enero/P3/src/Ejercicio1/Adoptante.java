package Ejercicio1;

import java.util.*;

public class Adoptante extends Socio {
    private List<Adopcion> adopciones;

    public Adoptante(Date registro, Refugio refugio) {
        super(registro, refugio);
        adopciones = new ArrayList<>();
    }

    public void adoptar(Animal animal, Voluntario voluntario) {
        assert (animal != null) : "El animal no es válido";
        assert (voluntario != null) : "El voluntario no es válido";

        Date fechaAdopcion = new Date();
        Adopcion adopcion = new Adopcion(fechaAdopcion, animal, this, voluntario);

        assert (!adopciones.contains(adopcion)) : "Ya existe esta adopción";

        for (Adopcion ad : adopciones) {
            assert (ad.noDup(adopcion)) : "Ya existe una adopción para este animal";
        }

        addAdopcion(adopcion);
        animal.setAdopcion(adopcion);
        voluntario.tramitarAdopcion(animal, this);
    }

    public Enumeration<Adopcion> getAdopciones() {
        return Collections.enumeration(adopciones);
    }

    protected void addAdopcion(Adopcion adopcion) {
        assert (adopcion != null) : "La adopción no es válida";
        assert (!adopciones.contains(adopcion)) : "Ya existe esta adopción";
        for (Adopcion ad : adopciones) {
            assert (ad.noDup(adopcion)) : "Ya existe una adopción para este animal";
        }
        adopciones.add(adopcion);
    }
}