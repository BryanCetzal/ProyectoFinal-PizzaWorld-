package com.app.interfazusuario_wp;
/**
 * Es la clase padre encargada de brindar todos los parámetros del cliente que desee comprar en WorldPizza.
 * @author Bennen Tun & Bryan Cetzal
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cliente {
    /**
     * Para un cliente, se necesitan obtener 3 importantes parametros...
     * numTel: Número telfónico.
     * nomCompl: Nombre completo.
     */
    private String nombre;
    private String correo;
    private String password;
    private Integer telefono;
    private String calle;
    private String colonia;
    private String cruzamiento;
    private String referencia;
    private Scanner scanner;

    public Cliente(String nombre, String correo, String password, Integer telefono, String calle, String colonia, String cruzamiento, String referencia) {
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
        this.telefono = telefono;
        this.calle = calle;
        this.colonia = colonia;
        this.cruzamiento = cruzamiento;
        this.referencia = referencia;
    }

    public Cliente(String nombre, String correo, Integer telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    public Cliente(){
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
        this.telefono = telefono;
        this.calle = calle;
        this.colonia = colonia;
        this.cruzamiento = cruzamiento;
        this.referencia = referencia;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String solicitarNombre() {
        System.out.println("Nombre : ");
        scanner = new Scanner(System.in);
        return scanner.next();
    }

    public String solicitarCorreo(){
        System.out.println("Ingrese su correo: ");
        scanner = new Scanner(System.in);
        return scanner.next();
    }

    public String solicitarPassWord(){
        System.out.println("Ingrese su contraseña: ");
        scanner = new Scanner(System.in);
        return scanner.next();
    }

    public Integer solicitarTelefono(){
        try {
            System.out.println("Ingresa tu numero de telefono: ");
            scanner = new Scanner(System.in);
            return scanner.nextInt();
        }catch(InputMismatchException e2){
            System.out.println("Número de teléfono rechazado, verifique e intentelo de nuevo.\n");
        }
        return null;
    }

    public String solicitarCalle() {
        System.out.println("Calle : ");
        scanner = new Scanner(System.in);
        return scanner.next();
    }

    public String solicitarColonia() {
        System.out.println("Colonia: ");
        scanner = new Scanner(System.in);
        return scanner.next();
    }

    public String solicitarCruzamiento() {
        System.out.println("Cruzamiento: ");
        scanner = new Scanner(System.in);
        return scanner.next();
    }

    public String solicitarReferencia() {
        System.out.println("Referencia: ");
        scanner = new Scanner(System.in);
        return scanner.next();
    }

    public int menuCliente(){
        System.out.println("1.-Agregar Cliente");
        System.out.println("2.- Borrar Datos");
        System.out.println("3.- Modificar Datos");
        System.out.println("4.- Mostrar Datos");
        System.out.println("5.- Salir del menu Cliente");
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    /**
     * Método toString
     * @return Devuelve los parámetros del constructor.
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", password='" + password + '\'' +
                ", telefono=" + telefono +
                ", calle='" + calle + '\'' +
                ", colonia='" + colonia + '\'' +
                ", cruzamiento='" + cruzamiento + '\'' +
                ", referencia='" + referencia + '\'' +
                ", scanner=" + scanner +
                '}';
    }
}
