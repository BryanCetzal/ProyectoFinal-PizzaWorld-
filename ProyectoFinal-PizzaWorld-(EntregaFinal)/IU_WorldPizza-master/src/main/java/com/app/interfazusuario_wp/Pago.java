package com.app.interfazusuario_wp;

import java.util.Scanner;
/**
 * Esta clase almacena los datos de compra y el tipo de compra.
 */
public class Pago {
    private String nombreTitular;
    private Integer numeroTarjeta;
    private int ccv;
    private int mesVencimiento;
    private int yearVencimiento;
    private Scanner scanner;

    public Pago(){
        this.nombreTitular = nombreTitular;
        this.numeroTarjeta = numeroTarjeta;
        this.ccv = ccv;
        this.mesVencimiento = mesVencimiento;
        this.yearVencimiento = yearVencimiento;
    }

    public Pago(String nombreTitular, Integer numeroTarjeta, int ccv, int mesVencimiento, int yearVencimiento) {
        this.nombreTitular = nombreTitular;
        this.numeroTarjeta = numeroTarjeta;
        this.ccv = ccv;
        this.mesVencimiento = mesVencimiento;
        this.yearVencimiento = yearVencimiento;
    }

    public int menuPago(){
        System.out.println("Procedamos con su compra");
        System.out.println("1.-Pago en efectivo");
        System.out.println("2.- Pago con tarjeta debito/credito");
        System.out.println("Seleccione su metodo de pago: ");
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void seleccionPago(int opcion){
        if (opcion == 1 ){
            System.out.println("Muchas gracias por su preferencia, su pedido estara en breve...");
        }else {
            System.out.println("Ingrese los datos de su tarjeta");
            addPago();
        }
    }

    public String solicitarNombreTitular(){
        System.out.println("Titular de la tarjeta: ");
        scanner = new Scanner(System.in);
        return scanner.next();
    }

    public Integer solicitarNumeroTarjeta(){
        System.out.println("Numero de tarjeta: ");
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public int solicitarCCV(){
        System.out.println("Codigo de seguridad: ");
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public int solicitarMesVencimiento(){
        System.out.println("Fecha de expiracion ");
        System.out.println("Mes:");
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public int solitarayearVencimiento(){
        System.out.println("año: ");
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void addPago(){
        Pago pago = new Pago(solicitarNombreTitular(),solicitarNumeroTarjeta(),solicitarCCV(),solicitarMesVencimiento(),
                solitarayearVencimiento());
    }
}
