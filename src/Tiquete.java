
public class Tiquete {
    private static int contadorID = 0;
    private Funcion funcion_;
    private Factura factura_;
    private int silla_;
    private int ID_;
    private int precio_;

    public Tiquete(Funcion funcion, int silla, int precio) {
        this.funcion_ = funcion;
        this.silla_ = silla;
        this.ID_ = Tiquete.contadorID;
        Tiquete.contadorID++;
        this.precio_ = precio;
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

    public int getID_() {
        return ID_;
    }

    public int getPrecio_() {
        return precio_;
    }

}
