package pe.edu.utp.ProyectoFinal.Views.InterfazConfiguracion;


import javax.swing.*;
import java.awt.*;

public class InterfazConfiguracion extends JFrame {
    private JTextField tfNombreEmpresa;
    private JTextField tfSucursal;
    private JTextField tfSitioWeb;
    private JTextField tfRUC;
    private JButton btnCopiaSeguridad;
    private JButton btnRestaurarCopia;
    private JLabel lblTitulo;
    private JLabel nEmpresa;
    private JPanel jpConfiguracion;
    private JLabel nSitioWeb;
    private JLabel nRUC;
    private JButton btnAceptar;

    public InterfazConfiguracion(){
        prepararFormulario();
    }


    public void prepararFormulario() {
        setContentPane(jpConfiguracion);
        setTitle("Configuración del sistema");
        setSize(600, 400);
        setMinimumSize(new Dimension(600,480));
        setPreferredSize(new Dimension(600,480));
        setMaximumSize(new Dimension(600,480));
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public void mostrarFormulario(){
        setVisible(true);
    }



}
