package pe.edu.utp.ProyectoFinal.Views.InterfazVentas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class InterfazVentas extends JFrame{
    private JPanel jpVenta;
    private JLabel lblCodigoProducto;
    private JTextField txtCodigoProducto;
    private JLabel lblNombreProducto;
    private JTextField textNombreProducto;
    private JLabel lblStockDisponible;
    private JLabel lblStockD;
    private JLabel lblCantidadPedido;
    private JTextField txtCantidadPedido;
    private JButton btnagregarCarrito;
    private JTable tblProducto;
    private JButton btncancelarVenta;
    private JButton btneliminarProducto;
    private JButton btnvender;
    private JLabel lblTotalProducto;
    private JLabel lblTurnoActual;
    private JLabel lblEmpleado;

    public InterfazVentas() {

        prepararFormulario();
        prepararTablaPersona();
    }
    private void prepararFormulario() {


        setContentPane(jpVenta);
        setTitle("Ingreso al sistema");
        setSize(600, 400);
        setMinimumSize(new Dimension(1280, 650));
        setPreferredSize(new Dimension(1280, 650));
        setMaximumSize(new Dimension(1280, 650));
        setResizable(false);
        setLocationRelativeTo(null);
    }
    public void mostrarFormulario(){
        setVisible(true);
    }

    private void prepararTablaPersona(){

        String[] titulos = {"Numero Producto","Codigo Producto","Nombre de Producto","Precio Unitario","Cantidad","Descuento","Total"};
        DefaultTableModel modelo = new DefaultTableModel(null,titulos) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        modelo.fireTableStructureChanged();
        tblProducto.getTableHeader().setReorderingAllowed(false);
        tblProducto.getTableHeader().setResizingAllowed(false);
        tblProducto.setModel(modelo);
    }

    }

