package pe.edu.utp.ProyectoFinal.ClasesEntidades;

public class Ciudad {
    private int IDCiudad;
    private int IDPais;
    private String Nombre;

    public Ciudad(int IDCiudad, int IDPais, String nombre) {
        this.IDCiudad = IDCiudad;
        this.IDPais = IDPais;
        Nombre = nombre;
    }

    public Ciudad() {
    }

    public int getIDCiudad() {
        return IDCiudad;
    }

    public void setIDCiudad(int IDCiudad) {
        this.IDCiudad = IDCiudad;
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
