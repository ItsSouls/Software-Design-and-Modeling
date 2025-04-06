package todo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Enumeration;

public class Aerolinea {

    private List<Alquiler> alquiler;

    public Aerolinea(Avion a, int precio, int duracion, int comienzo){
        assert(duracion < 5);
        alquiler = new ArrayList<Alquiler>();
        Alquiler al = new Alquiler(a, this, precio, comienzo, duracion);
    }

    protected void addAlquiler(Alquiler a){
        alquiler.add(a);

    }
    protected void rmAlquiler(Alquiler a){
        alquiler.remove(a);

    }

    public Enumeration<Alquiler> getAlquiler(){
        return Collections.enumeration(alquiler);
    }

    protected boolean checkDuration(){
        Enumeration<Alquiler> it = this.getAlquiler();
        int count=0, total=0;
        while (it.hasMoreElements()){
            total++;
            if (it.nextElement().duration>5) count++;
        }
        return(count*100/total)>20;
    }
}


