/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iniciodb;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author josef
 */
public class InicioDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        
        //se crea la db si no existe
        Connection conection = DriverManager.getConnection("jdbc:sqlite:sample.db");
        
        //Crear tabla
        String sqlCrearTabla = "CREATE TABLE 'libros' ( _id INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT, cantidad INTEGER) ";
        Statement statement = conection.createStatement();
        
        statement.execute(sqlCrearTabla);//ejecutando query
        
        //insertando datos
        String sqlInsertar = "INSERT INTO 'libros'('nombre','cantidad') VALUES ('algebra', 3),('correr',5) ";
        statement.execute(sqlInsertar);
        
        //Leer los datos
        String readQuery = "SELECT * FROM 'libros'";
        ResultSet resultSet = statement.executeQuery(readQuery);
        
        while(resultSet.next()){
            System.out.print("ID: " + resultSet.getInt("_id"));
            System.out.print(", Nombre: " + resultSet.getString("nombre"));
            System.out.println(", Cantidad: " + resultSet.getInt("cantidad"));
        }
        
        //actualiza datos
        String actualizar = "UPDATE 'libros' SET nombre='matematica', cantidad= 8 WHERE _id= 1";
        statement.executeUpdate(actualizar);
        
        //borrar datos
        String eliminarQuery = "DELETE FROM 'libros' WHERE _id = 2";
        statement.execute(eliminarQuery);
        
        conection.close();
        
        
    }
    
}
