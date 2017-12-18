package edu.upc.dsa.Modelo;

import java.util.List;

/**
 * Created by Josean on 13/11/2017.
 */
public class Usuario {

    private int usuarioid;

    private String usuarioname;

    private String password;

    private List<Pedido> usuariopedidos;

    //Constructor

    public Usuario(int usuarioid, String usuarioname){
        this.usuarioid = usuarioid;
        this.usuarioname = usuarioname;
    }

    //Getters y Setters

    public List<Pedido> getPedidos() {
        return usuariopedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.usuariopedidos = pedidos;
    }

    public int getId() {
        return usuarioid;
    }

    public void setId(int id) {
        this.usuarioid = id;
    }

    public String getName() {
        return usuarioname;
    }

    public void setName(String name) {
        this.usuarioname = name;
    }
}


    public Usuario(int usuarioid, String usuarioname, String password) {
                this.usuarioid = usuarioid;
                this.usuarioname = usuarioname;
                this.password = password;
           }

