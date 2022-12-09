package com.app.interfazusuario_wp;

import java.util.ArrayList;
/**
 * Es la clase padre encargada de almacenar todas las compras que se desean realizar.
 */
public class CarritoCompra {
    private float total;

    public CarritoCompra() {
        this.total = total;
    }

    public void carritoPizza(ArrayList pizza){
        Object pepperoni = pizza.get(0);
        Object mexicana = pizza.get(1);
        Object hawaina = pizza.get(2);
        Object pastor = pizza.get(3);
    }

    public float totalPizzas(int cantidad, float precio){
        total= cantidad * precio;
        return total;
    }

    public float totalRefrescos(int cantidad, float precio){
        total= cantidad * precio;
        return total;
    }

    public float totalTotal(float totPizza, float totRefresco){
        total = totPizza + totRefresco;
        return total;
    }

    public void imprimirOrden(){
        System.out.println();
    }


}
