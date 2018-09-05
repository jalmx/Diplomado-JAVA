/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author josef
 */
public class Product {
    
    private String name;
    private String type;
    private int cantidad;
    private String code;
    private int status;
    private double price;
    private String description;
    private int id;

    public Product(String name, String type, int cantidad, String code, int status, double price, String description, int id) {
        this.name = name;
        this.type = type;
        this.cantidad = cantidad;
        this.code = code;
        this.status = status;
        this.price = price;
        this.description = description;
        this.id = id;
    }

    public Product(String name, String type, int cantidad, String code, int status, double price, String description) {
        this.name = name;
        this.type = type;
        this.cantidad = cantidad;
        this.code = code;
        this.status = status;
        this.price = price;
        this.description = description;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public Product setType(String type) {
        this.type = type;
        return this;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Product setCantidad(int cantidad) {
        this.cantidad = cantidad;
        return this;
    }

    public String getCode() {
        return code;
    }

    public Product setCode(String code) {
        this.code = code;
        return this;
    }

    public int getStatus() {
        return status;
    }

    public Product setStatus(int status) {
        this.status = status;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Product setPrice(double price) {
        this.price = price;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Product setDescription(String description) {
        this.description = description;
        return this;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", type=" + type + ", cantidad=" + cantidad + ", code=" + code + ", status=" + status + ", price=" + price + ", description=" + description + ", id=" + id + '}';
    }
    
}
