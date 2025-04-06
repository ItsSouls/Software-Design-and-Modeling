package todo;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Equipo {
    private Estadio estadio;
    private List<Partido>partidosLocal;
    private List<Partido>partidosVisitantes;
    private List<Partido>partidosGanados;

    public Equipo(Estadio e){
        this.setEstadio(e);
        this.setPartidosGanados(new ArrayList<Partido>());
        this.setPartidosLocal(new ArrayList<Partido>());
        this.setPartidosVisitantes(new ArrayList<Partido>());

    }

    public Estadio getEstadio() {
        return estadio;
    }

    private void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public Enumeration<Partido> getPartidosLocal() {
        return (Enumeration<Partido>) partidosLocal;
    }

    private void setPartidosLocal(List<Partido> partidosLocal) {
        this.partidosLocal = partidosLocal;
    }

    protected void addPartidosLocal(Partido l){
        assert (l != null);
        this.partidosLocal.add(l);
    }

    public Enumeration<Partido> getPartidosVisitantes() {
        return (Enumeration<Partido>) partidosVisitantes;
    }

    private void setPartidosVisitantes(List<Partido> partidosVisitantes) {
        this.partidosVisitantes = partidosVisitantes;
    }

    protected void addPartidosVisitantes(Partido v){
        assert (v != null);
        this.partidosVisitantes.add(v);
    }

    public Enumeration<Partido> getPartidosGanados() {
        return (Enumeration<Partido>) partidosGanados;
    }

    private void setPartidosGanados(List<Partido> partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    protected void addPartidosGanados(Partido g){
        assert (g != null);
        this.partidosGanados.add(g);
    }
}
