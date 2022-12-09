package org.example;

import java.util.Scanner;

public class Bebida extends Alimento {
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
        System.out.println("Cantidad de Pizzas a comprar: ");
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    @Override
    public String toString() {
        return nombre + "\n" + descripcion +
                "\n" + "$" + precio + "\n";
    }
}
