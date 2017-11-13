package edu.upc.dsa.Modelo;

import java.util.List;

/**
 * Created by Josean on 13/11/2017.
 */
public class Pedido {

    private List<Producto> productos;

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
}
