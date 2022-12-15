package pe.edu.utp.ProyectoFinal;

import net.sourceforge.jtds.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionBD {
    private static Connection instance = null;
    static {
        String connectionString = "jdbc:jtds:sqlserver://%s:1433/%s;"
                + "instance=%s";
        String servidor = "OLENKASIESQUEN";
        String baseDeDatos = "BD_SistemaVentas_e_Inventario";
        String versionBD = "SQLEXPRESS2019";
        String usuario = "sa";
        String contrasena = "123456789";
        try {
            DriverManager.registerDriver(new Driver());
            instance = DriverManager.getConnection(String.format(connectionString,servidor,baseDeDatos,versionBD), usuario, contrasena);
            System.out.println("Conectada a BD");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static Connection getConnection() {
        return instance;
    }

    public static void main(String[] args) {
        Connection con = ConexionBD.getConnection();
    }

}



