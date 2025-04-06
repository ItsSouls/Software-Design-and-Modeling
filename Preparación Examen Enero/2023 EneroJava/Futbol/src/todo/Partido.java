package todo;

public class Partido {
    private Equipo local;
    private Equipo visitante;
    private Equipo ganador;

    private Boolean jugado;
    private int golesLocal;
    private int golesVisitante;

    public Partido(Equipo local, Equipo visitante){
        assert (local!=null);
        assert (visitante!=null);
        assert (!local.equals(visitante));

        this.setLocal(local);
        this.setVisitante(visitante);
        this.setGolesLocal(0);
        this.setGolesVisitante(0);
        this.jugado = false;


        local.addPartidosLocal(this);
        visitante.addPartidosVisitantes(this);

        assert (this.getGolesLocal() >= 0 && this.getGolesVisitante()>=0);
    }


    public Equipo getLocal() {
        return local;
    }

    private void setLocal(Equipo local) {
        assert (local != null);
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    private void setVisitante(Equipo visitante) {
        assert (visitante != null);
        this.visitante = visitante;
    }

    public Equipo getGanador() {
        return ganador;
    }

    private void setGanador(Equipo ganador) {
        this.ganador = ganador;
    }

    public Boolean getJugado() {
        return jugado;
    }

    public void setJugado() {
        assert (!this.jugado);
        this.jugado = true;
        if(this.getGolesLocal() > this.getGolesVisitante()){
            this.setGanador(this.getLocal());
            this.getLocal().addPartidosGanados(this);
        }else if(this.getGolesLocal() > this.getGolesVisitante()){
            this.setGanador(this.getVisitante());
            this.getVisitante().addPartidosGanados(this);
        }else{
            this.setGanador(null);
        }
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    private void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    private void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }


    public void golLocal(){
        assert (!this.jugado);
        this.setGolesLocal(this.getGolesLocal()+1);
    }

    public void golVisitante(){
        assert (!this.jugado);
        this.setGolesVisitante(this.getGolesVisitante() + 1);
    }
}
