package com.example.demo;

public class Tienda {

    private int id;
    private String producto;
    private int precio;

    public Tienda() {

    }

    public Tienda(int id, String producto, int precio) {

        this.id = id;
        this.producto = producto;
        this.precio = precio;

    }

    public int getId() {
        return id;
    }

    public String getProducto() {
        return producto;
    }

    public int getPrecio() {
        return precio;
    }

}
