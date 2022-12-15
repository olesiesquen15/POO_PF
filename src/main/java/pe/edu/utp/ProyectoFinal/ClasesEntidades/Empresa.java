package pe.edu.utp.ProyectoFinal.ClasesEntidades;

public class Empresa {

    private String IDEmpresa;
    private String Nombre_Empresa;
    private String Descripcion;
    private String Email;
    private String DireccionFiscal;
    private String Rubro;
    private String DireccionWeb;
    private int NumeroEmpleadosHombres;
    private int NumeroEmpleadosMujeres;
    private Sucursal sucursal;
    private int RUC;

    public Empresa(String IDEmpresa, String Nombre_Empresa, String descripcion, String Email, String DireccionFiscal, String Rubro, String DireccionWeb, int NumeroEmpleeadosHombres, int NumeroEmpleeadosMujeres, Sucursal sucursal, int RUC) {

        this.IDEmpresa = IDEmpresa;
        this.Nombre_Empresa = Nombre_Empresa;
        this.Descripcion = descripcion;
        this.Email = Email;
        this.DireccionFiscal = DireccionFiscal;
        this.Rubro = Rubro;
        this.DireccionWeb = DireccionWeb;
        this.NumeroEmpleadosHombres = NumeroEmpleeadosHombres;
        this.NumeroEmpleadosMujeres = NumeroEmpleeadosMujeres;
        this.sucursal = sucursal;
        this.RUC = RUC;

    }


    public String getIDEmpresa() {return IDEmpresa;}

    public void setIDEmpresa(String IDEmpresa) {this.IDEmpresa = IDEmpresa;}

    public String getNombre_Empresa() {return Nombre_Empresa;}

    public void setNombre_Empresa(String Nombre_Empresa) {this.Nombre_Empresa = Nombre_Empresa;}

    public String getDescripcion() {return Descripcion;}

    public void setDescripcion(String descripcion) {this.Descripcion = descripcion;}

    public String getEmail() {return Email;}

    public void setEmail(String Email) {this.Email = Email;}

    public String getDireccionFiscal() {return DireccionFiscal;}

    public void setDireccionFiscal(String DireccionFiscal) {this.DireccionFiscal = DireccionFiscal;}

    public String getIRubro() {return Rubro;}

    public void setRubro(String Rubro) {this.Rubro = Rubro;}

    public String getDireccionWeb() {return DireccionWeb;}

    public void DireccionWeb(String DireccionWeb) {this.DireccionWeb = DireccionWeb;}

    public int getNumeroEmpleadosHombres() {return NumeroEmpleadosHombres;}

    public void setNumeroEmpleadosHombres(int NumeroEmpleadosHombres) {this.NumeroEmpleadosHombres = NumeroEmpleadosMujeres;}

    public int getNumeroEmpleadosMujeres() {return NumeroEmpleadosMujeres;}

    public void setNumeroEmpleadosMujeres(int NumeroEmpleadosMujeres) {this.NumeroEmpleadosMujeres = NumeroEmpleadosMujeres;}

    public Sucursal getsucursal() {return sucursal;}

    public void setSucursal(Sucursal sucursal){this.sucursal=sucursal;}
}
