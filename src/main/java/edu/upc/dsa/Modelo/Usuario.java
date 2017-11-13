package edu.upc.dsa.Modelo;

import java.util.List;

/**
 * Created by Josean on 13/11/2017.
 */
public class Usuario {

    private int id;

    private String name;

    private List<Pedido> pedidos;

    //Constructor

    public Usuario(List<Pedido> pedidos){
        this.pedidos = pedidos;
    }

    //Getters y Setters

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
