package Ejercicio2;

import java.util.Date;

public class Animal {
    private final Date nacimiento;
    private EstadoAnimal estado;
    private Refugio refugio;
    private Adopcion adopcion;

    public Animal(Date nacimiento) {
        assert (nacimiento != null) : "La fecha de nacimiento no es válida";
        this.nacimiento = nacimiento;
        this.setEstado(EstadoAnimal.disponible);
        this.setRefugio(null);
        this.setAdopcion(null);
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public EstadoAnimal getEstado() {
        return estado;
    }

    protected void setEstado(EstadoAnimal estado) {
        assert (estado != null) : "El estado del animal no es válido";
        this.estado = estado;
    }

    public Refugio getRefugio() {
        return refugio;
    }

    protected void setRefugio(Refugio refugio) {
        this.refugio = refugio;
    }

    public Adopcion getAdopcion() {
        return adopcion;
    }

    protected void setAdopcion(Adopcion adopcion) {
        this.adopcion = adopcion;
    }

    public String toString() {
        return "Animal nacido el: " + nacimiento.toString();
    }
}
