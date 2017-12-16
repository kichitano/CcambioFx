/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgAplicacion;

import PkgNegocios.IniciarSesion;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutionException;
import static java.util.concurrent.Executors.callable;
import static java.util.concurrent.Executors.callable;
import static java.util.concurrent.Executors.callable;
import java.util.concurrent.FutureTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 *
 * @author Gary
 */
public class LoginController implements Initializable {
        
    @FXML
    private Label LblCerrar;
    @FXML
    private JFXTextField TxtUsuario;
    @FXML
    private JFXPasswordField TxtPassword;
    @FXML
    private JFXButton BtnIngresar;
    
    
    public LoginController(){}
    
    @FXML
    private void handleClose() {
        LblCerrar.setOnMousePressed((event) -> {
                    System.exit(0);
                });        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void iniciarSesion(ActionEvent ae) throws InterruptedException, ExecutionException{
               
        BtnIngresar.setOnMouseClicked((event) -> {
            
            IniciarSesion iniciarSesion = new IniciarSesion(TxtUsuario.getText(), TxtPassword.getText());
            FutureTask<Boolean> futureTask = new FutureTask<>(iniciarSesion);
            Thread t=new Thread(futureTask);
            t.start();
            Boolean result = null;
            
            try {
                result = futureTask.get(); // will wait for the async completion
            } catch (InterruptedException | ExecutionException ie) {}
            
            if(result){     
                FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuDesign.fxml"));
                Parent root = null;
                
                try {
                    root = loader.load();
                } catch (IOException ex) {}
                
                Scene scene = new Scene(root);
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(scene);
                stage.show();
            }
            
        });
        
       
    }
}
