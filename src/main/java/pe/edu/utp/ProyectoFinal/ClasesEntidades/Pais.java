package pe.edu.utp.ProyectoFinal.ClasesEntidades;

public class Pais {

    public Pais() {
    }
    private int IDPais;
    private String Nombre;

    public Pais(int IDPais, String nombre) {
        this.IDPais = IDPais;
        Nombre = nombre;
    }

    public int getIDPais() {
        return IDPais;
    }
    public void setIDPais(int IDPais) {
        this.IDPais = IDPais;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }


}