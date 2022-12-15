package pe.edu.utp.ProyectoFinal.Views.InterfazPersonal;

import pe.edu.utp.ProyectoFinal.Models.Empleado;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class InterfazPersonal extends JFrame{
    private JPanel jpPersonal;
    private JLabel lblTitulo;
    private JLabel lblBuscarID;
    private JTextField txtIngresarID;
    private JTable tblPersonal;
    private JButton btnActualizar;
    private JButton btnModificar;
    private JButton btnAgregar;
    private JButton btnEliminar;

    private ArrayList<Empleado> empleados = new ArrayList<>();

    public InterfazPersonal(ArrayList<Empleado> empleados){
        prepararFormulario();
        prepararTablaPersona();




        btnModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JDialog fmModificarEmpleado= new InterfazModificarEmpleado();
                fmModificarEmpleado.setVisible(true);
            }
        });


        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JDialog fmAgregarEmpleado = new InterfazAgregarEmpleado();
                fmAgregarEmpleado.setVisible(true);
            }
        });


        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(null, "¿Estás seguro de quieres eliminar a ....?","Eliminacion de usuario" ,JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            }
        });


        btnActualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }

    private void prepararTablaPersona(){
        DefaultTableModel modelo = (DefaultTableModel)tblPersonal.getModel();

        modelo.addColumn("Codigo Empleado");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido Paterno");
        modelo.addColumn("Apellido Materno");
        modelo.addColumn("DNI");
        modelo.addColumn("Dirección");
        modelo.addColumn("Email");
        modelo.addColumn("Cargo");
        modelo.addColumn("Sucursal");
        modelo.addColumn("Celular");
        modelo.addColumn("Usuario");
        modelo.addColumn("Contraseña");

        tblPersonal.setModel(modelo);

    }

    private void prepararFormulario(){
        setContentPane(jpPersonal);
        setTitle("Interfaz Personal");
        setSize(600, 400);
        setMinimumSize(new Dimension(600,400));
        setPreferredSize(new Dimension(600,400));
        setMaximumSize(new Dimension(600,400));
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

    }


}
