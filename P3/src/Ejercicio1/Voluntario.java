package Ejercicio1;

import java.util.*;

public class Voluntario extends Socio {
    private List<Adopcion> adopciones;
    private List<Animal> animalesRegistradosPorVoluntario;

    public Voluntario(Date registro, Refugio refugio) {
        super(registro, refugio);
        adopciones = new ArrayList<>();
        animalesRegistradosPorVoluntario = new ArrayList<>();
    }

    public void registrar(Animal animal) {
        assert (animal != null) : "El animal no es válido";
        this.getRefugio().registrar(animal);
        animalesRegistradosPorVoluntario.add(animal);
    }

    public void tramitarAdopcion(Animal animal, Adoptante adoptante) {
        assert (animal != null) : "El animal no es válido";
        assert (adoptante != null) : "El adoptante no es válido";
        assert (animal.getEstado() == EstadoAnimal.disponible) : "El animal no está disponible para adopción";
        assert (Collections.list(this.getRefugio().getAnimalesRefugiados()).contains(animal)) : "El animal no pertenece a este refugio";

        Adopcion adopcion = new Adopcion(new Date(), animal, adoptante, this);

        addAdopcion(adopcion);
        animal.setEstado(EstadoAnimal.adoptado);
        this.getRefugio().removeAnimalRefugiado(animal);
    }

    public Enumeration<Animal> getAnimalesRegistradosPorVoluntario() {
        return Collections.enumeration(animalesRegistradosPorVoluntario);
    }

    protected void addAdopcion(Adopcion adopcion) {
        assert (adopcion != null) : "La adopción no es válida";
        assert (!adopciones.contains(adopcion)) : "Ya existe esta adopción";
        for (Adopcion ad : adopciones) {
            assert (ad.noDup(adopcion)) : "Ya existe una adopción para este animal";
        }
        adopciones.add(adopcion);
    }

    public Enumeration<Adopcion> getAdopciones() {
        return Collections.enumeration(adopciones);
    }
}
