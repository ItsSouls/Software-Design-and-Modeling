package Ejercicio1;

import java.util.*;

public class Donante extends Socio {
    private List<Donacion> donaciones;

    public Donante(Date registro, Refugio refugio) {
        super(registro, refugio);
        this.donaciones = new ArrayList<>();
    }

    public void donar(double cantidad) {
        assert (cantidad > 0) : "La cantidad donada debe ser positiva";
        Date fechaActual = new Date();
        Donacion nuevaDonacion = new Donacion(cantidad, fechaActual);
        donaciones.add(nuevaDonacion);
        this.getRefugio().addLiquidez(cantidad);
    }

    public Enumeration<Donacion> getDonaciones() {
        return Collections.enumeration(donaciones);
    }
}