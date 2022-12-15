package pe.edu.utp.ProyectoFinal.InterfacesGraficas.InterfazPrincipal;

import javax.swing.*;

public class InterfazPrincipal extends JFrame{
    private JPanel jpPrincipal;
    private JLabel lblTitulo;
    private JLabel lblLogoEmpresa;
    private JLabel lblNombreEmpresa;
    private JButton btnModuloVentas;
    private JButton btnModuloHIstorialDeVentas;
    private JButton btnModuloInventario;
    private JButton btnModuloPersonal;
    private JButton btn;
    private JButton btnModuloEstadísticasYReportes;
    private JButton btnModuloConfiguracion;
    private JButton cerrarElTurnoButton;
    private JLabel lblDate;
    private JLabel lblFecha;



    public void mostrarFormulario(){
        setVisible(true);
    }
}
