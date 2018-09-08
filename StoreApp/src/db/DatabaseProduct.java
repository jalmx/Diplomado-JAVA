/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import util.Product;

public class DatabaseProduct extends DAOHandler<Product> {

    private static DatabaseProduct db = null;
    private Connection connection = null;

    private DatabaseProduct() {
        if (!createDB()) {
            throw new IllegalArgumentException("No se puedo crear la conexión");
        }
        if (!openConnection()) {
            throw new IllegalArgumentException("No se puedo abrir la conexión");
        }
        closeDB();
    }

    public static DatabaseProduct getInstanceDB() {

        if (db == null) {
            db = new DatabaseProduct();
        }
        return db;
    }

    @Override
    public void insert(Product e) {
        try {
            if (openConnection()) {
                Statement st = connection.createStatement();
                st.execute(Querys.queryInsert(e));
                System.out.println("Se guardo el producto");
                closeDB();
            }
        } catch (Exception o) {
            o.printStackTrace();
            System.out.println("Fallo guarda producto");
        }

    }

    @Override
    public Product get(int id) {
        try {
            if (openConnection()) {
                Product p = null;
                Statement st = connection.createStatement();
                ResultSet rs = st.executeQuery(Querys.queryRead(id));
                while (rs.next()) {
                    p = new Product(
                            rs.getString(Querys.COLUMNS[1]),
                            rs.getString(Querys.COLUMNS[2]),
                            rs.getInt(Querys.COLUMNS[3]),
                            rs.getString(Querys.COLUMNS[4]),
                            rs.getInt(Querys.COLUMNS[5]),
                            rs.getDouble(Querys.COLUMNS[6]),
                            rs.getString(Querys.COLUMNS[7]),
                            rs.getInt(Querys.COLUMNS[0])
                    );
                }
                closeDB();
                return p;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return null;
    }

    @Override
    public ArrayList<Product> getAll() {
        ArrayList<Product> products = null;
        try {
            if (openConnection()) {
                products = new ArrayList<>();
                Statement st = connection.createStatement();
                ResultSet rs = st.executeQuery(Querys.queryRead());

                while (rs.next()) {
                    products.add(new Product(
                            rs.getString(Querys.COLUMNS[1]),
                            rs.getString(Querys.COLUMNS[2]),
                            rs.getInt(Querys.COLUMNS[3]),
                            rs.getString(Querys.COLUMNS[4]),
                            rs.getInt(Querys.COLUMNS[5]),
                            rs.getDouble(Querys.COLUMNS[6]),
                            rs.getString(Querys.COLUMNS[7]),
                            rs.getInt(Querys.COLUMNS[0])
                    )
                    );
                }
                closeDB();
                return products;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return products;
    }

    @Override
    public void update(Product e) {
        try {
            if (openConnection()) {
                Statement st = connection.createStatement();
                System.out.println("update");
                System.out.println(e);
                st.execute(Querys.queryUpdate(e));
            }
        } catch (Exception x) {
            x.printStackTrace();
        }

    }

    @Override
    public void delete(int id) {
        try {
            if (openConnection()) {
                Statement st = connection.createStatement();
                st.execute(Querys.queryDelete(String.valueOf(id)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void closeDB() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fallo al cerrar db",
                    "Error DB", JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean openConnection() {
        try {
            connection = DriverManager.
                    getConnection("jdbc:sqlite:" + Querys.NAME_DB);
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    private boolean createDB() {
        File db = new File(Querys.NAME_DB);
        try {
            if (!db.exists()) {
                openConnection();
                String sqlCrearTabla = Querys.queryCreateDB();
                Statement statement = connection.createStatement();
                statement.execute(sqlCrearTabla);//ejecutando query
                closeDB();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
