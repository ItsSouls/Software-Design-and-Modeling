public class VehiculoAnfibio extends Vehiculo {

    VehiculoTerrestre vt;
    VehiculoMarino vm;
    Vehiculo vehiculoActual;

    public VehiculoAnfibio(Entorno e) {
        super(e);
        vt = new VehiculoTerrestre(Entorno.tierra, 0);
        vm = new VehiculoMarino(Entorno.agua);
        vehiculoActual = (e==Entorno.agua)?vm:vt;
    }
    void setMaxVelocidad(float m) {this.vehiculoActual.setMaxVelocidad(m);}

    float getMaxVelocidad() {return this.vehiculoActual.getMaxVelocidad();}

    void setDelta(float m) {this.vehiculoActual.setDelta(m);}

    float getDelta() {return this.vehiculoActual.getDelta();}

    void setPosicion(float p) {this.vehiculoActual.setPosicion(p);}

    public float getPosicion() {return this.vehiculoActual.getPosicion();}

    void setVelocidad(float v) {this.vehiculoActual.setVelocidad(v);}

    public float getVelocidad() {return this.vehiculoActual.getVelocidad();}

    public void setSonar(boolean b) {this.vm.setSonar(b);}

    public boolean getSonar() {return this.vm.getSonar();}

    public void setNumRuedas(int n) {this.vt.setNumRuedas(n);}

    public int getNumRuedas() {return this.vt.getNumRuedas();}

    public void setEntorno(Entorno e) {
        if (this.getEntorno()!=e) { //cambia el entorno, tenemos que cambiar la referencia
            if (e==Entorno.agua) { // cambia a Agua
                vm.setPosicion(this.vehiculoActual.getPosicion());
                vm.setVelocidad(Math.min(this.vehiculoActual.getVelocidad(),vm.getMaxVelocidad()));
                this.vehiculoActual = vm;
            } else {
                if (e==Entorno.tierra) { // cambia a Tierra
                    vt.setPosicion(this.vehiculoActual.getPosicion());
                    vt.setVelocidad(Math.min(this.vehiculoActual.getVelocidad(),vt.getMaxVelocidad()));
                    this.vehiculoActual = vt;
                } else {
                    this.setVelocidad(0.0f); //we cannot move in other environments;
                }
            };
            super.setEntorno(e);
        }
    }
    public void avanzar(int segundos) {
        this.vehiculoActual.avanzar(segundos);
    }
    public void aumentarVelocidad() {
        this.vehiculoActual.aumentarVelocidad();
    }
    public void disminuirVelocidad() {
        this.vehiculoActual.disminuirVelocidad();
    }
}

