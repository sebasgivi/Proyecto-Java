
public class Tiquete {
    private Funcion funcion_;
    private Factura factura_;
    private int silla_;
    private String ID_;

    public Tiquete(Funcion funcion, int silla, String ID) {
        this.funcion_ = funcion;
        this.silla_ = silla;
        this.ID_ = ID;
    }

    public Funcion getFuncion_() {
        return funcion_;
    }

    public Factura getFactura_() {
        return factura_;
    }

    public int getSilla_() {
        return silla_;
    }

    public String getID_() {
        return ID_;
    }
}
