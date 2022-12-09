package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ControladorPizza {
    private Pizza vistaPizza;
    private Pizza pizza;
    private Scanner scanner;

    public ControladorPizza(Pizza vistaPizza){
     this.vistaPizza = vistaPizza;
    }

    public void menuPizza(){
        Pizza pizza1 = new Pizza(10,"Pepperoni", 124.99f,"Ingredientes: Pepperoni y Extra Queso",
                0, "Grande");
        Pizza pizza2= new Pizza(9,"Hawaiana", 150,"La pizza que unos cuestionan pero todos aman. Jamón, piña. Ingredientes: Jamón y Piña",
                0, "Grande");
        Pizza pizza3 = new Pizza(15,"Mexicana", 175,"La pizza con los sabores auténticos de nuestro país. Chorizo, carne molida, jalapeño, cebolla. Ingredientes: Chorizo, Carne Molida, Cebolla y Jalapeño",
                0, "Grande");
        Pizza pizza4 = new Pizza(5,"pastor", 185,"Esta es una pizza...",
                0, "Grande");
        System.out.println("Nuestro menu de Pizzas: ");
        System.out.println("1.-"+pizza1);
        System.out.println("2.-"+pizza2);
        System.out.println("3.-"+pizza3);
        System.out.println("4.-"+pizza4);
    }

    public ArrayList seleccionPizza(){
        int opcion = 1;
        int inventario = 10;
        int cantidad2 = 0;
        int inventario2 = 10;
        int cantidad3 = 0;
        int inventario3 = 10;
        int cantidad4 = 0;
        int inventario4 = 10;
        ArrayList<Pizza> listPizza = new ArrayList<Pizza>();
        int cantidad = 0;
        System.out.println("Para salir de este menu presione 0");
        do {
            System.out.println("Seleccione su pizza: ");
            scanner = new Scanner(System.in);
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    cantidad = cantidad + 1;
                    inventario = inventario -1;
                    break;
                case 2:
                    cantidad2 = cantidad2 + 1;
                    inventario2 = inventario2 -1;
                    break;
                case 3:
                    cantidad3 = cantidad3 + 1;
                    inventario3 = inventario3 -1;
                    break;
                case 4:
                    cantidad4 = cantidad4 + 1;
                    inventario4 = inventario4 -1;
                    break;
                case 0:
                    opcion = 0;
                    break;
                default :
                    System.out.println("Verifique que la opcion sea valida e intente de nuevo");
            }
        }while (opcion != 0);
        Pizza pepperoni = new Pizza(inventario,"Pepperoni", cantidad, 130);
        listPizza.add(pepperoni);
        Pizza mexicana = new Pizza(inventario2,"Mexicana", cantidad2, 130);
        listPizza.add(mexicana);
        Pizza hawaiana = new Pizza(inventario3, "Hawaiana", cantidad3, 120);
        listPizza.add(hawaiana);
        Pizza pastor = new Pizza(inventario4, "Pastor", cantidad4, 140);
        listPizza.add(pastor);
        return listPizza;
    }
}
