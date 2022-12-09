package com.app.interfazusuario_wp;

import java.util.ArrayList;
/**
 * Esta clase hace funcionar a la clase CatalogoCliente y al CatalogoDomicilio.
 */
public class ControladorCliente {
    ArrayList<Cliente> clientList;
    Cliente vistaCliente;
    Cliente clienteDomicilio;
    Cliente clienteRestaurante;

    ControladorCliente(Cliente vistaCliente) {
        clientList = new ArrayList<Cliente>();
        this.vistaCliente= vistaCliente;
    }

    public void addClienteDomicilio(){
        clienteDomicilio = new Cliente(vistaCliente.solicitarNombre(),vistaCliente.solicitarCorreo(),vistaCliente.solicitarPassWord(),
                vistaCliente.solicitarTelefono(),vistaCliente.solicitarCalle(),vistaCliente.solicitarColonia(),
                vistaCliente.solicitarCruzamiento(), vistaCliente.solicitarReferencia());
    }

    public void addClienteRestaurante(){
        clienteRestaurante = new Cliente(vistaCliente.solicitarNombre(),vistaCliente.solicitarCorreo(),
                vistaCliente.solicitarTelefono());
    }

    /*public void menuCliente(){
        int opcion = 0;
        while (opcion != 5){
            switch (vistaCliente.menuCliente()){
                case 1:
                    addClienteDomicilio();
                    break;
                case 2:
                    String aux = vistaCliente.solicitarPassWord();
                    vistaCliente.imprimeInfoBorrado(borrarEstudiante(aux));
                    break;
                case 3:
                    //menuModificarEstudiante();
                    break;
                case 4:
                    //aux = vistaEstudiante.solicitarMatricula();
                    //Integer pos = buscarEstudiante(aux);
                    //vistaEstudiante.imprimirInfoEstudiante(estList.get(pos));
                    break;
                case 5:
                    opcion = 5;
                    break;
            }
        }
    }

    private int buscarCliente(String password) {
        for (int i = 0; i < clientList.size(); i++){
            if (password.equals(clientList.get(i).getPassword())) {
                return i;
            }
        }
        return -1;
    }*/
}
