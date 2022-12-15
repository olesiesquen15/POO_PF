package pe.edu.utp.ProyectoFinal.Views.InterfazHistorialVentas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class InterfazHistorialVentas extends JFrame{
    private JTextField txtIngresarRangoDeFechaInicial;
    private JTextField txtIngresarRangoDeFechaFinal;
    private JTextField txtIngresarNroVenta;
    private JButton btnGenerarReporteVentasTotales;
    private JButton btnGenerarReporteProductosVendidos;
    private JTable tblVentasTotales;
    private JTable tblProductosVendidos;
    private JLabel lblBuscarNroVenta;
    private JLabel lblBuscarRangoDeFecha;
    private JLabel lblVentasTotales;
    private JLabel lblAl;
    private JLabel lblTotalVentas;
    private JLabel lblRellenoTotalVentas;
    private JLabel lblProductosVendidos;
    private JPanel jpHistorialVentas;


    public InterfazHistorialVentas() {

        prepararFormulario();
        prepararTablaVentasTotales();
        preparaTablaProductosVendidos();

        mostrarFormulario();
    }
    private void prepararFormulario() {


        setContentPane(jpHistorialVentas);
        setTitle("Historial de VentasI");
        setSize(600, 400);
        setMinimumSize(new Dimension(1600, 650));
        setPreferredSize(new Dimension(1600, 650));
        setMaximumSize(new Dimension(1600, 650));
        setResizable(false);
        setLocationRelativeTo(null);
    }
    public void mostrarFormulario(){
        setVisible(true);
    }

    private void prepararTablaVentasTotales(){

        String[] titulos = {"Número de Venta","Nro Productos","Cajero en Turno",
                "Fecha de Venta","Monto Total","Monto Devuelto","Monto Ganado"};
        DefaultTableModel modelo = new DefaultTableModel(null,titulos) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        modelo.fireTableStructureChanged();
        tblVentasTotales.getTableHeader().setReorderingAllowed(false);
        tblVentasTotales.getTableHeader().setResizingAllowed(false);
        tblVentasTotales.setModel(modelo);
    }

    private void preparaTablaProductosVendidos(){

        String[] titulos = {"ID Producto", "Nombre de Producto", "Precio Unitario", "Cantidad","Descuento","Número Venta", "Fecha De Venta","Total"};
        DefaultTableModel modelo = new DefaultTableModel(null,titulos) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        modelo.fireTableStructureChanged();
        tblProductosVendidos.getTableHeader().setReorderingAllowed(false);
        tblProductosVendidos.getTableHeader().setResizingAllowed(false);
        tblProductosVendidos.setModel(modelo);
    }


}
