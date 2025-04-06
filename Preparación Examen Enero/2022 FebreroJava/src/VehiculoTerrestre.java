public class VehiculoTerrestre extends Vehiculo{
    private int numRuedas = 0;

    public VehiculoTerrestre(Entorno e, int nRuedas) {
        super(e);
        assert nRuedas >= 0;
        this.setMaxVelocidad(30.0f);
        this.setDelta(5.0f);
        this.numRuedas=nRuedas;
    }
    public void setNumRuedas(int n) {
        assert n>=0;
        this.numRuedas=n;
    }
    public int getNumRuedas() {
        return this.numRuedas;
    }
    public void avanzar(int segundos) {
        assert(segundos>=0);
        if (this.getEntorno()==Entorno.tierra) //solo nos podemos mover en tierra
            this.moverse(segundos);
    }
}
