package pe.edu.utp.ProyectoFinal.InterfacesGraficas.InterfazLogin;

import javax.swing.*;
import java.awt.*;

public class InterfazLogin extends JFrame {


    private JPanel jpLogin;
    private JButton btnIngresar;
    private JTextField tfUsuario;
    private JLabel usuario;
    private JLabel contraseña;
    private JPasswordField pfContraseña;

    public InterfazLogin()  {
        prepararFormulario();


    }


    private void prepararFormulario() {


        setContentPane(jpLogin);
        setTitle("Ingreso al sistema");
        setSize(600, 400);
        setMinimumSize(new Dimension(600,400));
        setPreferredSize(new Dimension(600,400));
        setMaximumSize(new Dimension(600,400));
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public void mostrarFormulario(){
        setVisible(true);
    }



}