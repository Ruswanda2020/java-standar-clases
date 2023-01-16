package java_standar_clases;

import java.io.*;
import java.util.Properties;

public class PropertisApp {
    public static void main(String[] args) {


        try {
            Properties properties=new Properties();
            properties.load(new FileInputStream("Aplication.propertis"));

            String host=properties.getProperty("Database.host");
            String port=properties.getProperty("Database.port");
            String username=properties.getProperty("Database.username");
            String password=properties.getProperty("Database.password");

            System.out.println(host);
            System.out.println(port);
            System.out.println(username);
            System.out.println(password);

        }catch (FileNotFoundException exception){
            System.out.println("file tidak ketemu"+exception.getMessage());
        }catch (IOException ioException){
            System.out.println("gagal load data dari file"+ioException.getMessage());
        }

        try {
            Properties properties=new Properties();
            properties.put("name.first","rus");
            properties.put("name.midel","wanda");
            properties.put("name.last","falefi");

            properties.store(new FileOutputStream("name.propertis"),"konfigurasi nama");

        }catch (FileNotFoundException fileNotFoundException){
            System.out.println("eror membuat file propertis"+fileNotFoundException.getMessage());
        }catch (IOException ioException){
            System.out.println("tidak bisa menyimpan file"+ioException.getMessage());
        }

    }
}
