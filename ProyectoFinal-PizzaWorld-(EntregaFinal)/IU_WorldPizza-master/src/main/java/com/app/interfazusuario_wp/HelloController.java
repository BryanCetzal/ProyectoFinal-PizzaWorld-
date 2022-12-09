package com.app.interfazusuario_wp;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
public class HelloController implements Initializable {
    ObservableList<String> ComboIDContent =
            FXCollections.observableArrayList("1", "2", "3", "4", "5");
    ObservableList<String> ComboIDMes =
            FXCollections.observableArrayList("01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12");
    ObservableList<String> ComboIDAno =
            FXCollections.observableArrayList("22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35");

    @FXML
    private RadioButton PagoVentanilla;
    @FXML
    private RadioButton PagoLinea;
    private int numOrden = 1;
    private int cantidadPizza = 0;
    private int cantidadRefresco = 0;
    private int precioP1 = 0, precioP2 = 0, precioP3 = 0, precioP4 = 0;
    private boolean orderBandera;
    private boolean domicilioGuardado;
    private boolean entregaDomicilio;
    private boolean entregaTienda;
    private int precioR1 = 0, precioR2 = 0, precioR3 = 0, precioR4 = 0;
    private int POrden1 = 0, POrden2 = 0, POrden3 = 0, POrden4 = 0, PTotal = 0;
    @FXML
    private Label precioOrden1, precioOrden2, precioOrden3, precioOrden4;
    @FXML
    private Label pizzaElegida, pizzaElegida1, pizzaElegida2, pizzaElegida3, pizzaElegida4;
    @FXML
    private Label refrescoElegido, refrescoElegido1, refrescoElegido2, refrescoElegido3, refrescoElegido4;
    @FXML
    private Label pizzaElegidaPrecio1, pizzaElegidaPrecio2, pizzaElegidaPrecio3, pizzaElegidaPrecio4;
    @FXML
    private Label refrescoElegidoPrecio1, refrescoElegidoPrecio2, refrescoElegidoPrecio3, refrescoElegidoPrecio4;
    @FXML
    private ComboBox cantidadPizza1, cantidadPizza2, cantidadPizza3, cantidadPizza4, Mes, Ano;
    @FXML
    private ComboBox cantidadRefresco1, cantidadRefresco2, cantidadRefresco3, cantidadRefresco4;
    @FXML
    private Button continuarPago, tipodeOrden, editarDatos, botonPagar;
    @FXML
    private Label precioTotal;
    @FXML
    private Label ordenElegido;
    @FXML
    private Label domicilio;
    @FXML
    private Label Hecho;
    @FXML
    private AnchorPane logoPanel;
    @FXML
    private AnchorPane menuPanel;

    @FXML
    private AnchorPane orderDomiPanel;

    @FXML
    private AnchorPane carPanel;

    @FXML
    private AnchorPane menuPizzasPanel;

    @FXML
    private AnchorPane menuBebidasPanel;

    @FXML
    private AnchorPane orderTiendaPanel;
    @FXML
    private AnchorPane pagoPanel;
    @FXML
    private AnchorPane ModoCompraPanel;
    @FXML
    private TextField nombreCli, nombreCli2;

    @FXML
    private TextField tel, tel2;

    @FXML
    private TextField apellido, apellido2;

    @FXML
    private TextField colonia;

    @FXML
    private TextField calle;

    @FXML
    private TextField numExt;

    @FXML
    private TextField cruz1;

    @FXML
    private TextField cruz2;

    @FXML
    private TextField referencias;
    @FXML
    private VBox CajaPagoLinea;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cantidadPizza1.setItems(ComboIDContent);
        cantidadPizza2.setItems(ComboIDContent);
        cantidadPizza3.setItems(ComboIDContent);
        cantidadPizza4.setItems(ComboIDContent);
        cantidadRefresco1.setItems(ComboIDContent);
        cantidadRefresco2.setItems(ComboIDContent);
        cantidadRefresco3.setItems(ComboIDContent);
        cantidadRefresco4.setItems(ComboIDContent);
        Ano.setItems(ComboIDAno);
        Mes.setItems(ComboIDMes);

