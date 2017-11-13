package edu.upc.dsa.Controlador;

import edu.upc.dsa.Modelo.Pedido;
import edu.upc.dsa.Modelo.Producto;
import edu.upc.dsa.Modelo.Usuario;
import org.apache.log4j.Logger;
import org.junit.*;


/**
 * Created by Josean on 13/11/2017.
 */
public class ProductManagerTest {

    private final static Logger logger = Logger.getLogger(ProductManagerTest.class);

    private Usuario usuario1;
    private Usuario usuario2;

    private Producto producto1;
    private Producto producto2;

    private Pedido pedido1;
    private Pedido pedido2;
    private Pedido pedido3;

    @Before //Junit4
    public void setUp() throws Exception {

        usuario1 = new Usuario(0001, "Josean", null );
        usuario2 = new Usuario(0002, "nojosean", null);

        producto1 = new Producto(10, "LeCroissant", 5, 125);
        producto2 = new Producto(11, "IlCapuccino", 10, 500);

        pedido1 = new Pedido(20, <11, 10>, true);

        usuario1.setPedidos();
        usuario2.setPedidos();


        getInstance().set(usuario1);
        getInstance().set(usuario2);
    }

    @After //Junit4
    public void tearDown(){

        usuario1 = null;
        usuario2 = null;

        producto1 = null;
        producto2 = null;

        pedido1 = null;

        getInstance().getMap().clear();
    }

    @Test
    public void TestHacerPedido(){}

    @Test
    public void TestServirPedido(){

        pedido1.setServido();
        pedido1.setServido()=true;
    }

}
