package Ejercicio2;

import java.util.*;

public class Socio {

    private Date registro;
    private Refugio refugio;

    private Voluntario voluntario;
    private Donante donante;
    private Adoptante adoptante;

    public Socio(Date registro, Refugio refugio) {
        this.setRegistro(registro);
        this.setRefugio(refugio);
    }

    // Métodos comunes
    public Date getRegistro() {
        return this.registro;
    }

    private void setRegistro(Date registro) {
        assert (registro != null) : "La fecha de registro no puede ser nula";
        this.registro = registro;
    }

    public Refugio getRefugio() {
        return refugio;
    }

    private void setRefugio(Refugio refugio) {
        assert (refugio != null) : "El refugio no puede ser nulo";
        this.refugio = refugio;
        this.refugio.addSocio(this);
    }

    public void addRolVoluntario() {
        assert (this.voluntario == null) : "El rol voluntario ya está asignado";
        this.voluntario = new RolVoluntario(this);
    }

    public void addRolDonante() {
        assert (this.donante == null) : "El rol donante ya está asignado";
        this.donante = new RolDonante(this);
    }

    public void addRolAdoptante() {
        assert (this.adoptante == null) : "El rol adoptante ya está asignado";
        this.adoptante = new RolAdoptante(this);
    }

    public Voluntario getRolVoluntario() {
        return this.voluntario;
    }

    public Donante getRolDonante() {
        return this.donante;
    }

    public Adoptante getRolAdoptante() {
        return this.adoptante;
    }
}
