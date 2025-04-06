public class VehiculoMarino extends Vehiculo{
    private boolean sonar;
    public VehiculoMarino(Entorno e) {
        super(e);
        this.setMaxVelocidad(10.0f);
        this.setDelta(2.0f);
        this.sonar=false;
    }
    public void setSonar(boolean b) {this.sonar=b;}
    public boolean getSonar() {return this.sonar;}
    public void avanzar(int segundos) {
        assert(segundos>=0);
        if (this.getEntorno()==Entorno.agua) //solo nos podemos mover en agua
            this.moverse(segundos);
    }
}
