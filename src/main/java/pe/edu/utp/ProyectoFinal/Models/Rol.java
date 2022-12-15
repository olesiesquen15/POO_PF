package pe.edu.utp.ProyectoFinal.Models;

public class Rol {
    private int IDRol;
    private Enum Descripcion;

    public Rol(int IDRol, Enum descripcion) {
        this.IDRol = IDRol;
        Descripcion = descripcion;
    }

    public int getIDRol() {
        return IDRol;
    }

    public void setIDRol(int IDRol) {
        this.IDRol = IDRol;
    }

    public Enum getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(Enum descripcion) {
        Descripcion = descripcion;
    }
}
