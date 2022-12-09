package org.example;

import java.lang.ref.Cleaner;
import java.util.ArrayList;

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

    public void menuCliente(){
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
    }
    private boolean borrarEstudiante(String password) {
        Integer indiceEst = buscarCliente(password);
        if (indiceEst != -1) {
            clientList.remove((int)indiceEst);
            return true;
        } else {
            return false;
        }
    }

    /*



    public boolean modificarNombreEstudiante(Integer matricula) {
        Integer indiceEstudiante = buscarEstudiante(matricula);
        if (indiceEstudiante != -1) {
            vistaEstudiante.imprimirInfoEstudiante(estList.get(indiceEstudiante));
            estList.get(indiceEstudiante).setNombre(vistaEstudiante.solicitarNombre());
            return true;
        } else {
            return false;
        }
    }

    public boolean modificarEdadEstudiante(Integer matricula) {
        Integer indiceEstudiante = buscarEstudiante(matricula);
        if (indiceEstudiante != -1) {
            vistaEstudiante.imprimirInfoEstudiante(estList.get(indiceEstudiante));
            estList.get(indiceEstudiante).setEdad(vistaEstudiante.solicitarEdad());
            return true;
        } else {
            return false;
        }
    }

    public boolean modificarPromedioEstudiante(Integer matricula) {
        Integer indiceEstudiante = buscarEstudiante(matricula);
        if (indiceEstudiante != -1) {
            vistaEstudiante.imprimirInfoEstudiante(estList.get(indiceEstudiante));
            estList.get(indiceEstudiante).setPromedio(vistaEstudiante.solicitarPromedio());
            return true;
        } else {
            return false;
        }
    }

    private void menuModificarEstudiante() {
        int opcion = 0;
        Integer auxMatricula = 0;
        boolean resultado;

        while (opcion != 4) {
            switch (vistaEstudiante.menuModificarEstudiante()) {
                case 1:
                    auxMatricula = vistaEstudiante.solicitarMatricula();
                    resultado = modificarNombreEstudiante(auxMatricula);
                    break;
                case 2:
                    auxMatricula = vistaEstudiante.solicitarMatricula();
                    resultado = modificarEdadEstudiante(auxMatricula);
                    break;
                case 3:
                    auxMatricula = vistaEstudiante.solicitarMatricula();
                    resultado = modificarPromedioEstudiante(auxMatricula);
                    break;
                case 4:
                    opcion = 4;
                    break;
            }
        }
    }*/
}
