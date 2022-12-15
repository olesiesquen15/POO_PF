package pe.edu.utp.ProyectoFinal.Models;

public class Producto {

    private int IDProducto;
    private String Nombre;
    private String Descripcion;
    private int Precio;
    private int Disponibilidad;
    private int IDCiudadOrigen;
    private int Peso;
    private int IDCategoria;
    private int IDProveedor;

    public Producto(int IDProducto, String nombre, String descripcion, int precio, int disponibilidad, int IDCiudadOrigen, int peso, int IDCategoria, int IDProveedor) {
        this.IDProducto = IDProducto;
        Nombre = nombre;
        Descripcion = descripcion;
        Precio = precio;
        Disponibilidad = disponibilidad;
        this.IDCiudadOrigen = IDCiudadOrigen;
        Peso = peso;
        this.IDCategoria = IDCategoria;
        this.IDProveedor = IDProveedor;
    }

    public Producto(){

    }

    public int getIDProducto() {
        return IDProducto;
    }

    public void setIDProducto(int IDProducto) {
        this.IDProducto = IDProducto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

    public int getDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponibilidad(int disponibilidad) {
        Disponibilidad = disponibilidad;
    }

    public int getIDCiudadOrigen() {
        return IDCiudadOrigen;
    }

    public void setIDCiudadOrigen(int IDCiudadOrigen) {
        this.IDCiudadOrigen = IDCiudadOrigen;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int peso) {
        Peso = peso;
    }

    public int getIDCategoria() {
        return IDCategoria;
    }

    public void setIDCategoria(int IDCategoria) {
        this.IDCategoria = IDCategoria;
    }

    public int getIDProveedor() {
        return IDProveedor;
    }

    public void setIDProveedor(int IDProveedor) {
        this.IDProveedor = IDProveedor;
    }
}
