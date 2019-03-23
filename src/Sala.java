import java.util.*;
public class Sala {
    
   private int cantidadSillas_;
   private int numeroSala_;
   public LinkedList<Funcion> funcionesDisponibles_ = new LinkedList<Funcion>();
   public static ArrayList<Sala> listaSala = new ArrayList<>();

    public Sala(int cantidadSillas, int numeroSala) {
        this.cantidadSillas_ = cantidadSillas;
        this.numeroSala_ = numeroSala;
        Sala.listaSala.add(this);
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

    public void añadirFuncion(Funcion funcion) {
        this.funcionesDisponibles_.add(funcion);
    }
   
   public Pelicula buscarPelicula(String nombre){
       for(Pelicula pelicula : Pelicula.listaPeliculas){
           if(pelicula.getNombre().equals(nombre)){
               return pelicula;
           }
       }
       return null;
   }
}
