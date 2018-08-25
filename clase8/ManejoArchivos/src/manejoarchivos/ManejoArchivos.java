/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivos;

import java.io.File;
import java.util.Arrays;

/**
 *
 * @author josef
 */
public class ManejoArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        File carpeta = new File("mi_carpeta");

        if (carpeta.mkdir()) {//mkdir crea carpeta
            System.out.println("se ha creado la carpeta");
        } else {
            System.out.println("Fallo crear carpeta");
        }

        File file = new File(carpeta.getAbsolutePath() + File.separator + "miArchivo.patito");

        if (file.createNewFile()) {
            System.out.println("se ha creado el archivo");
        } else {
            System.out.println("fallo crear archivo");
        }

        System.out.println("Nombre del archivo: " + file.getName());
        System.out.println("Ruta absoluta del archivo: " + file.getAbsolutePath());
        System.out.println("Parent: " + file.getParent());
        System.out.println("Ruta del archivo: " + file.getPath());
        System.out.println("Canonical Path: " + file.getCanonicalPath());

        System.out.println("Listado de archivos: " + Arrays.toString(carpeta.list()));

//        file.delete();
//        
//        System.out.println("Listado de archivos: " + Arrays.toString(carpeta.list()));
        String[] archivos = carpeta.list();

        int contador = 0;

        for (String f : archivos) {

            if (f.endsWith(".json")) {
                contador++;
            }
        }
        System.out.printf("Hay %d archivos con extension .json\n", contador);
    }

}
