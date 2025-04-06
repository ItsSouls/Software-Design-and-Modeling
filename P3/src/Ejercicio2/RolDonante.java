package Ejercicio2;

import java.util.*;

public class RolDonante implements Donante {
    private Socio socio;
    private List<Donacion> donaciones;

    public RolDonante(Socio socio) {
        setSocio(socio);
        this.donaciones = new ArrayList<>();
    }

    @Override
    public void donar(double cantidad) {
        assert (cantidad > 0) : "La cantidad donada debe ser positiva";
        Date fechaActual = new Date();
        Donacion nuevaDonacion = new Donacion(cantidad, fechaActual);
        donaciones.add(nuevaDonacion);
        this.socio.getRefugio().addLiquidez(cantidad);
    }

    @Override
    public Enumeration<Donacion> getDonaciones() {
        return Collections.enumeration(donaciones);
    }

    public Socio getSocio() {
        return socio;
    }

    private void setSocio(Socio socio) {
        assert (socio != null) : "El socio no es válido";
        this.socio = socio;
    }
}
