/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivos;

import java.io.File;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author josef
 */
public class ArchivoCsv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

//        |Datos | valor|
//        |texto |434   |
        Scanner sc = new Scanner(createFileCSV("datos"));

        StringBuilder stringBuilder = new StringBuilder();

        while (sc.hasNext()) {
            stringBuilder.append("| ");
            String renglon = sc.nextLine();// datos, valor
            StringTokenizer token = new StringTokenizer(renglon, ",");

            while (token.hasMoreTokens()) {
                stringBuilder.append(token.nextToken());
                stringBuilder.append("\t");
                stringBuilder.append("|");
            }
            stringBuilder.append("\n");

        }
        System.out.println(stringBuilder);
    }

    public static File createFileCSV(String nameFile) throws Exception {

        File csv = new File(nameFile + ".csv");
        csv.createNewFile();

        System.out.println("Escribiendo archivo");
        FileWriter lapiz = new FileWriter(csv);

        lapiz.write("Dato,Valor\n");

        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            lapiz.write(
                    String.format("dato %d, %d\n", i + 1, random.nextInt(100))
            );
        }

        lapiz.close();
        System.out.println("Archivo terminado");
        return csv;
    }
}
