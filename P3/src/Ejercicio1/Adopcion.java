package Ejercicio1;

import java.util.Date;
import java.util.Objects;

public class Adopcion {
    private Date fecha;
    private Animal animal;
    private Adoptante adoptante;
    private Voluntario voluntario;

    public Adopcion(Date fecha, Animal animal, Adoptante adoptante, Voluntario voluntario) {
        this.setFecha(fecha);
        this.setAnimal(animal);
        this.setAdoptante(adoptante);
        this.setVoluntario(voluntario);
    }

    public Date getFecha() {
        return fecha;
    }

    private void setFecha(Date fecha) {
        assert (fecha != null) : "La fecha no es válida";
        this.fecha = fecha;
    }

    public Animal getAnimal() {
        return animal;
    }

    protected void setAnimal(Animal animal) {
        assert (animal != null) : "El animal no es válido";
        this.animal = animal;
        this.animal.setAdopcion(this);
    }

    public Adoptante getAdoptante() {
        return adoptante;
    }

    protected void setAdoptante(Adoptante adoptante) {
        assert (adoptante != null) : "El adoptante no es válido";
        this.adoptante = adoptante;

    }

    public Voluntario getVoluntario() {
        return voluntario;
    }

    protected void setVoluntario(Voluntario voluntario) {
        assert (voluntario != null) : "El voluntario no es válido";
        this.voluntario = voluntario;
    }

    public boolean noDup(Adopcion otraAdopcion) {
        assert (otraAdopcion != null) : "La adopción no es válida";
        return !this.animal.equals(otraAdopcion.getAnimal());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Adopcion adopcion = (Adopcion) o;
        return Objects.equals(fecha, adopcion.fecha) && Objects.equals(animal, adopcion.animal) && Objects.equals(adoptante, adopcion.adoptante);
    }


    @Override
    public int hashCode() {
        return Objects.hash(fecha, animal, adoptante);
    }
}
