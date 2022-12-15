package pe.edu.utp.ProyectoFinal.InterfacesGraficas.InterfazPersonal;

import javax.swing.*;

public class InterfazModificarEmpleado extends JDialog {
    private JLabel lblModificarEmpleado;
    private JLabel lblIDEmpleado;
    private JLabel lblNombre;
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
    private JTextField txtIngresarIDEmpleado;
    private JTextField txtIngresarNombre;
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
    private JLabel lblAdministrar;
    private JCheckBox cbVentas;
    private JCheckBox cbInventario;
    private JCheckBox cbPersonal;
    private JCheckBox cbProveedores;
    private JCheckBox cbEstadisticasYReportes;
    private JCheckBox cbHistorialDeVentas;
    private JCheckBox cbConfiguracion;
    private JButton btnGuardar;
    private JPanel jpModificarEmpleado;

    public InterfazModificarEmpleado(){
        prepararFormulario();
    }

    private void prepararFormulario(){
        setContentPane(jpModificarEmpleado);
        setTitle("Agregar Empleado");
        setSize(600, 580);
        setLocationRelativeTo(null);
        setModal(true);

    }

    public void mostrarFormulario(){
        setVisible(true);
    }
}
