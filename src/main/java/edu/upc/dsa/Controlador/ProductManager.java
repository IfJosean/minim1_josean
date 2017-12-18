package edu.upc.dsa.Controlador;

import edu.upc.dsa.Modelo.Pedido;
import edu.upc.dsa.Modelo.Producto;
import edu.upc.dsa.Modelo.Usuario;

import java.util.List;

/**
 * Created by Josean on 13/11/2017.
 */
public interface ProductManager {

    boolean hacerpedido (int usuarioid, List<Producto> productos);
    boolean servirpedido ();
    List<Producto> getAllProductosByPrecio();
    List<Pedido> getAllPedidosServidosUsuario(int usuarioid);
    List<Producto> getAllProductosByNumeroventas;
    Usuario login(Usuario u);
}
