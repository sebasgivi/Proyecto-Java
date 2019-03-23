
import java.util.*;

public class Funcion {

    private static ArrayList<Funcion> funciones_ = new ArrayList<>();
    private Pelicula pelicula_;
    private Sala sala_;
    private String horaDeFuncion_;
    private Tiquete[] listaTiquetes;
    private String formato_;
    private LinkedList<Integer> sillasDisponibles_ = new LinkedList<Integer>();

    public Funcion(Pelicula pelicula, Sala sala, String horaDeFuncion, String formato) {
        this.pelicula_ = pelicula;
        this.sala_ = sala;
        this.horaDeFuncion_ = horaDeFuncion;
        this.formato_ = formato;
        Funcion.funciones_.add(this);
        sala.añadirFuncion(this);
        pelicula.añadirFuncion(this);
        crearTiquetes(sala.getCantidadSillas_());
    }

    public static ArrayList<Funcion> getfunciones_() {
        return funciones_;
    }

    public String getHoraDeFuncion() {
        return horaDeFuncion_;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    private void crearTiquetes(int cantidad) {
        this.listaTiquetes = new Tiquete[cantidad];
        for (int i = 0; i < cantidad; i++) {
            if (this.formato_.equals("2D")) {
                this.listaTiquetes[i] = new Tiquete(this, i + 1,4000);
            }
            else{
                this.listaTiquetes[i] = new Tiquete(this, i + 1,6000);
            }
        }
        for (int i = 0; i < this.sala_.getCantidadSillas_(); i++) {
            this.sillasDisponibles_.add(i+1);
        }
    }

    public LinkedList<Integer> getSillasDisponibles_() {
        return sillasDisponibles_;
    }

    public String getFormato_() {
        return formato_;
    }

}
