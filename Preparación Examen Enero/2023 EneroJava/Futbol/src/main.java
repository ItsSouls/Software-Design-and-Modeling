import todo.Equipo;
import todo.Estadio;
import todo.Partido;

public class main {
    public static void main(String[] args) {
        Estadio Bernabeu = new Estadio();
        Estadio CampNou = new Estadio();
        Equipo e1 = new Equipo(Bernabeu);
        Equipo e2 = new Equipo(CampNou);
        Partido p1 = new Partido(e1, e2);
        p1.golLocal();
        p1.setJugado();

        System.out.println("El ganador del partido es: " + p1.getGanador() +  " que ha jugado de local, con un resultado de " +
                p1.getGolesLocal() +  " vs " +  p1.getGolesVisitante());
    }
}
