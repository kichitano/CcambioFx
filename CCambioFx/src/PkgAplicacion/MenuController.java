/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgAplicacion;

<<<<<<< HEAD
import PkgNegocios.DescargarDatos;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.util.Duration;
=======
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
>>>>>>> design1.1

/**
 * FXML Controller class
 *
 * @author Gary
 */
public class MenuController{

    @FXML
<<<<<<< HEAD
    private Button BtnSalir;
    private Button BtnCasaCambio;
    private Button BtnSistema;
    private Button BtnUsuario;
    private Button BtnReportes;

    @FXML
    private VBox dataPane;
    
=======
    private JFXHamburger hamburguer;

    @FXML
    private JFXButton BtnSalir;

    @FXML
    private JFXButton BtnCasaCambio;

    @FXML
    private JFXButton BtnSistema;

    @FXML
    private JFXButton BtnUsuario;

    @FXML
    private JFXButton BtnReportes;
>>>>>>> design1.1
    public MenuController(){}
      
    public void setDataPane(Node node) throws IOException{
        dataPane.getChildren().setAll(node);
    }
    
<<<<<<< HEAD
    public VBox fadeAnimate(String url) throws IOException {
        VBox v = (VBox) FXMLLoader.load(getClass().getResource(url));
        FadeTransition ft = new FadeTransition(Duration.millis(400));
        ft.setNode(v);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
        return v;
=======
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        HamburgerBackArrowBasicTransition burgertask = new HamburgerBackArrowBasicTransition(hamburguer);
        burgertask.setRate(-1);
        hamburguer.addEventHandler(MouseEvent.MOUSE_PRESSED,(e)-> {
        
        burgertask.setRate(burgertask.getRate()* -1);;
        burgertask.play();
        });
>>>>>>> design1.1
    }

    
    /* MENU CASA CAMBIO INICIO */
    @FXML
    public void AbrirMenuCasaCambio(ActionEvent event) throws IOException {
        setDataPane(fadeAnimate("/PkgAplicacion/CasaCambioDesign.fxml"));
        DescargarDatos();
        CargarDatosOpciones();
    }
    
    public void DescargarDatos() throws IOException{
        DescargarDatos descargarDatos = new DescargarDatos();
        Thread thread = new Thread(descargarDatos);
        thread.start();
    }
    
    public void CargarDatosOpciones() throws FileNotFoundException{
        String archivo = "Dir/DatosTO/DatosTO.json";
        JsonParser parser = new JsonParser();
        FileReader fr = new FileReader(archivo);
        JsonElement datos = parser.parse(fr);
        final Gson gson = new Gson();
        final Properties propiedades = gson.fromJson(datos, Properties.class);
        
    }
    /* MENU CASA CAMBIO FIN */
    
    /* MENU SISTEMA INICIO */
    @FXML
    private void AbrirMenuSistema() {
        
    }
    /* MENU SISTEMA FIN */
    
    
    @FXML
    private void AbrirMenuUsuario() {    
    }
    
    @FXML
    private void AbrirMenuReportes() {
        
    }    
    
    @FXML
    private void CerrarSesion() {
        
    }
    
}
