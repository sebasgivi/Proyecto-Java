
public class Main {
    public static void main(String[] args){
        for (int i = 1; i<=5;i++){
            Sala.crearSala(40,i);
        }
        Pelicula.crearPelicula("Capitana Marvel","heroes", 5, 5.0);
        Pelicula.crearPelicula("Aquaman","heroes", 18, 8.0);
        Pelicula.crearPelicula("NoIMPORTA","comedia", 1, 7.3);
        
        Funcion.crearFuncion(Pelicula.listaPeliculas.get(0), Sala.listaSala.get(0),"3:20");
        
        
    }
}
