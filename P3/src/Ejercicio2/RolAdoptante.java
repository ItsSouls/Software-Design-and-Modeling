package Ejercicio2;

import java.util.*;

public class RolAdoptante implements Adoptante {
    private Socio socio;
    private List<Adopcion> adopciones;

    public RolAdoptante(Socio socio) {
        setSocio(socio);
        this.adopciones = new ArrayList<>();
    }

    @Override
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

    @Override
    public Enumeration<Adopcion> getAdopciones() {
        return Collections.enumeration(adopciones);
    }

    @Override
    public void addAdopcion(Adopcion adopcion) {
        assert (adopcion != null) : "La adopción no es válida";
        assert (!adopciones.contains(adopcion)) : "Ya existe esta adopción";
        for (Adopcion ad : adopciones) {
            assert (ad.noDup(adopcion)) : "Ya existe una adopción para este animal";
        }
        adopciones.add(adopcion);
    }

    public Socio getSocio() {
        return socio;
    }

    private void setSocio(Socio socio) {
        assert (socio != null) : "El socio no es válido";
        this.socio = socio;
    }
}
