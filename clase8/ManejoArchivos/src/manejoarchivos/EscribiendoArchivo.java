/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author josef
 */
public class EscribiendoArchivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        File file = createFile("mensaje", "txt");
        StringBuilder datos = readFile(file);

        System.out.println(datos);
    }

    public static StringBuilder readFile(File source) throws Exception {

        Scanner sc = new Scanner(source);

        StringBuilder stringBuilder = new StringBuilder();

        while (sc.hasNext()) {
            stringBuilder.append(sc.nextLine());
            stringBuilder.append("\n");
        }
        return stringBuilder;
    }

    public static File createFile(String nameFile, String extension) throws Exception {

        File miArchivo = new File(nameFile + "." + extension);

        if (miArchivo.createNewFile()) {
            System.out.println("Se creo el archivo");
        } else {
            System.out.println("Fallo creación");
        }

        FileWriter writer = new FileWriter(miArchivo);

        for (int i = 0; i < 10; i++) {
            writer.write(String.format("\t\"Mensaje %d\"\n", i + 1));
        }

        writer.close();//siempre cerrar el archivo

        return miArchivo;
    }
}
