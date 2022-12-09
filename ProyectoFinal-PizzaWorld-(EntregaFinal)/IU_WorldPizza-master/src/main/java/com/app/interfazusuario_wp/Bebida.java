package com.app.interfazusuario_wp;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Es la clase padre encargada de brindar todos los parámetros para la solicitud de bebidas en WorldPizza.
 */
public class Bebida extends Alimento{
    private int cantidad;
    private Scanner scanner;

    public Bebida(Integer cantidadDispo, String nombre, float precio, String descripcion, int cantidad) {
        super(cantidadDispo, nombre, precio, descripcion);
        this.cantidad = cantidad;
    }

    public Bebida(){
        this.cantidad = cantidad;
    }

    public int solicitarCantidad(){
        try {
            System.out.println("Cantidad de Pizzas a comprar: ");
            scanner = new Scanner(System.in);
            return scanner.nextInt();
        }catch(InputMismatchException e1){
            System.out.println("Ingresó un dato inválido, por favor verifique y vuelva a intentarlo.\n");
        }
        return 0;
    }

    @Override
    public String toString() {
        return nombre + "\n" + descripcion +
                "\n" + "$" + precio + "\n";
    }
}
