package archivos;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class CrearArchivo {

    public static void main(String[] args) throws Exception {
        
        File carpeta = new File("carperta");
        if (carpeta.mkdir()) {
            System.out.println("se creo la carpeta");
        } else {
            System.out.println("No se pudo crear la carpeta");
        }

        File miArchivo = new File(carpeta.getAbsolutePath() + File.separator +"archivo.txt");

        if (miArchivo.createNewFile()) {
            System.out.println("Archivo creado");
            System.out.println(miArchivo.getAbsolutePath());
        } else {
            System.out.println("No se pudo crear");
        }

        FileWriter writer = new FileWriter(miArchivo);

        for (int i = 0; i < 10; i++) {
            writer.write(String.format("mensaje %d\n", i + 1));
        }
        writer.close();

        StringBuilder builder = new StringBuilder();
        Scanner sc = new Scanner(miArchivo);
        
        while(sc.hasNext()){
            System.out.println(sc.nextLine());
        }

        sc.close();
    }

}
