import java.util.Enumeration;

public class Participacion {
    private Vehiculo vehiculo;
    private Mision mision;

    public Participacion(Vehiculo v, Mision m) {
        assert (v!=null);
        assert (m!=null);
        assert this.noDups(v,m):"No se permiten duplicados";
        this.vehiculo = v;
        this.mision = m;
        m.addParticipacion(this);
        v.addParticipacion(this);
    }
    public Vehiculo getVehiculo() {
        return this.vehiculo;
    }
    public Mision getMision() {
        return this.mision;
    }

    private boolean noDups(Vehiculo v, Mision m) {
        Enumeration<Participacion> p = v.getParticipacion();
        while(p.hasMoreElements()){
            if (p.nextElement().getMision() == m) return false;
        };
        return true;
    }
}
