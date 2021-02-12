package br.com.inmetrics.teste.commons;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesManager {

    public static String getPropertiesValue(String valor){
        Properties prop = new Properties();
        File file = new File("C:\\Program Files\\workspace\\Java\\teste-inmetrics\\src\\test\\java\\br\\com\\inmetrics\\teste\\properties");
        try {
            prop.load(new FileInputStream(file.getAbsolutePath()+"\\application.properties"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(valor);
    }
}
