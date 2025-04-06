import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Vehiculo {

    private float maxVelocidad;
    private float delta;
    private float posicion;
    private float velocidad;
    private Entorno entorno;
    private List<Participacion> participacion = new ArrayList<Participacion>();
    //Constructor
    public Vehiculo(Entorno e) {
        this.entorno = e;
        this.posicion = 0;
        this.velocidad = 0;
    }

    void setMaxVelocidad(float m) {this.maxVelocidad = m;}

    float getMaxVelocidad() {return this.maxVelocidad;}

    void setDelta(float m) {this.delta = m;}

    float getDelta() {return this.delta;}

    void setPosicion(float p) {this.posicion = p;}

    public float getPosicion() {return this.posicion;}

    void setVelocidad(float v) {this.velocidad = v;}

    public float getVelocidad() {return this.velocidad;}

    public Entorno getEntorno() {return this.entorno;}

    public void setEntorno(Entorno e) {this.entorno=e;}

    public Enumeration<Participacion> getParticipacion() {
        return java.util.Collections.enumeration(this.participacion);
    }
    void addParticipacion(Participacion p) {
        this.participacion.add(p);
    }
    void moverse(int segundos) { // función auxiliar para actualizar la posicion
        assert(segundos>=0);
        this.setPosicion(this.getPosicion() + this.getVelocidad()*segundos);
    }
    public void avanzar(int segundos) {
        assert(segundos>=0);
        this.moverse(segundos);
    }
    public void aumentarVelocidad() {
        if (this.getVelocidad() < this.getMaxVelocidad())
            this.setVelocidad(Math.min(this.getVelocidad() + this.getDelta(),this.getMaxVelocidad()));
    }
    public void disminuirVelocidad() {
        if (this.getVelocidad() > 0)
            this.setVelocidad(Math.max(this.getVelocidad() - this.getDelta(),0.0f));
    }
}
