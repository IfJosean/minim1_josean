package edu.upc.dsa.Controlador;

import org.apache.log4j.Logger;


import edu.upc.dsa.Modelo.Usuario;
import edu.upc.dsa.Modelo.Pedido;
import edu.upc.dsa.Modelo.Producto;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

/**
 * Created by Josean on 13/11/2017.
 */
public class ProductManagerImpl implements ProductManager {

    //Declaraciones

    private static ProductManagerImpl instance = null;
    final static Logger logger = Logger.getLogger(ProductManagerImpl.class);
    private Map<Integer, Usuario> map;

    //Singleton

    public static ProductManagerImpl getInstance(){
        if (instance == null) instance = new ProductManagerImpl();
        return instance;
    }

    //Getters and Setters

    public int getPrecio (int id){
        return get(id).setPrecio(getPrecio());
    }

    public boolean getservido (int id){
        return get(id).setServido(getservido());
    }

    //Ordenar productos por precio

    private List<Producto> sortProductosByPrecio(List<Producto> productos){
        productos.sort(Comparator.comparing(Producto::getPrecio));
        return productos;
    }

    //Ordenar productos por número de ventas

    private List<Producto> sortProductosByNumeroventas(List<Producto> productos){
        productos.reverseOrder.sort(Comparator.comparing(Producto::getNumeroventas));
        return productos;
    }

    //Listado pedidos de usuario

    private List<Pedido> Listapedidos(Usuario u){
        u.getPedidos();
    }

    //Servir pedido

    boolean edit(Producto p){

        p.setServido();
        return true;

        /* if(p.getServido() = true){
            return true;
        }

        else{
            map.put(p.getServido(), p);
            return true;
        } */
    }

    //set usuario

    public boolean set(Usuario u) {
        logger.info("set: Creating user: "+u.getId()+" ...");

        if(doExist(u.getId())) {
            logger.warn("set: User: "+u.getName()+" already exists");
            return false;
        }

        else {
            map.put(u.getId(), u);
            logger.info("set: User: "+u.getName()+" has been created!");
            return true;
        }
    }

    //realizar Pedido

    public boolean hacerpedidonuevo(Usuario u, Pedido pd){

        u.setPedidos(u.getName()map.put(pd.getId(), pd));

        //
        return false;
    }

}
