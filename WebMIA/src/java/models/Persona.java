package models;
import java.util.*;

public class Persona {

    private String nombre_;
    private String apellido_;
    private long numeroIdentificacion_;
    private int edad_;
    private String clave_;
    public static ArrayList<Persona> listaPersonas = new ArrayList<>();
    
    public Persona() {
    }

    public Persona(String nombre, String apellido,long id, int edad, String clave) {
        this.nombre_ = nombre;
        this.apellido_= apellido;
        this.numeroIdentificacion_ = id;
        this.edad_ = edad;
        this.clave_ = clave;
        Persona.listaPersonas.add(this);
    }

    public String getNombre() {
        return nombre_;
    }

    public void setNombre(String nombre_) {
        this.nombre_ = nombre_;
    }

    public String getApellido() {
        return apellido_;
    }

    public void setApellido(String apellido_) {
        this.apellido_ = apellido_;
    }

    public long getNumeroIdentificacion() {
        return numeroIdentificacion_;
    }

    public void setNumeroIdentificacion(long numeroIdentificacion) {
        this.numeroIdentificacion_ = numeroIdentificacion;
    }
    
    public int getEdad() {
        return edad_;
    }

    public void setEdad(int edad_) {
        this.edad_ = edad_;
    }

    public String getClave() {
        return clave_;
    }

    public void setClave(String clave_) {
        this.clave_ = clave_;
    }
    
    
    public static Persona buscarPersona(String Nombre , List<Persona> lista) {
        for (Persona p : lista) {
            if (p.getNombre() == Nombre) {
                return p;
            }
        }
        return null;
    }

    public static Persona buscarPersona(long id ,List<Persona> lista) {
        for (Persona p : lista) {
            if (p.getNumeroIdentificacion()== id) {
                return p;
            }
        }
        return null;
    }

}