        ToggleGroup grupo = new ToggleGroup();
        PagoLinea.setToggleGroup(grupo);
        PagoVentanilla.setToggleGroup(grupo);
    }
    public void exit(MouseEvent event){
        Platform.exit();
        System.exit(0);
    }
    public void main(MouseEvent event){
        logoPanel.setVisible(true);

        menuPanel.setVisible(false);
        ModoCompraPanel.setVisible(false);
        carPanel.setVisible(false);
        orderTiendaPanel.setVisible(false);
        orderDomiPanel.setVisible(false);
        menuPizzasPanel.setVisible(false);
        menuBebidasPanel.setVisible(false);
        pagoPanel.setVisible(false);
    }

    public void menu(MouseEvent event){
        menuPanel.setVisible(true);

        logoPanel.setVisible(false);
        ModoCompraPanel.setVisible(false);
        carPanel.setVisible(false);
        orderTiendaPanel.setVisible(false);
        orderDomiPanel.setVisible(false);
        menuPizzasPanel.setVisible(false);
        menuBebidasPanel.setVisible(false);
        pagoPanel.setVisible(false);
    }
            public void menuPiz(MouseEvent event){
                menuPizzasPanel.setVisible(true);

                logoPanel.setVisible(false);
                ModoCompraPanel.setVisible(false);
                carPanel.setVisible(false);
                orderTiendaPanel.setVisible(false);
                orderDomiPanel.setVisible(false);
                menuPanel.setVisible(false);
                menuBebidasPanel.setVisible(false);
            }
            public void menuBeb(MouseEvent event){
                menuBebidasPanel.setVisible(true);

                logoPanel.setVisible(false);
                ModoCompraPanel.setVisible(false);
                carPanel.setVisible(false);
                orderTiendaPanel.setVisible(false);
                orderDomiPanel.setVisible(false);
                menuPizzasPanel.setVisible(false);
                menuPanel.setVisible(false);
            }
    public void order(MouseEvent event){
        ModoCompraPanel.setVisible(true);

        logoPanel.setVisible(false);
        menuPanel.setVisible(false);
        carPanel.setVisible(false);
        orderTiendaPanel.setVisible(false);
        orderDomiPanel.setVisible(false);
        menuPizzasPanel.setVisible(false);
        menuBebidasPanel.setVisible(false);
        pagoPanel.setVisible(false);
    }
            public void entregaDomi(MouseEvent event){
                orderDomiPanel.setVisible(true);

                logoPanel.setVisible(false);
                menuPanel.setVisible(false);
                ModoCompraPanel.setVisible(false);
                orderTiendaPanel.setVisible(false);
                carPanel.setVisible(false);
                menuPizzasPanel.setVisible(false);
                menuBebidasPanel.setVisible(false);

                if(!entregaDomicilio){
                    domicilio.setText("Sin datos de orden.");
                }

                entregaDomicilio = true;
                entregaTienda = false;

                domicilio.setVisible(true);
                editarDatos.setVisible(true);
                tipodeOrden.setVisible(false);

                ordenElegido.setText("Entregar a domicilio.");
                orderBandera = true;
            }
            public void entregaTienda(MouseEvent event){
                orderTiendaPanel.setVisible(true);

                logoPanel.setVisible(false);
                menuPanel.setVisible(false);
                ModoCompraPanel.setVisible(false);
                carPanel.setVisible(false);
                orderDomiPanel.setVisible(false);
                menuPizzasPanel.setVisible(false);
                menuBebidasPanel.setVisible(false);

                domicilio.setVisible(true);
                editarDatos.setVisible(true);
                tipodeOrden.setVisible(false);

                if(!entregaTienda){
                    domicilio.setText("Sin datos de orden.");
                }

                entregaDomicilio = false;
                entregaTienda = true;

                ordenElegido.setText("Entregar en Tienda.");
                orderBandera = true;
            }
    public void car(MouseEvent event){
        carPanel.setVisible(true);

        logoPanel.setVisible(false);
        menuPanel.setVisible(false);
        ModoCompraPanel.setVisible(false);
        orderTiendaPanel.setVisible(false);
        orderDomiPanel.setVisible(false);
        menuPizzasPanel.setVisible(false);
        menuBebidasPanel.setVisible(false);
        pagoPanel.setVisible(false);
    }
    public void orden1(MouseEvent event){
        numOrden = 1;
        cantidadPizza1.setDisable(false);
        cantidadPizza2.setDisable(true);
        cantidadPizza3.setDisable(true);
        cantidadPizza4.setDisable(true);
        cantidadRefresco1.setDisable(false);
        cantidadRefresco2.setDisable(true);
        cantidadRefresco3.setDisable(true);
        cantidadRefresco4.setDisable(true);

        if(Objects.equals(pizzaElegida1.getText(), "Vacío")){
            pizzaElegida.setText("Ninguna.");
        }else{
            pizzaElegida.setText(pizzaElegida1.getText());
        }
        if(Objects.equals(refrescoElegido1.getText(), "Vacío")){
            refrescoElegido.setText("Ninguno.");
        }else{
            refrescoElegido.setText(refrescoElegido1.getText());
        }
    }
    public void orden2(MouseEvent event){
        cantidadPizza1.setDisable(true);
        cantidadPizza2.setDisable(false);
        cantidadPizza3.setDisable(true);
        cantidadPizza4.setDisable(true);
        cantidadRefresco1.setDisable(true);
        cantidadRefresco2.setDisable(false);
        cantidadRefresco3.setDisable(true);
        cantidadRefresco4.setDisable(true);
        numOrden = 2;
        if(Objects.equals(pizzaElegida2.getText(), "Vacío")){
            pizzaElegida.setText("Ninguna.");
        }else{
            pizzaElegida.setText(pizzaElegida2.getText());
        }
        if(Objects.equals(refrescoElegido2.getText(), "Vacío")){
            refrescoElegido.setText("Ninguno.");
        }else{
            refrescoElegido.setText(refrescoElegido2.getText());
        }
    }
    public void orden3(MouseEvent event){
        cantidadPizza1.setDisable(true);
        cantidadPizza2.setDisable(true);
        cantidadPizza3.setDisable(false);
        cantidadPizza4.setDisable(true);
        cantidadRefresco1.setDisable(true);
        cantidadRefresco2.setDisable(true);
        cantidadRefresco3.setDisable(false);
        cantidadRefresco4.setDisable(true);
        numOrden = 3;
        if(Objects.equals(pizzaElegida3.getText(), "Vacío")){
            pizzaElegida.setText("Ninguna.");
        }else{
            pizzaElegida.setText(pizzaElegida3.getText());
        }
        if(Objects.equals(refrescoElegido3.getText(), "Vacío")){
            refrescoElegido.setText("Ninguno.");
        }else{
            refrescoElegido.setText(refrescoElegido3.getText());
        }
    }
    public void orden4(MouseEvent event){
        cantidadPizza1.setDisable(true);
        cantidadPizza2.setDisable(true);
        cantidadPizza3.setDisable(true);
        cantidadPizza4.setDisable(false);
        cantidadRefresco1.setDisable(true);
        cantidadRefresco2.setDisable(true);
        cantidadRefresco3.setDisable(true);
        cantidadRefresco4.setDisable(false);
        numOrden = 4;
        if(Objects.equals(pizzaElegida4.getText(), "Vacío")){
            pizzaElegida.setText("Ninguna.");
        }else{
            pizzaElegida.setText(pizzaElegida4.getText());
        }
        if(Objects.equals(refrescoElegido4.getText(), "Vacío")){
            refrescoElegido.setText("Ninguno.");
        }else{
            refrescoElegido.setText(refrescoElegido4.getText());
        }
    }

    public void orderPiMex(MouseEvent event)  {
        if (!domicilioGuardado){
            ModoCompraPanel.setVisible(true);
            menuPanel.setVisible(false);
            menuPizzasPanel.setVisible(false);
            menuBebidasPanel.setVisible(false);
        }


        valorACantidadPizza();
        precioP1 = 130 * cantidadPizza;
        precioP2 = 130 * cantidadPizza;
        precioP3 = 130 * cantidadPizza;
        precioP4 = 130 * cantidadPizza;

        if (numOrden == 1){
            pizzaElegida1.setText("Pizza Mexicana.");
            pizzaElegida.setText(pizzaElegida1.getText());
            pizzaElegidaPrecio1.setText("$" + precioP1 + ".00");
        }
        if (numOrden == 2){
            pizzaElegida2.setText("Pizza Mexicana.");
            pizzaElegida.setText(pizzaElegida2.getText());
            pizzaElegidaPrecio2.setText("$" + precioP2 + ".00");
        }
        if (numOrden == 3){
            pizzaElegida3.setText("Pizza Mexicana.");
            pizzaElegida.setText(pizzaElegida3.getText());
            pizzaElegidaPrecio3.setText("$" + precioP3 + ".00");
        }
        if (numOrden == 4){
            pizzaElegida4.setText("Pizza Mexicana.");
            pizzaElegida.setText(pizzaElegida4.getText());
            pizzaElegidaPrecio4.setText("$" + precioP4 + ".00");
        }
        sumarPrecioOrden();
        orderBandera = true;
    }
    public void orderPiHaw(MouseEvent event)  {
        if (!domicilioGuardado){
            ModoCompraPanel.setVisible(true);
            menuPizzasPanel.setVisible(false);
            menuBebidasPanel.setVisible(false);
        }

        valorACantidadPizza();
        precioP1 = 120 * cantidadPizza;
        precioP2 = 120 * cantidadPizza;
        precioP3 = 120 * cantidadPizza;
        precioP4 = 120 * cantidadPizza;

        if (numOrden == 1){
            pizzaElegida1.setText("Pizza Hawaiana.");
            pizzaElegida.setText(pizzaElegida1.getText());
            pizzaElegidaPrecio1.setText("$" + precioP1 + ".00");
        }
        if (numOrden == 2){
            pizzaElegida2.setText("Pizza Hawaiana.");
            pizzaElegida.setText(pizzaElegida2.getText());
            pizzaElegidaPrecio2.setText("$" + precioP2 + ".00");
        }
        if (numOrden == 3){
            pizzaElegida3.setText("Pizza Hawaiana.");
            pizzaElegida.setText(pizzaElegida3.getText());
            pizzaElegidaPrecio3.setText("$" + precioP3 + ".00");
        }
        if (numOrden == 4){
            pizzaElegida3.setText("Pizza Hawaiana.");
            pizzaElegida.setText(pizzaElegida4.getText());
            pizzaElegidaPrecio4.setText("$" + precioP4 + ".00");
        }
        sumarPrecioOrden();
        orderBandera = true;
    }

    public void orderPiPep(MouseEvent event)  {
        if (!domicilioGuardado){
            ModoCompraPanel.setVisible(true);
            menuPanel.setVisible(false);
            menuPizzasPanel.setVisible(false);
        }

        valorACantidadPizza();
        precioP1 = 130 * cantidadPizza;
        precioP2 = 130 * cantidadPizza;
        precioP3 = 130 * cantidadPizza;
        precioP4 = 130 * cantidadPizza;

        if (numOrden == 1){
            pizzaElegida1.setText("Pizza de Pepperoni.");
            pizzaElegida.setText(pizzaElegida1.getText());
            pizzaElegidaPrecio1.setText("$" + precioP1 + ".00");
        }
        if (numOrden == 2){
            pizzaElegida2.setText("Pizza de Pepperoni.");
            pizzaElegida.setText(pizzaElegida2.getText());
            pizzaElegidaPrecio2.setText("$" + precioP2 + ".00");
        }
        if (numOrden == 3){
            pizzaElegida3.setText("Pizza de Pepperoni.");
            pizzaElegida.setText(pizzaElegida3.getText());
            pizzaElegidaPrecio3.setText("$" + precioP3 + ".00");
        }
        if (numOrden == 4){
            pizzaElegida4.setText("Pizza de Pepperoni.");
            pizzaElegida.setText(pizzaElegida4.getText());
            pizzaElegidaPrecio4.setText("$" + precioP4 + ".00");
        }
        sumarPrecioOrden();
        orderBandera = true;
    }

    public void orderPiPas(MouseEvent event)  {
        if (!domicilioGuardado){
            ModoCompraPanel.setVisible(true);
            menuPanel.setVisible(false);
            menuPizzasPanel.setVisible(false);
        }

        valorACantidadPizza();
        precioP1 = 140 * cantidadPizza;
        precioP2 = 140 * cantidadPizza;
        precioP3 = 140 * cantidadPizza;
        precioP4 = 140 * cantidadPizza;
        if (numOrden == 1){
            pizzaElegida1.setText("Pizza de Pástor.");
            pizzaElegida.setText(pizzaElegida1.getText());
            pizzaElegidaPrecio1.setText("$" + precioP1 + ".00");
        }
        if (numOrden == 2){
            pizzaElegida2.setText("Pizza de Pástor.");
            pizzaElegida.setText(pizzaElegida2.getText());
            pizzaElegidaPrecio2.setText("$" + precioP2 + ".00");
        }
        if (numOrden == 3){
            pizzaElegida3.setText("Pizza de Pástor.");
            pizzaElegida.setText(pizzaElegida3.getText());
            pizzaElegidaPrecio3.setText("$" + precioP3 + ".00");
        }
        if (numOrden == 4){
            pizzaElegida4.setText("Pizza de Pástor.");
            pizzaElegida.setText(pizzaElegida4.getText());
            pizzaElegidaPrecio4.setText("$" + precioP4 + ".00");
        }
        sumarPrecioOrden();
        orderBandera = true;
    }
    public void orderRefCo(MouseEvent event)  {
        refrescoElegido.setText("Coca-Cola.");

        valorACantidadRefresco();

        if (numOrden == 1){
            precioR1 = 25 * cantidadRefresco;
            refrescoElegido1.setText("Coca-Cola.");
            refrescoElegido.setText(refrescoElegido1.getText());
            refrescoElegidoPrecio1.setText("$" + precioR1 + ".00");
        }
        if (numOrden == 2){
            precioR2 = 25 * cantidadRefresco;
            refrescoElegido2.setText("Coca-Cola.");
            refrescoElegido.setText(refrescoElegido2.getText());
            refrescoElegidoPrecio2.setText("$" + precioR2 + ".00");
        }
        if (numOrden == 3){
            precioR3 = 25 * cantidadRefresco;
            refrescoElegido3.setText("Coca-Cola.");
            refrescoElegido.setText(refrescoElegido3.getText());
            refrescoElegidoPrecio3.setText("$" + precioR3 + ".00");
        }
        if (numOrden == 4){
            precioR4 = 25 * cantidadRefresco;
            refrescoElegido4.setText("Coca-Cola.");
            refrescoElegido.setText(refrescoElegido4.getText());
            refrescoElegidoPrecio4.setText("$" + precioR4 + ".00");
        }
        sumarPrecioOrden();
        orderBandera = true;
    }
    public void orderRefPep(MouseEvent event)  {
        valorACantidadRefresco();

        if (numOrden == 1){
            precioR1 = 25 * cantidadRefresco;
            refrescoElegido1.setText("Pepsi.");
            refrescoElegido.setText(refrescoElegido1.getText());
            refrescoElegidoPrecio1.setText("$" + precioR1 + ".00");
        }
        if (numOrden == 2){
            precioR2 = 25 * cantidadRefresco;
            refrescoElegido2.setText("Pepsi.");
            refrescoElegido.setText(refrescoElegido2.getText());
            refrescoElegidoPrecio2.setText("$" + precioR2 + ".00");
        }
        if (numOrden == 3){
            precioR3 = 25 * cantidadRefresco;
            refrescoElegido3.setText("Pepsi.");
            refrescoElegido.setText(refrescoElegido3.getText());
            refrescoElegidoPrecio3.setText("$" + precioR3 + ".00");
        }
        if (numOrden == 4){
            precioR4 = 25 * cantidadRefresco;
            refrescoElegido4.setText("Pepsi.");
            refrescoElegido.setText(refrescoElegido4.getText());
            refrescoElegidoPrecio4.setText("$" + precioR4 + ".00");
        }
        sumarPrecioOrden();
        orderBandera = true;
    }
    public void orderRefMun(MouseEvent event)  {
        valorACantidadRefresco();
        if (numOrden == 1){
            precioR1 = 20 * cantidadRefresco;
            refrescoElegido1.setText("Mundet.");
            refrescoElegido.setText(refrescoElegido1.getText());
            refrescoElegidoPrecio1.setText("$" + precioR1 + ".00");
        }
        if (numOrden == 2){
            precioR2 = 20 * cantidadRefresco;
            refrescoElegido2.setText("Mundet.");
            refrescoElegido.setText(refrescoElegido2.getText());
            refrescoElegidoPrecio2.setText("$" + precioR2 + ".00");
        }
        if (numOrden == 3){
            precioR3 = 20 * cantidadRefresco;
            refrescoElegido3.setText("Mundet.");
            refrescoElegido.setText(refrescoElegido3.getText());
            refrescoElegidoPrecio3.setText("$" + precioR3 + ".00");
        }
        if (numOrden == 4){
            precioR4 = 20 * cantidadRefresco;
            refrescoElegido4.setText("Mundet.");
            refrescoElegido.setText(refrescoElegido4.getText());
            refrescoElegidoPrecio4.setText("$" + precioR4 + ".00");
        }
        sumarPrecioOrden();
        orderBandera = true;
    }

    public void valorACantidadPizza(){
     if(numOrden == 1){
         if((cantidadPizza1.getSelectionModel().getSelectedItem() == "1") || (cantidadPizza1.getPromptText().equals("1"))){cantidadPizza = 1;}
         if((cantidadPizza1.getSelectionModel().getSelectedItem() == "2")){cantidadPizza = 2;}
         if((cantidadPizza1.getSelectionModel().getSelectedItem() == "3")){cantidadPizza = 3;}
         if((cantidadPizza1.getSelectionModel().getSelectedItem() == "4")){cantidadPizza = 4;}
         if((cantidadPizza1.getSelectionModel().getSelectedItem() == "5")){cantidadPizza = 5;}
     }
     if(numOrden == 2){
         if((cantidadPizza2.getSelectionModel().getSelectedItem() == "1") || (cantidadPizza2.getPromptText().equals("1"))){cantidadPizza = 1;}
         if((cantidadPizza2.getSelectionModel().getSelectedItem() == "2")){cantidadPizza = 2;}
         if((cantidadPizza2.getSelectionModel().getSelectedItem() == "3")){cantidadPizza = 3;}
         if((cantidadPizza2.getSelectionModel().getSelectedItem() == "4")){cantidadPizza = 4;}
         if((cantidadPizza2.getSelectionModel().getSelectedItem() == "5")){cantidadPizza = 5;}
     }
     if(numOrden == 3){
         if((cantidadPizza3.getSelectionModel().getSelectedItem() == "1") || (cantidadPizza3.getPromptText().equals("1"))){cantidadPizza = 1;}
         if((cantidadPizza3.getSelectionModel().getSelectedItem() == "2")){cantidadPizza = 2;}
         if((cantidadPizza3.getSelectionModel().getSelectedItem() == "3")){cantidadPizza = 3;}
         if((cantidadPizza3.getSelectionModel().getSelectedItem() == "4")){cantidadPizza = 4;}
         if((cantidadPizza3.getSelectionModel().getSelectedItem() == "5")){cantidadPizza = 5;}
     }
     if(numOrden == 4){
         if((cantidadPizza4.getSelectionModel().getSelectedItem() == "1") || (cantidadPizza4.getPromptText().equals("1"))){cantidadPizza = 1;}
         if((cantidadPizza4.getSelectionModel().getSelectedItem() == "2")){cantidadPizza = 2;}
         if((cantidadPizza4.getSelectionModel().getSelectedItem() == "3")){cantidadPizza = 3;}
         if((cantidadPizza4.getSelectionModel().getSelectedItem() == "4")){cantidadPizza = 4;}
         if((cantidadPizza4.getSelectionModel().getSelectedItem() == "5")){cantidadPizza = 5;}
     }
     }
     public void actualizarPrecioPizza(ActionEvent event){
        if(numOrden == 1){
            if(pizzaElegida1.getText().equals("Pizza Mexicana.")){
                precioP1 = 130;
            }else if(pizzaElegida1.getText().equals("Pizza Hawaiana.")){
                precioP1 = 120;
            }else if(pizzaElegida1.getText().equals("Pizza de Pepperoni.")){
                precioP1 = 130;
            }else if(pizzaElegida1.getText().equals("Pizza de Pástor.")){
                precioP1 = 140;
            }else{
                precioP1 = 0;
            }
        }
         if(numOrden == 2){
             if(pizzaElegida2.getText().equals("Pizza Mexicana.")){
                 precioP2 = 130;
             }else if(pizzaElegida2.getText().equals("Pizza Hawaiana.")){
                 precioP2 = 120;
             }else if(pizzaElegida2.getText().equals("Pizza de Pepperoni.")){
                 precioP2 = 130;
             }else if(pizzaElegida2.getText().equals("Pizza de Pástor.")){
                 precioP2 = 140;
             }else{
                 precioP2 = 0;
             }
         }
         if(numOrden == 3){
             if(pizzaElegida3.getText().equals("Pizza Mexicana.")){
                 precioP3 = 130;
             }else if(pizzaElegida3.getText().equals("Pizza Hawaiana.")){
                 precioP3 = 120;
             }else if(pizzaElegida3.getText().equals("Pizza de Pepperoni.")){
                 precioP3 = 130;
             }else if(pizzaElegida3.getText().equals("Pizza de Pástor.")){
                 precioP3 = 140;
             }else{
                 precioP3 = 0;
             }
         }
         if(numOrden == 4){
             if(pizzaElegida4.getText().equals("Pizza Mexicana.")){
                 precioP4 = 130;
             }else if(pizzaElegida4.getText().equals("Pizza Hawaiana.")){
                 precioP4 = 120;
             }else if(pizzaElegida4.getText().equals("Pizza de Pepperoni.")){
                 precioP4 = 130;
             }else if(pizzaElegida4.getText().equals("Pizza de Pástor.")){
                 precioP4 = 140;
             }else{
                 precioP4 = 0;
             }
         }
        valorACantidadPizza();
        precioP1 = precioP1 * cantidadPizza;
        precioP2 = precioP2 * cantidadPizza;
        precioP3 = precioP3 * cantidadPizza;
        precioP4 = precioP4 * cantidadPizza;
         if (numOrden == 1){
             pizzaElegidaPrecio1.setText("$" + precioP1 + ".00");
         }
         if (numOrden == 2){
             pizzaElegidaPrecio2.setText("$" + precioP2 + ".00");
         }
         if (numOrden == 3){
             pizzaElegidaPrecio3.setText("$" + precioP3 + ".00");
         }
         if (numOrden == 4){
             pizzaElegidaPrecio4.setText("$" + precioP4 + ".00");
         }
         sumarPrecioOrden();
     }
    public void actualizarPrecioRefresco(ActionEvent event){
        if(numOrden == 1){
            if(refrescoElegido1.getText().equals("Coca-Cola.")){
                precioR1 = 25;
            }else if(refrescoElegido1.getText().equals("Pepsi.")){
                precioR1 = 25;
            }else if(refrescoElegido1.getText().equals("Mundet.")){
                precioR1 = 20;
            }else{
                precioR1 = 0;
            }
        }
        if(numOrden == 2){
            if(refrescoElegido2.getText().equals("Coca-Cola.")){
                precioR2 = 25;
            }else if(refrescoElegido2.getText().equals("Pepsi.")){
                precioR2 = 25;
            }else if(refrescoElegido2.getText().equals("Mundet.")){
                precioR2 = 20;
            }else{
                precioR2 = 0;
            }
        }
        if(numOrden == 3){
            if(refrescoElegido3.getText().equals("Coca-Cola.")){
                precioR3 = 25;
            }else if(refrescoElegido3.getText().equals("Pepsi.")){
                precioR3 = 25;
            }else if(refrescoElegido3.getText().equals("Mundet.")){
                precioR3 = 20;
            }else{
                precioR3 = 0;
            }
        }
        if(numOrden == 4){
            if(refrescoElegido4.getText().equals("Coca-Cola.")){
                precioR4 = 25;
            }else if(refrescoElegido4.getText().equals("Pepsi.")){
                precioR4 = 25;
            }else if(refrescoElegido4.getText().equals("Mundet.")){
                precioR4 = 20;
            }else{
                precioR4 = 0;
            }
        }
        valorACantidadRefresco();
        precioR1 = precioR1 * cantidadRefresco;
        precioR2 = precioR2 * cantidadRefresco;
        precioR3 = precioR3 * cantidadRefresco;
        precioR4 = precioR4 * cantidadRefresco;

        if (numOrden == 1){
            refrescoElegidoPrecio1.setText("$" + precioR1 + ".00");
        }
        if (numOrden == 2){
            refrescoElegidoPrecio2.setText("$" + precioR2 + ".00");
        }
        if (numOrden == 3){
            refrescoElegidoPrecio3.setText("$" + precioR3 + ".00");
        }
        if (numOrden == 4){
            refrescoElegidoPrecio4.setText("$" + precioR4 + ".00");
        }
        sumarPrecioOrden();
    }
    public void sumarPrecioOrden(){
        PTotal = 0;
        if(numOrden == 1){
            POrden1 = precioP1 + precioR1;
            precioOrden1.setText("$" + POrden1 + ".00");
        }
        if(numOrden == 2){
            POrden2 = precioP2 + precioR2;
            precioOrden2.setText("$" + POrden2 + ".00");
        }
        if(numOrden == 3){
            POrden3 = precioP3 + precioR3;
            precioOrden3.setText("$" + POrden3 + ".00");
        }
        if(numOrden == 4){
            POrden4 = precioP4 + precioR4;
            precioOrden4.setText("$" + POrden4 + ".00");
        }
        PTotal = POrden1 + POrden2 + POrden3 + POrden4;
        precioTotal.setText("$" + PTotal + ".00");
    }
    public void valorACantidadRefresco(){
        if(numOrden == 1){
            if((cantidadRefresco1.getSelectionModel().getSelectedItem() == "1") || (cantidadRefresco1.getPromptText().equals("1"))){cantidadRefresco = 1;}
            if((cantidadRefresco1.getSelectionModel().getSelectedItem() == "2")){cantidadRefresco = 2;}
            if((cantidadRefresco1.getSelectionModel().getSelectedItem() == "3")){cantidadRefresco = 3;}
            if((cantidadRefresco1.getSelectionModel().getSelectedItem() == "4")){cantidadRefresco = 4;}
            if((cantidadRefresco1.getSelectionModel().getSelectedItem() == "5")){cantidadRefresco = 5;}
        }
        if(numOrden == 2){
            if((cantidadRefresco2.getSelectionModel().getSelectedItem() == "1") || (cantidadRefresco2.getPromptText().equals("1"))){cantidadRefresco = 1;}
            if((cantidadRefresco2.getSelectionModel().getSelectedItem() == "2")){cantidadRefresco = 2;}
            if((cantidadRefresco2.getSelectionModel().getSelectedItem() == "3")){cantidadRefresco = 3;}
            if((cantidadRefresco2.getSelectionModel().getSelectedItem() == "4")){cantidadRefresco = 4;}
            if((cantidadRefresco2.getSelectionModel().getSelectedItem() == "5")){cantidadRefresco = 5;}
        }
        if(numOrden == 3){
            if((cantidadRefresco3.getSelectionModel().getSelectedItem() == "1") || (cantidadRefresco3.getPromptText().equals("1"))){cantidadRefresco = 1;}
            if((cantidadRefresco3.getSelectionModel().getSelectedItem() == "2")){cantidadRefresco = 2;}
            if((cantidadRefresco3.getSelectionModel().getSelectedItem() == "3")){cantidadRefresco = 3;}
            if((cantidadRefresco3.getSelectionModel().getSelectedItem() == "4")){cantidadRefresco = 4;}
            if((cantidadRefresco3.getSelectionModel().getSelectedItem() == "5")){cantidadRefresco = 5;}
        }
        if(numOrden == 4){
            if((cantidadRefresco4.getSelectionModel().getSelectedItem() == "1") || (cantidadRefresco4.getPromptText().equals("1"))){cantidadRefresco = 1;}
            if((cantidadRefresco4.getSelectionModel().getSelectedItem() == "2")){cantidadRefresco = 2;}
            if((cantidadRefresco4.getSelectionModel().getSelectedItem() == "3")){cantidadRefresco = 3;}
            if((cantidadRefresco4.getSelectionModel().getSelectedItem() == "4")){cantidadRefresco = 4;}
            if((cantidadRefresco4.getSelectionModel().getSelectedItem() == "5")){cantidadRefresco = 5;}
        }
    }

    public void borrarOrden(){
        pizzaElegida.setText("Ninguna.");
        refrescoElegido.setText("Niguno.");
        if(numOrden == 1){
            pizzaElegida1.setText("Vacío");
            refrescoElegido1.setText("Vacío");
            pizzaElegidaPrecio1.setText("$0.00");
            refrescoElegidoPrecio1.setText("$0.00");
            precioOrden1.setText("$0.00");
            PTotal = PTotal - POrden1;
            precioTotal.setText("$" + PTotal + ".00");
            POrden1 = 0;
            precioR1 = 0;
            precioP1 = 0;
        }
        if(numOrden == 2){
            pizzaElegida2.setText("Vacío");
            refrescoElegido2.setText("Vacío");
            pizzaElegidaPrecio2.setText("$0.00");
            refrescoElegidoPrecio2.setText("$0.00");
            precioOrden2.setText("$0.00");
            PTotal = PTotal - POrden2;
            precioTotal.setText("$" + PTotal + ".00");
            POrden2 = 0;
            precioR2 = 0;
            precioP2 = 0;
        }
        if(numOrden == 3){
            pizzaElegida3.setText("Vacío");
            refrescoElegido3.setText("Vacío");
            pizzaElegidaPrecio3.setText("$0.00");
            refrescoElegidoPrecio3.setText("$0.00");
            precioOrden3.setText("$0.00");
            PTotal = PTotal - POrden3;
            precioTotal.setText("$" + PTotal + ".00");
            POrden3 = 0;
            precioR3 = 0;
            precioP3 = 0;
        }
        if(numOrden == 4){
            pizzaElegida4.setText("Vacío");
            refrescoElegido4.setText("Vacío");
            pizzaElegidaPrecio4.setText("$0.00");
            refrescoElegidoPrecio4.setText("$0.00");
            precioOrden4.setText("$0.00");
            PTotal = PTotal - POrden4;
            precioTotal.setText("$" + PTotal + ".00");
            POrden4 = 0;
            precioR4 = 0;
            precioP4 = 0;
        }
    }
    public void guardar(MouseEvent event){
        domicilioGuardado = true;
        continuarPago.setDisable(false);
        domicilio.setText("Nombre: " + nombreCli.getText() + " " + apellido.getText() + "\n" +
                "Teléfono: " + tel.getText() + "\n" +
                "Dirección: Colonia " + colonia.getText() + ", calle " + calle.getText() + " #" + numExt.getText() + " entre " +
                cruz1.getText() + " y " + cruz2.getText() + "\n" +
                "Referencias: " + referencias.getText());
    }

    public void editarDatosOrden(){
        if(entregaTienda){
            carPanel.setVisible(false);
            orderTiendaPanel.setVisible(true);
        }
        if(entregaDomicilio){
            carPanel.setVisible(false);
            orderDomiPanel.setVisible(true);
        }
    }
    public void guardar2(MouseEvent event){
        domicilioGuardado = true;
        continuarPago.setDisable(false);
        domicilio.setText("Nombre: " + nombreCli2.getText() + " " + apellido2.getText() + "\n" +
                "Teléfono: " + tel2.getText());
    }
    public void guardarPago(MouseEvent event){
        Hecho.setVisible(true);
    }
    public void verVentanaPago(MouseEvent event){
        pagoPanel.setVisible(true);
        carPanel.setVisible(false);
    }
    public void desbloquearPagoLinea(MouseEvent event){
        CajaPagoLinea.setDisable(false);
        botonPagar.setVisible(true);
    }
    public void desbloquearPagoVentanilla(MouseEvent event){
        CajaPagoLinea.setDisable(true);
        botonPagar.setVisible(true);
    }
}