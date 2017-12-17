/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgAplicacion;

import PkgNegocios.DescargarDatos;
import java.io.IOException;
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
    
    public void start() throws IOException{
        DescargarDatos descargarDatos = new DescargarDatos();
        Thread thread = new Thread(descargarDatos);
        thread.start();
    }
    
    public void setDataPane(Node node) throws IOException{
        dataPane.getChildren().setAll(node);
        start();
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

    @FXML
    public void AbrirMenuCasaCambio(ActionEvent event) throws IOException {
        setDataPane(fadeAnimate("/PkgAplicacion/CasaCambioDesign.fxml"));
    }
    
    @FXML
    private void AbrirMenuSistema() {
        
    }
    
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
