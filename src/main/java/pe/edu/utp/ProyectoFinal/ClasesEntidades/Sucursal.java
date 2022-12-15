package pe.edu.utp.ProyectoFinal.ClasesEntidades;

public class Sucursal {

    public Sucursal() {
    }
    private int IDSucursal;
    private String Nombre;
    private String Direccion;
    private int IDCiudad;


    public Sucursal(int IDSucursal, String nombre, String direccion, int IDCiudad) {
        this.IDSucursal = IDSucursal;
        Nombre = nombre;
        Direccion = direccion;
        this.IDCiudad = IDCiudad;
    }


    public int getIDSucursal() {
        return IDSucursal;
    }

    public void setIDSucursal(int IDSucursal) {
        this.IDSucursal = IDSucursal;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public int getIDCiudad() {
        return IDCiudad;
    }

    public void setIDCiudad(int IDCiudad) {
        this.IDCiudad = IDCiudad;
    }


}