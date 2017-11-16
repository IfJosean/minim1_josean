package edu.upc.dsa.Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Josean on 13/11/2017.
 */
public class Pedido {

    private List<Producto> productos;
    private int usuarioid;

    //Constructor

    public Pedido(int usuarioid, boolean servido, List<Producto> productos){
        this.usuarioid = usuarioid;
        this.productos = productos;
    }

    public Pedido(){
        this.productos = new ArrayList<>();
    }

    //Getters and Setters

    public int getUsuarioid() {
        return usuarioid;
    }

    public void setUsuarioid(int usuarioid) {
        this.usuarioid = usuarioid;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos){
        this.productos = productos;
    }

    public Producto getProducto(int id){
        return this.productos.get(id);
    }

    public void setProducto(Producto producto){
        this.productos.add(producto);
    }

}
