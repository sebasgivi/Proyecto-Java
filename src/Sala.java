import java.util.*;
public class Sala {
    
   private int cantidadSillas_;
   private int numeroSala_;
   private LinkedList<Funcion> funcionesDisponibles_ = new LinkedList<Funcion>();

    public Sala(int cantidadSillas, int numeroSala, LinkedList<Funcion> funciones) {
        this.cantidadSillas_ = cantidadSillas;
        this.numeroSala_ = numeroSala;
        this.funcionesDisponibles_ = funciones;
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

    private void setCantidadSillas_(int cantidadSillas_) {
        this.cantidadSillas_ = cantidadSillas_;
    }

    private void setNumeroSala_(int numeroSala_) {
        this.numeroSala_ = numeroSala_;
    }

    private void setFuncionesDisponibles_(LinkedList<Funcion> funcionesDisponibles_) {
        this.funcionesDisponibles_ = funcionesDisponibles_;
    }
   
   
}
