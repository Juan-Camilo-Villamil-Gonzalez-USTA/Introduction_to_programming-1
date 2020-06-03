package usta.sistemas;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        // creamos un objeto tipo file, el constructor recibe la ruta del archivo del cual quiero saber sus propiedades
        File file = new File("D:/names.txt");
        // para saber si el archivo no existe, devuelve true o false
        System.out.println("file.exists(): " + file.exists());
        // para saber si directorio, devuelve true o false
        System.out.println("file.isDirectory(): " + file.isDirectory());
        // para saber la fecha de modificación
        System.out.println("file.lastModified(): " + file.lastModified());
        // para saber el nombre del archivo
        System.out.println("file.getName(): " + file.getName());
        // para saber la ruta
        System.out.println("file.getPath(): " + file.getPath());
        // para saber el tamaño en bytes que ocupa en disco
        System.out.println("file.length(): " + file.length()+" bytes");
        // para saber si es de lectura, devuelve true o false
        System.out.println("file.canRead():" + file.canRead());

        // ejemplo: "C:\\archivos\\estudiantes" y crea el directorio estudiantes

        File newfolder = new File("D:/carpeta_archivos");
        System.out.println(newfolder.mkdir());
        // elimina el arhivo o directorio (debe estar vacio), devuelve true o false
         System.out.println(newfolder.delete());

        // si fuera un directorio, para saber los archivos que contiene
        File carpeta = new File("D:/carpeta_archivos");
        System.out.println("----listado archivos D:/carpeta_archivos------");
        for (String archivo : carpeta.list()) {
            System.out.println(archivo);
        }
    }
}
