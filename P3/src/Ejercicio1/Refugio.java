package Ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class Refugio {
    private double liquidez;
    private List<Animal> animalesRegistrados;
    private List<Animal> animalesRefugiados;
    private List<Socio> socios;

    public Refugio(double liquidez) {
        this.setLiquidez(liquidez);
        this.animalesRegistrados = new ArrayList<>();
        this.animalesRefugiados = new ArrayList<>();
        this.socios = new ArrayList<>();
    }

    public void registrar(Animal animal) {
        assert (animal != null) : "El animal que se desea registrar no es válido";
        assert (!animalesRegistrados.contains(animal)) : "El animal que desea registrar ya está registrado";
        animalesRegistrados.add(animal);
        animal.setEstado(EstadoAnimal.disponible);
        animalesRefugiados.add(animal);
        animal.setRefugio(this);
    }

    public double getLiquidez() {
        return liquidez;
    }

    protected void setLiquidez(double liquidez) {
        assert (liquidez >= 0) : "La liquidez tiene que ser >=0";
        this.liquidez = liquidez;
    }

    protected void addLiquidez(double liquidez) {
        assert (liquidez > 0);
        this.liquidez += liquidez;
    }

    public Enumeration<Animal> getAnimalesRegistrados() {
        return Collections.enumeration(animalesRegistrados);
    }

    public Enumeration<Animal> getAnimalesRefugiados() {
        return Collections.enumeration(animalesRefugiados);
    }

    protected void removeAnimalRefugiado(Animal animal) {
        assert (animalesRefugiados.contains(animal)) : "El animal no está en este refugio";
        assert (animal.getEstado() == EstadoAnimal.adoptado) : "El animal no ha sido adoptado";
        animalesRefugiados.remove(animal);
        animal.setRefugio(null);
    }

    public Enumeration<Socio> getSocios() {
        return Collections.enumeration(socios);
    }

    protected void addSocio(Socio socio) {
        assert (socio != null) : "El socio introducido no es válido";
        assert (!socios.contains(socio)) : "El socio introducido ya está asociado";

        socios.add(socio);
    }

    protected void rmSocio(Socio socio) {
        assert (socio != null) : "El socio introducido no es válido";
        assert (socios.contains(socio)) : "El socio introducido no está asociado";
        socios.remove(socio);
    }
}