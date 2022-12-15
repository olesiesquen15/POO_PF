package pe.edu.utp.ProyectoFinal.Models;

public class Usuario {

    public Usuario() {
    }
    private int IDUsuario;
    private String Nombre_Usuario;
    private String Password;
    private int Fecha_Creacion;
    public int IDRol;

    public Usuario(int IDUsuario, String nombre_Usuario, String password, int fecha_Creacion, int IDRol) {
        this.IDUsuario = IDUsuario;
        Nombre_Usuario = nombre_Usuario;
        Password = password;
        Fecha_Creacion = fecha_Creacion;
        this.IDRol = IDRol;
    }


    public int getIDUsuario() {
        return IDUsuario;
    }

    public void setIDUsuario(int IDUsuario) {
        this.IDUsuario = IDUsuario;
    }

    public String getNombre_Usuario() {
        return Nombre_Usuario;
    }

    public void setNombre_Usuario(String nombre_Usuario) {
        Nombre_Usuario = nombre_Usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getFecha_Creacion() {
        return Fecha_Creacion;
    }

    public void setFecha_Creacion(int fecha_Creacion) {
        Fecha_Creacion = fecha_Creacion;
    }

    public int getIDRol() {
        return IDRol;
    }

    public void setIDRol(int IDRol) {
        this.IDRol = IDRol;
    }


}