package pe.edu.utp.ProyectoFinal.Models;


public class Proveedor {


    private int idProveedor;
    private String nombre;
    private String apellido_Materno;
    private String apellido_Paterno;
    private String direccion;
    private String email;
    private int celular;
    private int dni;
    private int idProducto;
    private int idMetodoDePago;

    public Proveedor(int idProveedor, String nombre, String apellido_Materno, String apellido_Paterno, String direccion, String email, int celular, int dni, int idProducto, int idMetodoDePago) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.apellido_Materno = apellido_Materno;
        this.apellido_Paterno = apellido_Paterno;
        this.direccion = direccion;
        this.email = email;
        this.celular = celular;
        this.dni = dni;
        this.idProducto = idProducto;
        this.idMetodoDePago = idMetodoDePago;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_Materno() {
        return apellido_Materno;
    }

    public void setApellido_Materno(String apellido_Materno) {
        this.apellido_Materno = apellido_Materno;
    }

    public String getApellido_Paterno() {
        return apellido_Paterno;
    }

    public void setApellido_Paterno(String apellido_Paterno) {
        this.apellido_Paterno = apellido_Paterno;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdMetodoDePago() {
        return idMetodoDePago;
    }

    public void setIdMetodoDePago(int idMetodoDePago) {
        this.idMetodoDePago = idMetodoDePago;
    }
}