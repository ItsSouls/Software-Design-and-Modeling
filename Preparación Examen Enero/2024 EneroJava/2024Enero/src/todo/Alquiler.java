package todo;

public class Alquiler {

    int precio;
    int duration;
    int comienzo;

    Avion avion;
    Aerolinea aerolinea;

    public Alquiler(Avion a, Aerolinea ae, int precio, int comienzo, int duration){
        assert (precio>0); //restricción 1
        assert (comienzo>0); //restricción 1
        assert (duration>0); //restricción 1
        assert (duration<=4 || a.alquilerMayor4Anios()<2);
        assert (!a.alquiladoEn(ae));

        this.duration = duration;
        this.comienzo = comienzo;
        this.precio = precio;
        this.avion = a;
        this.aerolinea = ae;

        a.addAlquiler(this);
        ae.addAlquiler(this);

        assert(a.sinSolapamientos()); //Restricción 4
        assert (!ae.checkDuration()); //Restricción 3
    }

    public int getPrecio() {
        return this.precio;
    }

    public int getDuration(){
        return this.duration;
    }

    public int getComienzo(){
        return this.comienzo;
    }
}