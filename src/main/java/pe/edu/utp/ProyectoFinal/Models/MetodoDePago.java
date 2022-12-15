package pe.edu.utp.ProyectoFinal.Models;

public class MetodoDePago {
    private int IDMetodoDePago;
    private String Nombre;

    public MetodoDePago(int IDMetodoDePago, String nombre) {
        this.IDMetodoDePago = IDMetodoDePago;
        Nombre = nombre;
    }

    public MetodoDePago() {
    }

    public int getIDMetodoDePago() {
        return IDMetodoDePago;
    }

    public void setIDMetodoDePago(int IDMetodoDePago) {
        this.IDMetodoDePago = IDMetodoDePago;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
