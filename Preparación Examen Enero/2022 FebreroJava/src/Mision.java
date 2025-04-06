import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Mision {
    private List<Participacion> participacion;
    public Mision() {
        this.participacion = new ArrayList<Participacion>();
    }
    public Enumeration<Participacion> getParticipacion() {
        return java.util.Collections.enumeration(this.participacion);
    }
    void addParticipacion(Participacion p) {
        this.participacion.add(p);
    }
}
