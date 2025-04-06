package Ejercicio2;

import java.util.Date;

public class Donacion {
    private double cantidad;
    private Date fecha;

    public Donacion(double cantidad, Date fecha) {
        this.setCantidad(cantidad);
        this.setFecha(fecha);
    }

    public double getCantidad() {
        return cantidad;
    }

    private void setCantidad(double cantidad) {
        assert (cantidad > 0) : "La cantidad a donar no puede ser negativa o cero";
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    private void setFecha(Date fecha) {
        assert (fecha != null) : "La fecha no es válida";
        this.fecha = fecha;
    }
}