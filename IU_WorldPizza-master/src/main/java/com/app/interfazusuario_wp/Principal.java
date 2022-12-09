package org.example;

import java.util.Scanner;

public class Principal {
    ControladorCliente controladorCliente;
    Cliente obj1;
    ControladorCliente cliente;
    Scanner scanner;

    public Principal(Cliente obj1,ControladorCliente cliente) {
        this.obj1 = obj1;
        this.cliente = cliente;
    }

    public Principal() {

    }

    public int menuPrincipal(){
        System.out.println("Bienvendio a World-Pizza");
        System.out.println("Seleccione la accion que desea realizar: ");
        System.out.println("1.- Metodo de entrega");
        System.out.println("2.- Menu Pizzas");
        System.out.println("3.- Menu Refrescos");
        System.out.println("4.- Pago");
        System.out.println("5.- Salir");
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public int menuEntrega(){
        System.out.println("Bienvenido a World Pizza");
        System.out.println("Seleccione su metodo de entrega:");
        System.out.println("1.- Servicio a Domicilio: ");
        System.out.println("2.- Recibir en tienda");
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void solicitarDatos(int opcion){
        if(opcion == 1){
            System.out.println("Ingrese los siguientes datos: ");
            cliente.addClienteDomicilio();
    }else{
            System.out.println("Ingrese los siguientes datos: ");
            cliente.addClienteRestaurante();
        }
    }

}
