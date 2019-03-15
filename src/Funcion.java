import java.util.*;
public class Funcion {
    private static ArrayList<Funcion> funciones_ = new ArrayList<>();
    private Pelicula pelicula_;
    private Sala sala_;
    private String horaDeFuncion_; 
    
    private Funcion(Pelicula pelicula, Sala sala, String horaDeFuncion){
        this.pelicula_ = pelicula;
        this.sala_ = sala;
        this.horaDeFuncion_ = horaDeFuncion;
        Funcion.funciones_.add(this);
        sala.añadirFuncion(this);
        pelicula.añadirFuncion(this);
    }   
    
    public static void crearFuncion(Pelicula pelicula, Sala sala, String horaDeFuncion){        
        new Funcion(pelicula,sala,horaDeFuncion);
    }
    
    public static ArrayList<Funcion> getfunciones_(){
        return funciones_;
    }
    
    public String getHoraDeFuncion(){
        return horaDeFuncion_;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
