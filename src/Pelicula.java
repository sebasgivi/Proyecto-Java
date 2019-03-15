
import java.util.ArrayList;


public class Pelicula {
    
    private String nombre_;
    private String genero_;
    private int edad_;
    private float puntuacion_;
    private ArrayList <Funcion> listaFunciones_ = new ArrayList<>();
    
    //si se debe crear con puntuacion o se le coloca despues ?
    public Pelicula(String nombre, String genero, int edad, float puntuacion,
                    ArrayList<Funcion> listaFunciones){
        this.nombre_ = nombre;
        this.genero_ = genero;
        this.edad_ = edad;
        this.puntuacion_ = puntuacion;
        this.listaFunciones_ = listaFunciones;
    }
    
    public static void crearPelicula(String nombre, String genero, int edad, float puntuacion,
                    ArrayList<Funcion> listaFunciones){
        new Pelicula(nombre,genero,edad,puntuacion,listaFuncones);    
    }
    
    public void borrarPelicula(Pelicula pelicula){
        pelicula = null;
        }
    
    public String getNombre(){
        return this.nombre_;
    }
    
    public void setNombre(String nombre){
        this.nombre_ = nombre;
    }
    
    public String getGenero(){
        return this.genero_;
    }
    
    public void setGenero(String genero){
        this.genero_ = genero;
    }
    
    public int getEdad(){
        return this.edad_;
    }
    
    public void setEdad(int edad){
        this.edad_ = edad;
    }
    
    public Float getPuntuacion(){
        return this.puntuacion_;
    }
    
    public void setPuntuacion(Float puntuacion){
        this.puntuacion_ = puntuacion;
    }
    
    public ArrayList<Funcion> getFunciones(){
        return this.listaFunciones_;
    }
}

