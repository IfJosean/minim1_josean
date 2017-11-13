package edu.upc.dsa.Controlador;

import edu.upc.dsa.Modelo.Pedido;
import edu.upc.dsa.Modelo.Producto;

import java.util.List;

/**
 * Created by Josean on 13/11/2017.
 */
public interface ProductManager {

    List<Producto> getAll();
    boolean set(Pedido p);
}
