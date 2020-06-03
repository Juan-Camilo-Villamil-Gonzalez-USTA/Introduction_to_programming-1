package usta.sistemas;

import java.io.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        File myFile = new File ("d:/names.txt");
        // para saber si el archivo no existe, devuelve true o false
        System.out.println("file.exists(): " + myFile.exists());
        System.out.println("file.isDirectory(): " + myFile.isDirectory());
        // para saber la fecha de modificación
        System.out.println("file.lastModified(): " + myFile.lastModified());
        // para saber el nombre del archivo
        System.out.println("file.getName(): " + myFile.getName());
        // para saber la ruta
         System.out.println("file.getPath(): " + myFile.getPath());
        // para saber el tamaño en bytes que ocupa en disco
        System.out.println("file.length(): " + myFile.length()+" bytes");
        // para saber si es de lectura, devuelve true o false
        System.out.println("file.canRead():" + myFile.canRead());

        //File newfolder = new File("D:/carpeta con archivos año mío");
        //System.out.println(newfolder.mkdir());

        // si fuera un directorio, para saber los archivos que contiene
        File carpeta = new File("D:/carpeta_con_archivos");
        System.out.println("----listado archivos D:/carpeta_archivos------");
        for (String archivo : carpeta.list()) {
            System.out.println(archivo);
        }

        //agregar una linea nueva a un archivo existente (METODO 1)
        /*try {
            //abra el archivo , TRUE en un forma append (agregar nuevos valores)
            FileWriter myFile2 = new FileWriter("d:/names.txt", true);
            //cargar en memora ram del SO el contenido del archivo
            BufferedWriter dataFile = new BufferedWriter(myFile2);
            //agregar una nueva linea
            dataFile.write("\nnueva linea tres");
            dataFile.close();

        } catch (IOException e) {
            e.printStackTrace();
        }*/
        //agregar una linea nueva a un archivo existente (METODO 1 optimizado)
        /*try{
            BufferedWriter dataFile = new BufferedWriter(new FileWriter("d:/names.txt",true));
            //agregamos la nueva linea
            dataFile.write("nueva linea sin borrar");
            dataFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        // agregar nueva linea con metodo super optimizado en lineas (METODO FLAHS)
        try{
            PrintWriter myFile3 = new PrintWriter(new BufferedWriter(new FileWriter("d:/names.txt", true)));
            myFile3.println("Otra nueva línea mezclando las dos librerías (PrintWriter + FileWriter) ");
            myFile3.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
