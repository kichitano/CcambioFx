/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgAplicacion;

import PkgNegocios.IniciarSesion;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Gary
 */
public class FXMLDocumentController implements Initializable {
        
    @FXML
    private Label label;
    @FXML
    private JFXTextField TxtUsuario;
    @FXML
    private JFXPasswordField TxtPassword;
    
    public FXMLDocumentController(){}
    
    @FXML
    private void handleClose(ActionEvent event) {
        
        System.exit(0);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void iniciarSesion(){
        new Thread(new IniciarSesion(TxtUsuario.getText(), TxtPassword.getText())).start();
    }
}
