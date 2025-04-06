package Ejercicio1;

import java.util.Date;

public abstract class Socio {
    private Date registro;
    private Refugio refugio;

    public Socio(Date registro, Refugio refugio) {
        this.setRegistro(registro);
        this.setRefugio(refugio);
    }

    public Date getRegistro() {
        return this.registro;
    }

    private void setRegistro(Date registro) {
        assert (registro != null) : "La fecha de registro no puede ser nula";
        this.registro = registro;
    }

    public Refugio getRefugio() {
        return refugio;
    }

    protected void setRefugio(Refugio refugio) {
        assert (refugio != null) : "El refugio no puede ser nulo";

        this.refugio = refugio;
        this.refugio.addSocio(this);
    }
}

