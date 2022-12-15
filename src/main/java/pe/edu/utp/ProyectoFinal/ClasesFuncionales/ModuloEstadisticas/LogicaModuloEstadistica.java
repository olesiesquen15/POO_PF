package pe.edu.utp.ProyectoFinal.ClasesFuncionales.ModuloEstadisticas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LogicaModuloEstadistica {

    public static String esFechaValida(){
        Date fecha = new Date();
        SimpleDateFormat formato_fecha = new SimpleDateFormat("yyyy");
        return formato_fecha.format(fecha);
    }
}

