/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgAplicacion;

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

/**
 * FXML Controller class
 *
 * @author Gary
 */
public class MenuController{

    @FXML
    private Button BtnSalir;
    private Button BtnCasaCambio;
    private Button BtnSistema;
    private Button BtnUsuario;
    private Button BtnReportes;

    @FXML
    private VBox dataPane;
    
    public MenuController(){}
      
    public void setDataPane(Node node) throws IOException{
        dataPane.getChildren().setAll(node);
    }
    
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
