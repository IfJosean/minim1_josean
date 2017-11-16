package edu.upc.dsa.Controlador;

import org.apache.log4j.Logger;


import edu.upc.dsa.Modelo.Usuario;
import edu.upc.dsa.Modelo.Pedido;
import edu.upc.dsa.Modelo.Producto;

import java.util.*;

/**
 * Created by Josean on 13/11/2017.
 */
public class ProductManagerImpl implements ProductManager {

    //Declaraciones

    private static ProductManagerImpl instance = null;
    final static Logger logger = Logger.getLogger(ProductManagerImpl.class);
    private Queue<Pedido> pedidos;
    private List<Pedido> servidos;

    //Singleton

    public static ProductManagerImpl getInstance(){
        if (instance == null) instance = new ProductManagerImpl();
        return instance;
    }

    //Constructors

    public ProductManagerImpl(){
         this.pedidos = new ArrayQueue<>();
         this.servidos = new ArrayList<>();
    }

    //Getters and Setters

    public Queue<Pedido> getPedidos(){
        return pedidos;
    }

    public List<Pedido> getServidos(){
        return pedidos;
    }

    /* public int getPrecio (int id){
        return get(id).setPrecio(getPrecio());
    }

    public boolean getservido (int id){
        return get(id).setServido(getservido());
    }   */

    //Ordenar productos por precio

    private List<Producto> sortProductosByPrecio(List<Producto> productos){
        productos.sort(Comparator.comparing(Producto::getPrecio))
        return productos;
    }

    //Ordenar productos por número de ventas

    private List<Producto> sortProductosByNumeroventas(List<Producto> productos){
        productos.sort(Comparator.comparing(Producto::getNumeroventas));
        return productos;
    }


    //Servir pedido

    public boolean servirpedido(){

       if(!pedidos.isEmpty()){
           this.servidos.add(this.pedidos.element());
           this.pedidos.remove();

           return true;
       }

       else {
           return false;
       }
    }

    // Lista de pedidos de un usuario

    public List<Pedido> getAllPedidosServidosUsuario(int usuarioid){
        List<Pedido> temp = new ArrayList<>();
        for(Pedido p : this.servidos){
            if(p.getusuarioid() == usuarioid)
                temp.add(p);
        }
        return temp;
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

    public boolean hacerpedido(int usuarioid, List<Producto> productos){

        this.pedidos.add(new Pedido(usuarioid, false, productos));

        return true;
    }

}
