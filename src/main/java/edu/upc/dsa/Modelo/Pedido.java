package edu.upc.dsa.Modelo;

import java.util.List;

/**
 * Created by Josean on 13/11/2017.
 */
public class Pedido {

    private int id;
    private List<Producto> productos;
    boolean servido = false;

    //Constructor

    public Pedido(List<Producto> productos){
        this.productos = productos;
    }

    //Getters and Setters

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public servido getServido(){
        return servido;
    }

    public void setServido(boolean servido){
        this.servido = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
