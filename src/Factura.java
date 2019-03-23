import java.util.LinkedList;
import java.util.Date;
public class Factura {
    private String comprador_;
    private LinkedList<Tiquete> tiquete_;
    private int precio_;
    private Date horacompra_;

    public Factura(String comprador) {
        this.comprador_ = comprador;
        this.precio_ = 0;
    }
    
    public void agregarTiquete(Tiquete tiquete){
        this.tiquete_.add(tiquete);
        this.precio_+= tiquete.getPrecio_();
        this.horacompra_ = new java.util.Date();
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
