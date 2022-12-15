package pe.edu.utp.ProyectoFinal.Views.InterfazProveedores;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazProveedores extends JFrame {
    private JTextField txtBuscar;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JButton borrarCamposButton;
    private JButton modificarButton;
    private JButton agregarButton;
    private JButton eliminarButton;
    private JTable tblProveedores;
    private JButton verTodosButton;
    private JPanel jpProveedores;
    private JLabel lblBuscar;
    private JLabel lblIDProveedor;

    public InterfazProveedores() {

        prepararTablaProveedores();
        prepararFormulario();


        txtBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                LogicaModuloProveedores lmp = new LogicaModuloProveedores();
//                lmp.obtenerProveedor();
            }
        });
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void prepararTablaProveedores(){
        DefaultTableModel modelo = (DefaultTableModel)tblProveedores.getModel();

        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("DNI");
        modelo.addColumn("Dirección");
        modelo.addColumn("Email");
        modelo.addColumn("Producto");
        modelo.addColumn("Celular");
        modelo.addColumn("MetodoDePago");

        tblProveedores.setModel(modelo);

    }

    private void prepararFormulario(){
        setContentPane(jpProveedores);
        setTitle("Interfaz Proveedores");
        setSize(600, 400);
        setMinimumSize(new Dimension(915,552));
        setPreferredSize(new Dimension(915,552));
        setMaximumSize(new Dimension(915,552));
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

    }



}
