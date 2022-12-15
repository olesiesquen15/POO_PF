package pe.edu.utp.ProyectoFinal.Models;

public class Cargo {
    private int IDCargo;
    private String Descripcion;
    private int Sueldo;
    private int HorasDeTrabajo;

    public Cargo(int IDCargo, String descripcion, int sueldo, int horasDeTrabajo) {
        this.IDCargo = IDCargo;
        Descripcion = descripcion;
        Sueldo = sueldo;
        HorasDeTrabajo = horasDeTrabajo;
    }

    public Cargo() {
    }

    public int getIDCargo() {
        return IDCargo;
    }

    public void setIDCargo(int IDCargo) {
        this.IDCargo = IDCargo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public int getSueldo() {
        return Sueldo;
    }

    public void setSueldo(int sueldo) {
        Sueldo = sueldo;
    }

    public int getHorasDeTrabajo() {
        return HorasDeTrabajo;
    }

    public void setHorasDeTrabajo(int horasDeTrabajo) {
        HorasDeTrabajo = horasDeTrabajo;
    }

}
