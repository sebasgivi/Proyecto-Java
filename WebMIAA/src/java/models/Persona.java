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

    public Persona(String nombre, String apellido, String correo, int edad, String clave, String tipo) {
        if (Persona.buscarPorCorreo(correo) == null) {
            this.nombre_ = nombre;
            this.apellido_ = apellido;
            this.correo_ = correo;
            this.edad_ = edad;
            this.clave_ = clave;
            this.tipo_ = tipo;
            Persona.listaPersonas_.add(this);
        }
    }

    public static Persona buscarPorCorreo(String correo) {
        for (Persona persona : Persona.getListaPersonas()) {
            if (correo.equals(persona.getCorreo())) {
                return persona;
            }
        }
        return null;
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

    public static Persona buscarPersona(String Nombre, ArrayList<Persona> lista) {
        for (Persona p : lista) {
            if (p.getNombre().equals(Nombre) || p.getCorreo() == Nombre) {
                return p;
            }
        }
        return null;
    }
    public static void DatosFicticios(){
        Sala s = new Sala(20,1);
        Pelicula p1=new Pelicula("see","see",18);
        new Funcion(p1,s,"12","3D");
        new Persona("Danny","Puto","milos@hot.com",18,"asd","Administrador");
        new Persona("Danny","Puto","u@hot.com",18,"asd","Usuario");
        
    }
}
