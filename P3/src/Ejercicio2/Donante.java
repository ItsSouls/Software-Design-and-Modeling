package Ejercicio2;

import java.util.Enumeration;

public interface Donante {
    void donar(double cantidad);

    Enumeration<Donacion> getDonaciones();
}
