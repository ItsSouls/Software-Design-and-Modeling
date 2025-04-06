package todo;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Estadio {

    private List<Equipo> equipos;

    public Estadio(){
        this.setEquipos(new ArrayList<Equipo>());
    }

    public Enumeration<Equipo> getEquipos() {
        return (Enumeration<Equipo>) equipos;
    }

    private void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    protected void addEquipos(Equipo e){
        assert (e != null);
        this.equipos.add(e);
    }

    protected void rmEquipos(Equipo e){
        assert (e != null);
        this.equipos.remove(e);
    }
}
