package models;
import java.util.*;

public class Persona {

    private String nombre_;
    private String apellido_;
    private String correo_;
    private int edad_;
    private String clave_;
    private String tipo_;
    private static ArrayList<Persona> listaPersonas_ = new ArrayList<>();
    
    public Persona() {
    }

    public Persona(String nombre, String apellido,String correo, int edad, String clave,String tipo) {
        this.nombre_ = nombre;
        this.apellido_= apellido;
        this.correo_ = correo;
        this.edad_ = edad;
        this.clave_ = clave;
        this.tipo_ = tipo;
        Persona.listaPersonas_.add(this);
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

    public String getCorreo() {
        return correo_;
    }

    public void setCorreo(String correo_) {
        this.correo_ = correo_;
    }
    
    public String getTipo() {
        return tipo_;
    }

    public void setTipo(String tipo_) {
        this.tipo_ = tipo_;
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

    public static ArrayList<Persona> getListaPersonas() {
        return listaPersonas_;
    }
    
    
    public static Persona buscarPersona(String Nombre,ArrayList<Persona> lista) {
        for (Persona p : lista) {
            if (p.getNombre() == Nombre || p.getCorreo()== Nombre) {
                return p;
            }
        }
        return null;
    }
}