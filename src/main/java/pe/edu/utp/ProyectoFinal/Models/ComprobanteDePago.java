package pe.edu.utp.ProyectoFinal.Models;

import java.time.LocalDateTime;

public class ComprobanteDePago {

    private int idComprobante;
    private String nombre;
    private int idEmpleado;
    private int idEmpresa;
    private int nro_Serie;
    private LocalDateTime fecha_emisión;
    private int idProducto;
    private int cantidad_producto;
    private double monto;

    public ComprobanteDePago(int idComprobante, String nombre, int idEmpleado, int idEmpresa,
                             int nro_Serie, LocalDateTime fecha_emisión, int idProducto, int cantidad_producto, double monto) {
        this.idComprobante = idComprobante;
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this.idEmpresa = idEmpresa;
        this.nro_Serie = nro_Serie;
        this.fecha_emisión = fecha_emisión;
        this.idProducto = idProducto;
        this.cantidad_producto = cantidad_producto;
        this.monto = monto;
    }

    public ComprobanteDePago() {
    }

    public int getIdComprobante() {
        return idComprobante;
    }

    public void setIdComprobante(int idComprobante) {
        this.idComprobante = idComprobante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getNro_Serie() {
        return nro_Serie;
    }

    public void setNro_Serie(int nro_Serie) {
        this.nro_Serie = nro_Serie;
    }

    public LocalDateTime getFecha_emisión() {
        return fecha_emisión;
    }

    public void setFecha_emisión(LocalDateTime fecha_emisión) {
        this.fecha_emisión = fecha_emisión;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad_producto() {
        return cantidad_producto;
    }

    public void setCantidad_producto(int cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
