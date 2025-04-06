package todo;

import java.util.*;

public class Avion {

    private List<Alquiler> alquiler;

    public Avion(){
        alquiler = new ArrayList<Alquiler>();
    }

    protected void addAlquiler(Alquiler a){alquiler.add(a);}

    protected void rmAlquiler(Alquiler a){alquiler.remove(a);}

    public Enumeration<Alquiler> getAlquiler(){
        return Collections.enumeration(alquiler);
    }

    protected int alquilerMayor4Anios(){
        Enumeration<Alquiler> it = this.getAlquiler();
        int cont = 0;
        while(it.hasMoreElements()){
            if (it.nextElement().duration>4) cont++;
        }
        return cont;
    }
    protected boolean alquiladoEn(Aerolinea a){
        Enumeration<Alquiler> it = this.getAlquiler();
        while(it.hasMoreElements()){
            if (it.nextElement().aerolinea==a) return true;
        }
        return false;
    }
    protected boolean sinSolapamientos(){

        Enumeration<Alquiler> itlistaAlquiler = this.getAlquiler();
        Enumeration<Alquiler> itActualAlquiler;

        boolean found = false;

        while (itlistaAlquiler.hasMoreElements() && !found){
            Alquiler listaAlquiler = itlistaAlquiler.nextElement();
            itActualAlquiler = this.getAlquiler();

            while (itActualAlquiler.hasMoreElements() && !found){
                Alquiler actualAlquiler = itlistaAlquiler.nextElement();

                if (actualAlquiler != listaAlquiler && listaAlquiler.getComienzo() == actualAlquiler.getComienzo()){
                    found = true;
                }
            }
        }
        return found;
    }
}
