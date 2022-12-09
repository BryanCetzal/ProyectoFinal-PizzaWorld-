package com.app.interfazusuario_wp;
/**
 * Es la clase padre encargada de brindar todos los parámetros para la solicitud de pizzas en WorldPizza.
 */
import java.util.Scanner;

public class Pizza extends Alimento{
    private int cantidad;
    private String medida;
    private Scanner scanner;

    public Pizza(Integer cantDis, String nom, float precio, String descrip, int cantidad, String medida){
        super(cantDis,nom,precio,descrip);
        this.cantidad = cantidad;
        this.medida = medida;
    }

    public Pizza(Integer catDisp,String nom, int cantidad, float precio){
        super(catDisp, nom, precio);
        this.cantidad = cantidad;
    }
    Pizza(){
        this.cantidad= cantidad;
        this.medida = medida;

    }

    public int solicitarCantidad(){
        System.out.println("Cantidad de Pizzas a comprar: ");
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public String solicitarMedida(){
        System.out.println("Tamaño de la Pizza:");
        scanner= new Scanner(System.in);
        return scanner.next();
    }

    /*Pizza pizza1 = new Pizza(10,"Pepperoni", 124.99f,"Ingredientes: Pepperoni y Extra Queso",
            0, "Grande");
    Pizza pizza2= new Pizza(9,"Hawaiana", 150,"La pizza que unos cuestionan pero todos aman. Jamón, piña. Ingredientes: Jamón y Piña",
            0, "Grande");
    Pizza pizza3 = new Pizza(15,"Mexicana", 175,"La pizza con los sabores auténticos de nuestro país. Chorizo, carne molida, jalapeño, cebolla. Ingredientes: Chorizo, Carne Molida, Cebolla y Jalapeño",
            0, "Grande");
    Pizza pizza4 = new Pizza(5,"pastor", 185,"Esta es una pizza...",
            0, "Grande");

    public int menu(){
        int opcion;
        System.out.println("Las mejores Pizzas al mejor precio");
        System.out.println("1.-"+pizza1);
        System.out.println("2.-"+pizza2);
        System.out.println("3.-"+pizza3);
        System.out.println("4.-"+pizza4);
        System.out.println("Para salir de este menu presione 0");
        System.out.println("Ingrese el/los numero de la pizza que desea: ");
        scanner = new Scanner(System.in);
        opcion = scanner.nextInt();
        msgPizzaAgregada(opcion);
        return opcion;
    }*/

    public void msgPizzaAgregada(int opcion){
        switch (opcion){
            case 1:
                System.out.println("Se ha agregado exitosamente Pepperoni");
                break;
            case 2:
                System.out.println("Se ha agregado exitosamente Hawaiana");
                break;
            case 3:
                System.out.println("Se ha agregado exitosamente Mexicana");
                break;
            case 4:
                System.out.println("Se ha agregado exitosamente Pastor");
                break;
            case 5:
                System.out.println("Espere un momento");
                break;
            case 0:
                System.out.println("Esperamos verlo pronto");
                break;
            default:
                System.out.println("Numero incorrecto intente de nuevo");
                break;
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return /*nombre + "\n" + descripcion + "\n" +
                "$" + precio + "\n";*/
                nombre +"  "+ cantidad +"  "+ precio;
    }
}
