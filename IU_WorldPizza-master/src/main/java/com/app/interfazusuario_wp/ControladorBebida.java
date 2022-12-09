package org.example;


import java.util.ArrayList;
import java.util.Scanner;

public class ControladorBebida {
    private Scanner scanner;
    private Bebida vistaBebida;
    private ArrayList<Bebida> bebList;

    public ControladorBebida(Bebida bebida) {
        this.vistaBebida = bebida;
        bebList = new ArrayList<Bebida>();
    }

    public void menuBebida() {
        Bebida obj1 = new Bebida(100, "Pepsi", 25, "Refresco de sabor cola", 0);
        Bebida obj2 = new Bebida(50, "Coca-Cola", 25, "La competencia del anterior", 0);
        Bebida obj3 = new Bebida(75, "Mundet", 20, "Refresco de Manzana", 0);
        System.out.println("Nuestros refresscos disponibles: ");
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}
