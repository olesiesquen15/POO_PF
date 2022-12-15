package pe.edu.utp.ProyectoFinal.Lanzador;

import pe.edu.utp.ProyectoFinal.InterfacesGraficas.InterfazHistorialVentas.InterfazHistorialVentas;
import pe.edu.utp.ProyectoFinal.InterfacesGraficas.InterfazProveedores.InterfazProveedores;

public class LanzadorAplicacion {
    public static void main(String[] args) {




        InterfazProveedores ip = new InterfazProveedores();

        ip.setVisible(true);
    }
}
