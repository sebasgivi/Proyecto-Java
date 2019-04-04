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
    private ArrayList<Integer> votos = new ArrayList<>();

    public Pelicula(String nombre, String genero, int edad) {
        if (buscarPelicula(nombre) == null) {
            this.nombre_ = nombre;
            this.sinopsis_ = "";
            this.genero_ = genero;
            this.edad_ = edad;
            this.puntuacion_ = calcularVotos(votos);
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

    public ArrayList<Integer> getVotos() {
        return votos;
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

    public String getSinopsis() {
        return sinopsis_;
    }

    public void setSinopsis(String sinopsis_) {
        this.sinopsis_ = sinopsis_;
    }

    public static String concatenar(Pelicula pelicula, String Hora) {
        String peliculaFuncion = pelicula.getNombre().concat("-");
        peliculaFuncion = peliculaFuncion.concat(Hora);
        return peliculaFuncion;
    }

    public static Funcion buscarFuncion(Pelicula pelicula, String Hora) {
        for (Funcion funcion : pelicula.getFunciones()) {
            if (funcion.getHoraDeFuncion().equals(Hora)) {
                return funcion;
            }
        }
        return null;
    }

    public int calcularVotos(ArrayList<Integer> votos) {
        if (votos.isEmpty()) {
            return 0;
        } else {
            int suma = 0;
            int cont = 0;
            for (int voto : votos) {
                suma = suma + voto;
                cont = cont + 1;
            }
            int prom = suma / cont;
            return prom;
        }
    }
}
