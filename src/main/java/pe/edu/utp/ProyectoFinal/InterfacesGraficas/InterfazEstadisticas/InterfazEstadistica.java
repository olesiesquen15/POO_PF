package pe.edu.utp.ProyectoFinal.InterfacesGraficas.InterfazEstadisticas;

import javax.swing.*;
import java.awt.*;

public class InterfazEstadistica extends JFrame{
    private JPanel jpPanelPrincipal;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JButton productoButton;
    private JButton ventasButton;
    private JButton barrasButton;
    private JButton circularButton;
    private JButton exportarButton;

   public InterfazEstadistica(){
       setContentPane(jpPanelPrincipal);
       setTitle("Estadísticas Y Reportes");
       setSize(800, 640);
       setMinimumSize(new Dimension(800, 640));
       setPreferredSize(new Dimension(800, 640));
       setMaximumSize(new Dimension(800, 640));
       setResizable(false);
       setLocationRelativeTo(null);
        setContentPane(jpPanelPrincipal);
        setTitle("Estadisticas");

    }

    public void mostrarFormulario(){
        setVisible(true);
    }

}


