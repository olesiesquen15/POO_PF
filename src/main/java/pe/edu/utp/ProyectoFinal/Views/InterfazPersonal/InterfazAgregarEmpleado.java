package pe.edu.utp.ProyectoFinal.Views.InterfazPersonal;

import javax.swing.*;

public class InterfazAgregarEmpleado extends JDialog {

    private JPanel jpAgregarEmpleado;
    private JLabel lblAgregarEmpleado;
    private JTextField txtIngresarIDEmpleado;
    private JLabel lblIDEmpleado;
    private JLabel lblNombre;
    private JTextField txtIngresarNombre;
    private JLabel lblApellidoPaterno;
    private JLabel lblApellidoMaterno;
    private JLabel lblDNI;
    private JLabel lblDireccion;
    private JLabel lblEmail;
    private JLabel lblIDCargo;
    private JLabel lblIDSucursal;
    private JLabel lblCelular;
    private JLabel lblIDUsuario;
    private JLabel lblContraseia;
    private JLabel lblAdministrar;
    private JCheckBox cbVentas;
    private JCheckBox cbInventario;
    private JCheckBox cbPersonal;
    private JCheckBox cbProveedores;
    private JTextField txtIngresarApellidoPaterno;
    private JTextField txtIngresarApellidoMaterno;
    private JTextField txtIngresarDNI;
    private JTextField txtIngresarDireccion;
    private JTextField txtIngresarEmail;
    private JTextField txtIngresarIDCargo;
    private JTextField txtIngresarIDSucursal;
    private JTextField txtIngresarCelular;
    private JTextField txtIngresarIDUsuario;
    private JTextField txtIngresarContraseia;
    private JCheckBox cbHistorialDeVentas;
    private JCheckBox cbEstadisticasYReportes;
    private JCheckBox cbConfiguracion;
    private JButton btnAgregar;

    public InterfazAgregarEmpleado(){
        prepararFormulario();
    }

    private void prepararFormulario(){
        setContentPane(jpAgregarEmpleado);
        setTitle("Agregar Empleado");
        setSize(600, 580);
        setLocationRelativeTo(null);
        setModal(true);


    }

    public void mostrarFormulario(){
        setVisible(true);
    }
}
