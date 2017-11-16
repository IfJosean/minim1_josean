package edu.upc.dsa.Controlador;

import edu.upc.dsa.Modelo.Pedido;
import edu.upc.dsa.Modelo.Producto;

import javax.inject.Singleton;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

import static edu.upc.dsa.Controlador.ProductManagerImpl.*;

/**
 * Created by Josean on 16/11/2017.
 */

@Path("/pedidos")
@Singleton
public class ProductManagerP {


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt(){
        return 1;
    }

    @GET
    @Path("/productos/getAllProductosByPrecio")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Producto> getAllProductosByPrecioP(){
        return getInstance().getAllProductosByPrecio();
    }

    @POST
    @Path("/{id}/hacerpedido")
    public boolean hacerpedidoP(@PathParam("id") int usuarioid, List<Producto> productos) {
        return getInstance().hacerpedido(usuarioid, productos);
    }

    @GET
    @Path("/servir")
    public boolean servirpedido() {
        return getInstance().servirpedido();
    }

    @GET
    @Path("/productos/{id}/getAllPedidosUsuario")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Pedido> getAllPedidosServidosUsuario(@PathParam("id") int usuarioid){
        return getInstance().getAllPedidosServidosUsuario(usuarioid);
    }

    @GET
    @Path("/productos/getAllProductosByNumeroventas")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Producto> getAllProductosByNumeroventasP(){
        return getInstance().getAllProductosByNumeroventas();
    }
}
