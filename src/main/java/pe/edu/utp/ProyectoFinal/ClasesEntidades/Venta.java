package pe.edu.utp.ProyectoFinal.ClasesEntidades;

public class Venta {

    public Venta() {
    }
    private int IDVenta;
    private int IDEmpleado;
    private int IDComprobanteDePago;
    private int IDetalleVenta;
    private int IDEmpresa;
    private int IDMetodo_de_pago;

    private float MontoIngresado;

    private float MontoDevuelto;

    private int NroEmpleadosMujeres;

    private Sucursal sucursal;

    private int RUC;

    public Venta(int IDVenta, int IDEmpleado, int IDComprobanteDePago, int IDetalleVenta, int IDEmpresa, int IDMetodo_de_pago, float montoIngresado, float montoDevuelto, int nroEmpleadosMujeres, Sucursal sucursal, int RUC) {
        this.IDVenta = IDVenta;
        this.IDEmpleado = IDEmpleado;
        this.IDComprobanteDePago = IDComprobanteDePago;
        this.IDetalleVenta = IDetalleVenta;
        this.IDEmpresa = IDEmpresa;
        this.IDMetodo_de_pago = IDMetodo_de_pago;
        MontoIngresado = montoIngresado;
        MontoDevuelto = montoDevuelto;
        NroEmpleadosMujeres = nroEmpleadosMujeres;
        this.sucursal = sucursal;
        this.RUC = RUC;
    }

    public int getIDVenta() {
        return IDVenta;
    }

    public void setIDVenta(int IDVenta) {
        this.IDVenta = IDVenta;
    }

    public int getIDEmpleado() {
        return IDEmpleado;
    }

    public void setIDEmpleado(int IDEmpleado) {
        this.IDEmpleado = IDEmpleado;
    }

    public int getIDComprobanteDePago() {
        return IDComprobanteDePago;
    }

    public void setIDComprobanteDePago(int IDComprobanteDePago) {
        this.IDComprobanteDePago = IDComprobanteDePago;
    }

    public int getIDetalleVenta() {
        return IDetalleVenta;
    }

    public void setIDetalleVenta(int IDetalleVenta) {
        this.IDetalleVenta = IDetalleVenta;
    }

    public int getIDEmpresa() {
        return IDEmpresa;
    }

    public void setIDEmpresa(int IDEmpresa) {
        this.IDEmpresa = IDEmpresa;
    }

    public int getIDMetodo_de_pago() {
        return IDMetodo_de_pago;
    }
    public void setIDMetodo_de_pago(int IDMetodo_de_pago) {
        this.IDMetodo_de_pago = IDMetodo_de_pago;
    }
    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public float getMontoIngresado() {
        return MontoIngresado;
    }

    public void setMontoIngresado(float montoIngresado) {
        MontoIngresado = montoIngresado;
    }

    public float getMontoDevuelto() {
        return MontoDevuelto;
    }

    public void setMontoDevuelto(float montoDevuelto) {
        MontoDevuelto = montoDevuelto;
    }

    public int getNroEmpleadosMujeres() {
        return NroEmpleadosMujeres;
    }

    public void setNroEmpleadosMujeres(int nroEmpleadosMujeres) {
        NroEmpleadosMujeres = nroEmpleadosMujeres;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public int getRUC() {
        return RUC;
    }

    public void setRUC(int RUC) {
        this.RUC = RUC;
    }
}