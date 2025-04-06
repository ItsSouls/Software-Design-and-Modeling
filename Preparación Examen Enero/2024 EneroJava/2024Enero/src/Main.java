import java.util.Enumeration;
import todo.Aerolinea;
import todo.Avion;
import todo.Alquiler;

public class Main {
    public static void main(String[] args) {
        try {
            Avion avion1 = new Avion();

            Aerolinea aerolinea1 = new Aerolinea(avion1,1000, 3, 2023);

            Alquiler alquiler4 = new Alquiler(avion1, aerolinea1, 2500, 2026, 5);

            try {
                Alquiler alquiler5 = new Alquiler(avion1, aerolinea1, 3000, 2027, 6);
            } catch (AssertionError e) {
                System.out.println("Restricción cumplida: No se permite más del 20% de alquileres con duración > 5 años.");
            }

            System.out.println("Alquileres en avión 1:");
            Enumeration<Alquiler> alquileresAvion1 = avion1.getAlquiler();
            while (alquileresAvion1.hasMoreElements()) {
                Alquiler a = alquileresAvion1.nextElement();
                System.out.println("  Año de comienzo: " + a.getComienzo() + ", Duración: " + a.getDuration());
            }

        } catch (Exception e) {
            System.out.println("Se produjo un error: " + e.getMessage());
        }
    }
}

