/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgAplicacion;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Gary
 */
public class MenuController implements Initializable {

    @FXML
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
    public MenuController(){}
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        HamburgerBackArrowBasicTransition burgertask = new HamburgerBackArrowBasicTransition(hamburguer);
        burgertask.setRate(-1);
        hamburguer.addEventHandler(MouseEvent.MOUSE_PRESSED,(e)-> {
        
        burgertask.setRate(burgertask.getRate()* -1);;
        burgertask.play();
        });
    }

    @FXML
    private void AbrirCasaCambio() {
        
    }
    
    @FXML
    private void AbrirUsuarios() {
        
    }
    
    @FXML
    private void AbrirSistemaCambio() {    
    }
    
    @FXML
    private void AbrirReportes() {
        
    }    
    
}
