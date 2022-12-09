package com.app.interfazusuario_wp;
/**
 * Es la clase que recibe todas las funciones creadas por los demás controladores y catálogos, de manera que se vincule el resto del trabajo.
 */

import java.util.Scanner;

public class ControladorPrincipal {
    Cliente vistaCliente;
    ControladorCliente controladorCliente;
    ControladorPizza vistaPizza;
    ControladorBebida vistaBebida;
    CarritoCompra vistaCarrito;
    Pago vistaPago;

    Principal vistaprincipal;
    Scanner scanner;
    /**
     * Constructor que vincula los controladres Pizza, Bebida, domicilio, Principal y Cliente.
     * @param vistaPizza vincula con ControladorPizza.
     * @param vistaCarrito Vincula con CarritoCompra.
     * @param vistaPago vincula con Pago
     * @param vistaBebida vincula con ControladorBebida
     */


    public ControladorPrincipal(ControladorPizza vistaPizza, ControladorBebida vistaBebida, Principal vistaprincipal, Pago vistaPago,
                                CarritoCompra vistaCarrito) {
        this.vistaPizza = vistaPizza;
        this.vistaBebida = vistaBebida;
        this.vistaprincipal = vistaprincipal;
        this.vistaCliente = vistaCliente;
        this.controladorCliente = controladorCliente;
        this.vistaPago = vistaPago;
        this.vistaCarrito = vistaCarrito;
    }

    public void inicio(){
        int opcion = 0;
        do {
            switch (vistaprincipal.menuPrincipal()){
                case 1:
                    vistaprincipal.solicitarDatos(vistaprincipal.menuEntrega());
                    break;
                case 2:
                    vistaPizza.menuPizza();
                    vistaCarrito.carritoPizza(vistaPizza.seleccionPizza());
                    break;
                case 3:
                    vistaBebida.menuBebida();
                case 4:
                    System.out.println("Su pedido es: ");
                    vistaPago.seleccionPago(vistaPago.menuPago());
                    break;
                case 5:
                    opcion = 5;
                    System.out.println("Vuelva pronto");
                    break;
                default:
                    System.out.println("Verifique que su opcion sea correcta y vuelva a intentalo");
            }
        }while(opcion != 5);
    }
}
