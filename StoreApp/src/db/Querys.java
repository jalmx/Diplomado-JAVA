/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import util.Product;

/**
 *
 * @author josef
 */
public final class Querys {

    private Querys() {
    }

    public static final String ID = "id_product";
    public static final String NAME_PRODUCT = "nombre";
    public static final String TYPE_PRODUCT = "tipo";
    public static final String VALUE_PRODUCT = "cantidad";
    public static final String CODE_PRODUCT = "codigo";
    public static final String STATUS_PRODUCT = "estado";
    public static final String PRICE_PRODUCT = "precio";
    public static final String DESCRIPTION_PRODUCT = "descripcion";

    public static final String[] COLUMNS = {
        ID,
        NAME_PRODUCT,
        TYPE_PRODUCT,
        VALUE_PRODUCT,
        CODE_PRODUCT,
        STATUS_PRODUCT,
        PRICE_PRODUCT,
        DESCRIPTION_PRODUCT
    };

    public static final String NAME_DB = "products.db";
    public static final String NAME_TABLE = "product";
    //tipos de datos para la DB
    public static final String TEXT = " TEXT ";
    public static final String INTEGER = " INTEGER ";
    public static final String DOUBLE = " REAL ";

    public static final String AUTOINCREMENT = " AUTOINCREMENT ";
    public static final String PRIMARY_KEY = " PRIMARY KEY ";

    public static String queryCreateDB() {
        //"CREATE TABLE 'libros' ( _id INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT, cantidad INTEGER); ";

        return String.format(
                "CREATE TABLE %s (%s %s %s %s, %s %s,%s %s,%s %s,%s %s,%s %s,%s %s,%s %s);",
                NAME_TABLE,
                ID, INTEGER, PRIMARY_KEY, AUTOINCREMENT,
                NAME_PRODUCT, TEXT,
                TYPE_PRODUCT, TEXT,
                VALUE_PRODUCT, INTEGER,
                CODE_PRODUCT, TEXT,
                STATUS_PRODUCT, INTEGER,
                PRICE_PRODUCT, DOUBLE,
                DESCRIPTION_PRODUCT, TEXT
        );
    }

    public static String queryDelete(String id) {
        //"DELETE FROM 'libros' WHERE _id = 2"
        return String.format(
                "DELETE FROM %s WHERE %s = %s ;",
                NAME_TABLE, ID, id
        );
    }

    public static String queryUpdate(Product product) {
        //"UPDATE 'libros' SET nombre='matematica', cantidad= 8 WHERE _id= 1";
        return String.format(
                "UPDATE %s SET %s='%s',%s='%s',%s=%d,%s='%s',%s=%d,%s=%f,%s='%s' WHERE %s=%d; ",
                NAME_TABLE,
                NAME_PRODUCT, product.getName(),
                TYPE_PRODUCT, product.getType(),
                VALUE_PRODUCT, product.getCantidad(),
                CODE_PRODUCT, product.getCode(),
                STATUS_PRODUCT, product.getStatus(),
                PRICE_PRODUCT, product.getPrice(),
                DESCRIPTION_PRODUCT, product.getDescription(),
                ID,product.getId()
        );
    }
    
    public static String queryInsert(Product product){
        //"INSERT INTO 'libros'('nombre','cantidad') VALUES ('algebra', 3),('correr',5) ";
        return String.format(
                "INSERT INTO '%s' ('%s','%s','%s','%s','%s','%s','%s') "
                        + "VALUES ('%s','%s',%d,'%s',%d,%f,'%s');",
                NAME_TABLE,
                COLUMNS[1],COLUMNS[2],COLUMNS[3],COLUMNS[4],COLUMNS[5],
                COLUMNS[6],COLUMNS[7],
                product.getName(), product.getType(), product.getCantidad(),
                product.getCode(), product.getStatus(),product.getPrice(),
                product.getDescription()
                );
    }
    
    public static String queryRead(){
        return String.format("SELECT * FROM %s;",NAME_TABLE);
    }

     public static String queryRead(int id){
        return String.format("SELECT * FROM '%s' WHERE %s=%d; ",
                NAME_TABLE,
                ID,
                id
        );
    }
     
     public static String queryRead(String busqueda){
        return String.format(
                "SELECT * FROM '%s' WHERE %s LIKE \'%%%s%%\' OR %s LIKE \'%%%s%%\' OR %s LIKE \'%%%s%%\'; ",
                NAME_TABLE,
                NAME_PRODUCT,
                busqueda,
                TYPE_PRODUCT,
                busqueda,
                CODE_PRODUCT,
                busqueda
                
        );
    }
     
    public static void main(String[] args) {
        System.out.println(queryCreateDB());
        System.out.println(queryDelete("5"));
        System.out.println(
                queryUpdate(
                        new Product(
                                "borrador",
                                "escolar",
                                4,
                                "borrador-vip",
                                1,
                                5.25,
                                "borrador blanco VIP",
                                4
                        )
                )
        );
        System.out.println(queryInsert( new Product(
                                "borrador",
                                "escolar",
                                4,
                                "borrador-vip",
                                1,
                                5.25,
                                "borrador blanco VIP",
                                4
                        )
                ));
        
        System.out.println(queryRead(1));
        
        System.out.println(queryRead("es"));
    }
}
