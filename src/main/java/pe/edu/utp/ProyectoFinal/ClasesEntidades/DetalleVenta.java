package pe.edu.utp.ProyectoFinal.ClasesEntidades;

public class DetalleVenta {
    private int IDDetalleVenta;
    private int IDVenta;
    private int IDProducto;
    private int Cantidad;
    private float Monto_Total;

    public DetalleVenta(int IDDetalleVenta, int IDVenta, int IDProducto, int cantidad, float monto_Total) {
        this.IDDetalleVenta = IDDetalleVenta;
        this.IDVenta = IDVenta;
        this.IDProducto = IDProducto;
        Cantidad = cantidad;
        Monto_Total = monto_Total;
    }

    public DetalleVenta() {
    }

    public int getIDDetalleVenta() {
        return IDDetalleVenta;
    }

    public void setIDDetalleVenta(int IDDetalleVenta) {
        this.IDDetalleVenta = IDDetalleVenta;
    }

    public int getIDVenta() {
        return IDVenta;
    }

    public void setIDVenta(int IDVenta) {
        this.IDVenta = IDVenta;
    }

    public int getIDProducto() {
        return IDProducto;
    }

    public void setIDProducto(int IDProducto) {
        this.IDProducto = IDProducto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public float getMonto_Total() {
        return Monto_Total;
    }

    public void setMonto_Total(float monto_Total) {
        Monto_Total = monto_Total;
    }
}
