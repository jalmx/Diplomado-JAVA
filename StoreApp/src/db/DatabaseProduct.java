/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import util.Product;

/**
 *
 * @author josef
 */
public class DatabaseProduct extends DAOHandler<Product> {

    private static DatabaseProduct db = null;
    private Connection connection = null;

    private DatabaseProduct() {
        if (!createConnection()) {
            throw new IllegalArgumentException("No se puedo crear la conexión");
        }
        if(!openConnection()){
            throw new IllegalArgumentException("No se puedo abrir la conexión");
        }
        
    }

    private boolean createConnection() {
        return createDB();
    }

    public static DatabaseProduct getInstanceDB() {

        if (db == null) {
            db = new DatabaseProduct();
        }
        return db;
    }

    @Override
    public void insert(Product e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Product> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Product e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void closeDB() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fallo al cerrar db","Error DB", JOptionPane.ERROR_MESSAGE);
        }

    }

    private boolean openConnection() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:products.db");
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    private boolean createDB() {
        File db = new File("products.db");
        try {
            if (!db.exists()) {
                openConnection();
                String sqlCrearTabla = "CREATE TABLE 'libros' ( _id INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT, cantidad INTEGER) ";
                Statement statement = connection.createStatement();
                boolean status = statement.execute(sqlCrearTabla);//ejecutando query
                closeDB();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
