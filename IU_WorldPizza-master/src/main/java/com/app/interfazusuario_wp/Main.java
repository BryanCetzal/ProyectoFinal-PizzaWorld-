package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*Cliente obj1 = new Cliente();
        ControladorCliente prueba1 = new ControladorCliente(obj1);
        prueba1.menuCliente();*/

        /*Cliente cliente = new Cliente();

        Principal principal = new Principal();
        ControladorPrincipal controladorPrincipal = new ControladorPrincipal(cliente,pizza,principal);
        controladorPrincipal.menuPricipal();*/

        /*
        ControladorBebida controladorBebida = new ControladorBebida(bebida);
        controladorBebida.menuBebida();*/

        CarritoCompra carritoCompra = new CarritoCompra();
        Cliente cliente = new Cliente();
        ControladorCliente controladorCliente = new ControladorCliente(cliente);
        Bebida bebida = new Bebida();
        Pizza pizza = new Pizza();
        Pago pago = new Pago();
        Principal principal = new Principal(cliente, controladorCliente);
        ControladorBebida controladorBebida = new ControladorBebida(bebida);
        ControladorPizza controladorPizza = new ControladorPizza(pizza);
        ControladorPrincipal controladorPrincipal = new ControladorPrincipal(controladorPizza,controladorBebida,principal,
                pago,carritoCompra);
        controladorPrincipal.inicio();

        /*

        ControladorCliente cliente2 = new ControladorCliente(cliente);
        Principal obj1 = new Principal(cliente,cliente2);
        obj1.solicitarDatos(obj1.menuEntrega());*/

        /*ArrayList<Pizza> menuPizza = new ArrayList<Pizza>();
        menuPizza.add(new Pizza(10,"Peperonni", 124.99f,"Ingredientes: Pepperoni y Extra Queso",
                0, "Grande"));
        menuPizza.add(new Pizza(9,"Hawaiana", 150,"La pizza que unos cuestionan pero todos aman. Jamón, piña. Ingredientes: Jamón y Piña",
                0, "Grande"));
        menuPizza.add(new Pizza(15,"Mexicana", 175,"La pizza con los sabores auténticos de nuestro país. Chorizo, carne molida, jalapeño, cebolla. Ingredientes: Chorizo, Carne Molida, Cebolla y Jalapeño",
                0, "Grande"));
        menuPizza.add(new Pizza(5,"pastor", 185,"Esta es una pizza...",
                0, "Grande"));
        for (Alimento x: menuPizza) {
            System.out.println(x);
        }*/



    }
}