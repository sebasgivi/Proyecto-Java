package models;

import java.util.ArrayList;

public class Pelicula {

    private String nombre_;
    private String genero_;
    private int edad_;
    private String sinopsis_;
    private double puntuacion_;
    private ArrayList<Funcion> listaFunciones_ = new ArrayList<>();
    public static ArrayList<Pelicula> pelis = new ArrayList<>();

    public Pelicula(String nombre, String genero, int edad, double puntuacion) {
        if (buscarPelicula(nombre) == null) {
            this.nombre_ = nombre;
            this.sinopsis_ = "";
            this.genero_ = genero;
            this.edad_ = edad;
            this.puntuacion_ = puntuacion;
            Pelicula.pelis.add(this);
        }
    }

    public static Pelicula buscarPelicula(String nombre) {
        for (Pelicula pelicula : Pelicula.pelis) {
            if (pelicula.getNombre().equals(nombre)) {
                return pelicula;
            }
        }
        return null;
    }

    public void borrarPelicula(Pelicula pelicula) {
        pelicula = null;
    }

    public String getNombre() {
        return this.nombre_;
    }

    public void setNombre(String nombre) {
        this.nombre_ = nombre;
    }

    public String getGenero() {
        return this.genero_;
    }

    public void setGenero(String genero) {
        this.genero_ = genero;
    }

    public int getEdad() {
        return this.edad_;
    }

    public void setEdad(int edad) {
        this.edad_ = edad;
    }

    public double getPuntuacion() {
        return this.puntuacion_;
    }

    public void setPuntuacion(Float puntuacion) {
        this.puntuacion_ = puntuacion;
    }

    public ArrayList<Funcion> getListaFunciones_() {
        return listaFunciones_;
    }
    
    public ArrayList<Funcion> getFunciones() {
        return this.listaFunciones_;
    }

    public void añadirFuncion(Funcion funcion) {
        this.listaFunciones_.add(funcion);
    }

    public String getSinopsis_() {
        return sinopsis_;
    }

    public void setSinopsis_(String sinopsis_) {
        this.sinopsis_ = sinopsis_;
    }

}
