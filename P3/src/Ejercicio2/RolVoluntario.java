package Ejercicio2;

import java.util.*;

public class RolVoluntario implements Voluntario {
    private Socio socio;
    private List<Adopcion> adopciones;
    private List<Animal> animalesRegistradosPorVoluntario;

    public RolVoluntario(Socio socio) {
        setSocio(socio);
        adopciones = new ArrayList<>();
        this.animalesRegistradosPorVoluntario = new ArrayList<>();
    }

    @Override
    public void registrar(Animal animal) {
        assert (animal != null) : "El animal no es válido";
        this.socio.getRefugio().registrar(animal);
        animalesRegistradosPorVoluntario.add(animal);
    }

    @Override
    public void tramitarAdopcion(Animal animal, Adoptante adoptante) {
        assert (animal != null) : "El animal no es válido";
        assert (adoptante != null) : "El adoptante no es válido";
        assert (animal.getEstado() == EstadoAnimal.disponible) : "El animal no está disponible para adopción";
        assert (Collections.list(this.socio.getRefugio().getAnimalesRefugiados()).contains(animal)) : "El animal no pertenece a este refugio";

        Adopcion adopcion = new Adopcion(new Date(), animal, adoptante, this);

        addAdopcion(adopcion);
        animal.setEstado(EstadoAnimal.adoptado);
        this.socio.getRefugio().removeAnimalRefugiado(animal);
    }

    @Override
    public Enumeration<Animal> getAnimalesRegistradosPorVoluntario() {
        return Collections.enumeration(animalesRegistradosPorVoluntario);
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
