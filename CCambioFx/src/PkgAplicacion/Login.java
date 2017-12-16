    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgAplicacion;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Gary
 */
public class Login extends Application {
    
    @Override
    public void start(Stage loginStage) throws Exception {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginDesign.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        loginStage.setScene(scene);
        loginStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
