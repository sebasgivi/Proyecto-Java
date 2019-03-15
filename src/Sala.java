import java.util.*;
public class Sala {
    
   private int cantidadSillas_;
   private int numeroSala_;
   public LinkedList<Funcion> funcionesDisponibles_ = new LinkedList<Funcion>();
   public static ArrayList<Sala> listaSala = new ArrayList<>();

    private Sala(int cantidadSillas, int numeroSala) {
        this.cantidadSillas_ = cantidadSillas;
        this.numeroSala_ = numeroSala;
        Sala.listaSala.add(this);
    }
    public static void crearSala(int cantidadSillas, int numeroSala){
        new Sala(cantidadSillas,numeroSala);
        
    }

    public int getCantidadSillas_() {
        return cantidadSillas_;
    }

    public int getNumeroSala_() {
        return numeroSala_;
    }

    public LinkedList<Funcion> getFuncionesDisponibles_() {
        return funcionesDisponibles_;
    }

    public void setCantidadSillas_(int cantidadSillas_) {
        this.cantidadSillas_ = cantidadSillas_;
    }

    public void setNumeroSala_(int numeroSala_) {
        this.numeroSala_ = numeroSala_;
    }

    public void añadirFuncion(Funcion funcion) {
        this.funcionesDisponibles_.add(funcion);
    }
   
   
}
