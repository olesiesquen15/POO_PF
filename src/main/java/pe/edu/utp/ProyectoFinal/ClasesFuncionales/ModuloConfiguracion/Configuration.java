package pe.edu.utp.ProyectoFinal.ClasesFuncionales.ModuloConfiguracion;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
    private static Configuration instance = null;
    private static Properties properties;
    private static final String configFilePath = System.getProperty("user.dir") + "\\src\\main\\resources\\config.properties";

    public Configuration() {
    }

    public static Configuration getInstance;


    public void setProperty(String key, String value) throws IOException {
        properties.setProperty(key, value);
        properties.store(new FileWriter(configFilePath), (String)null);
    }
}

