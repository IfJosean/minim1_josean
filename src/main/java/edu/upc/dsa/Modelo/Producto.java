package edu.upc.dsa.Modelo;

/**
 * Created by Josean on 13/11/2017.
 */
public class Producto {

    private int id;
    private String name;
    private int precio;
    private int numeroventas;

    //Constructors

    public Producto(int id, String name, int precio, int numeroventas){
        this.id = id;
        this.name = name;
        this.precio = precio;
        this.numeroventas = numeroventas;
    }

    public Producto(){}

    //Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumeroventas() {
        return numeroventas;
    }

    public void setNumeroventas(int numeroventas) {
        this.numeroventas = numeroventas;
    }
}
