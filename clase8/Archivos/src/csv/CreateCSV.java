/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csv;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author josef
 */
public class CreateCSV {

    public static void main(String[] args) throws IOException {

        if (new File("csv").mkdir()) {
            System.out.println("Creación de carperta para CVS");
        } else {
            System.out.println("ya esta creada la carpeta");
        }

        File csv = new File("csv" + File.separator + "datos.csv");

        System.out.println("El archivo fue creado: " + csv.createNewFile());

        FileWriter write = new FileWriter(csv);

        Random r = new Random();

        write.write("columna 1, columna 2, columna 3\n");

        for (int i = 0; i < 10; i++) {
            write.write(String.format("%d, %d, %d\n", r.nextInt(10), r.nextInt(10), r.nextInt(10)));
        }

        write.close();
        System.out.println("Termino");
    }

}
