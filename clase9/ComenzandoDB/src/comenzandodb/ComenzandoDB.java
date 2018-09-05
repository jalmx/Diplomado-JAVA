package comenzandodb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ComenzandoDB {

    public static void main(String[] args) throws Exception {
        
        Connection conection = null;
        
        conection = DriverManager.getConnection("jdbc:sqlite:prueba.db");
        
        Statement statement = conection.createStatement();
        statement.executeUpdate("CREATE TABLE libros (_id INTEGER PRIMARY KEY AUTOINCREMENT, titulo TEXT, cantidad INTEGER);");
        
        //insertando datos
        statement.execute("INSERT INTO 'libros'('titulo','cantidad') VALUES('Algebra', 4); ");
        statement.execute("INSERT INTO 'libros'('titulo','cantidad') VALUES('Trigonometria', 2); ");
        statement.execute("INSERT INTO 'libros'('titulo','cantidad') VALUES('Electronica', 8); ");
        
        //leer datos
        String queryRead = "SELECT * FROM 'libros';  ";
        ResultSet resultSet = statement.executeQuery(queryRead);
        
        while(resultSet.next()){
            System.out.print("El id:" + resultSet.getInt("_id") + ", ");
            System.out.print("titulo: " + resultSet.getString("titulo") + ", ");
            System.out.print("cantidad:" + resultSet.getInt("cantidad") + "\n");
        }
        
        //actualizar datos
        String queryUpdate = "UPDATE 'libros' SET cantidad=8 WHERE _id=1;";
        statement.executeUpdate(queryUpdate);
        
        System.out.println("******************************");
        
        statement.executeQuery(queryRead);
        
        while(resultSet.next()){
            System.out.print("El id:" + resultSet.getInt("_id") + ", ");
            System.out.print("titulo: " + resultSet.getString("titulo") + ", ");
            System.out.print("cantidad:" + resultSet.getInt("cantidad") + "\n");
        }
        
        //borrar datos
        String queryDelete = "DELETE FROM 'libros' WHERE _id=2 ;";
        statement.execute(queryDelete);
        
        System.out.println("******************************");
        
        statement.executeQuery(queryRead);
        
        while(resultSet.next()){
            System.out.print("El id:" + resultSet.getInt("_id") + ", ");
            System.out.print("titulo: " + resultSet.getString("titulo") + ", ");
            System.out.print("cantidad:" + resultSet.getInt("cantidad") + "\n");
        }
        
        ResultSet uno = statement.executeQuery(
                        "SELECT titulo, cantidad FROM 'libros' WHERE _id= 3;"
                        );
        
        if(conection != null)
            conection.close();
        
    }
    
}
