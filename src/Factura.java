import java.util.LinkedList;
public class Factura {
    private String comprador_;
    private LinkedList<Tiquete> tiquete_;
    private int precio_;

    public Factura(String comprador) {
        this.comprador_ = comprador;
    }
    
    public void agregarTiquete(Tiquete tiquete){
        this.tiquete_.add(tiquete);
        //Precio debe ir aqui o en Tiquete?
    }
    
    public String getComprador_() {
        return comprador_;
    }

    public LinkedList<Tiquete> getTiquete_() {
        return tiquete_;
    }

    public int getPrecio_() {
        return precio_;
    }
}
